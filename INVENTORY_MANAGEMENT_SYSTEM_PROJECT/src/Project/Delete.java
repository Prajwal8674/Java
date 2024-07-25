package Project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Delete {
void delete(){
        JFrame dFrame= new JFrame("Delete");
        dFrame.setSize(670,280);
        JTextField searchbar=new JTextField();
        searchbar.setBounds(60,30,260,30);
        searchbar.setBorder(new LineBorder(Color.BLACK));
        JButton search = new JButton("SEARCH");
        search.setBounds(330,30,120,30);

        JButton dBack = new JButton("BACK");
        dBack.setBounds(460,30,120,30);


        DefaultTableModel ddtm = new DefaultTableModel();
        JTable dtable=new JTable(ddtm);
        ddtm.addColumn(new Object[]{""});
        ddtm.addColumn("");
        ddtm.addColumn("");
        ddtm.addColumn("");

        ddtm.addRow(new Object[]{"ID","PRODUCT NAME","QUANTITY","              ACTION"});
        dtable.setBounds(60,90,520,60);
        dtable.setRowHeight(30);
        dtable.getColumnModel().getColumn(0).setPreferredWidth(8);
        dtable.getColumnModel().getColumn(1).setPreferredWidth(130);
        dtable.getColumnModel().getColumn(2).setPreferredWidth(130);
        dtable.getColumnModel().getColumn(3).setPreferredWidth(180);


        JButton dDel1= new JButton("DELETE");
        dDel1.setBounds(330,35,180,20);
        JDBC djdbc = new JDBC();
dDel1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int find = Integer.parseInt(searchbar.getText());
        try {
            Pojo p2 = new Pojo();
            p2= djdbc.searchById(find);
/*
            ddtm.insertRow(1,new Object[]{p2.getId(),p2.getpName(),p2.getQuantity()});
            System.out.println(p2.getId()+""+p2.getpName()+""+p2.getRate1());
     /*       dtable.add(dDel1);*/

        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
});
    search.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int find  = Integer.parseInt(searchbar.getText());
            try {
                Pojo p2 = new Pojo();
               p2= djdbc.searchById(find);
                        ddtm.insertRow(1,new Object[]{p2.getId(),p2.getpName(),p2.getQuantity()});
                        System.out.println(p2.getId()+""+p2.getpName()+""+p2.getRate1());
                         dtable.add(dDel1);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    });
    dDel1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int find  = Integer.parseInt(searchbar.getText());
Pojo p3 = new Pojo();
                    try {
                        int result = JOptionPane.showConfirmDialog(dFrame,"Do You Want To Delete The Data ?","CONFIRMATION",JOptionPane.YES_NO_OPTION);
if(result==JOptionPane.YES_OPTION){
    djdbc.DelById(find);
    JOptionPane.showMessageDialog(dFrame,"DELETION SUCCESSFUL");
}else if(result==JOptionPane.NO_OPTION){
    JOptionPane.showMessageDialog(dFrame,"DELETION CANCELLED");
}
/*else {
    JOptionPane.showMessageDialog(dFrame,"DELETION CANCELLED");
}*/
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                        });
    dBack.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dFrame.setVisible(false);
            UpdateDelete ud = new UpdateDelete();
            ud.search();
        }
    });
        dFrame.add(dBack);
        dFrame.add(searchbar);
        dFrame.add(search);
        dFrame.add(dtable);
        dFrame.setLayout(null);
        dFrame.setVisible(true);
}
}
