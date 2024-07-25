package Project;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class UpdateDelete extends Frame {
    void search(){
        JFrame udFrame= new JFrame("Update/Delete");
        udFrame.setSize(670,280);
        JTextField searchbar=new JTextField();
        searchbar.setBounds(60,30,260,30);
        searchbar.setBorder(new LineBorder(Color.BLACK));
        JButton search = new JButton("SEARCH");
        search.setBounds(330,30,120,30);

        JButton udBack = new JButton("BACK");
        udBack.setBounds(460,30,120,30);


        DefaultTableModel uddtm = new DefaultTableModel();
        JTable udtable=new JTable(uddtm);
        uddtm.addColumn(new Object[]{""});
        uddtm.addColumn("");
        uddtm.addColumn("");
        uddtm.addColumn("");
        uddtm.addColumn("");


        uddtm.addRow(new Object[]{"ID","PRODUCT NAME","QUANTITY","PRICE","                      ACTION"});
        udtable.setBounds(60,90,520,120);
        udtable.setRowHeight(30);
        udtable.getColumnModel().getColumn(0).setPreferredWidth(5);
        udtable.getColumnModel().getColumn(1).setPreferredWidth(110);
        udtable.getColumnModel().getColumn(2).setPreferredWidth(70);
        udtable.getColumnModel().getColumn(3).setPreferredWidth(90);
        udtable.getColumnModel().getColumn(4).setPreferredWidth(190);



        JButton udEdit1= new JButton("EDIT");
        JButton udDel1= new JButton("DELETE");
        udEdit1.setBounds(330,35,90,20);
        udDel1.setBounds(420,35,90,20);


        udBack.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        udFrame.setVisible(false);
        MainFrame mf= new MainFrame();
        mf.frame1();
    }
});
        JDBC udjdbc = new JDBC();

        search.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
        String find=searchbar.getText();
         try {
             Pojo p2 = new Pojo();
             p2= udjdbc.    getBypName(find);
             ArrayList<Pojo>al = new ArrayList();
             al =  udjdbc.getAllData();
             for(Pojo data:al){
                 if(p2.getpName().equals(data.getpName())){
                     uddtm.insertRow(1,new Object[]{data.getId(),data.getpName(),data.getQuantity(),data.getRate1()});
                     udtable.add(udEdit1);
                     udtable.add(udDel1);
                 }
             }
         } catch (SQLException ex) {
             ex.printStackTrace();
             throw new RuntimeException(ex);
         } catch (ClassNotFoundException ex) {
             throw new RuntimeException(ex);
         }
     }
 });
udDel1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        udFrame.setVisible(false);
        Delete d = new Delete();
        d.delete();
    }
});
udEdit1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        udFrame.setVisible(false);
        Edit ee= new Edit();
        ee.edit();
    }
});

        udFrame.add(udBack);
        udFrame.add(searchbar);
        udFrame.add(search);
        udFrame.add(udtable);
        udFrame.setLayout(null);
        udFrame.setVisible(true);
    }

}
