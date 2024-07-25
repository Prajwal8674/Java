package Project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Edit {
 public  void edit(){

     JFrame eFrame= new JFrame("Edit");
     eFrame.setSize(670,500);
     JTextField searchbar=new JTextField();
     searchbar.setBounds(60,30,260,30);
     searchbar.setBorder(new LineBorder(Color.BLACK));
     JButton search = new JButton("SEARCH");
     search.setBounds(330,30,120,30);

     JButton eBack = new JButton("BACK");
     eBack.setBounds(460,30,120,30);


     DefaultTableModel edtm = new DefaultTableModel();
     JTable etable=new JTable(edtm);
     edtm.addColumn(new Object[]{""});
     edtm.addColumn("");
     edtm.addColumn("");
     edtm.addColumn("");

     edtm.addRow(new Object[]{"ID","PRODUCT NAME","QUANTITY","              ACTION"});
     etable.setBounds(60,90,520,60);
     etable.setRowHeight(30);
     etable.getColumnModel().getColumn(0).setPreferredWidth(8);
     etable.getColumnModel().getColumn(1).setPreferredWidth(130);
     etable.getColumnModel().getColumn(2).setPreferredWidth(130);
     etable.getColumnModel().getColumn(3).setPreferredWidth(180);


     JButton edit1= new JButton("EDIT");
     edit1.setBounds(330,35,180,20);
     JDBC djdbc = new JDBC();

     JLabel ename = new JLabel("PRODUCT NAME");
     ename.setBounds(20,300,200,20);


     search.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             int find  = Integer.parseInt(searchbar.getText());
             try {
                 Pojo p2 = new Pojo();
                 p2= djdbc.searchById(find);
                 edtm.insertRow(1,new Object[]{p2.getId(),p2.getpName(),p2.getQuantity()});
                 System.out.println(p2.getId()+""+p2.getpName()+""+p2.getRate1());
                 etable.add(edit1);
             } catch (ClassNotFoundException ex) {
                 throw new RuntimeException(ex);
             } catch (SQLException ex) {
                 throw new RuntimeException(ex);
             }
         }
     });

     edit1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             eFrame.add(ename);
            /* JPanel panel = new JPanel();
             panel.setBounds(20,50,200,200);
             eFrame.add(panel);*/
         }
     });
     eBack.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             eFrame.setVisible(false);
             UpdateDelete ud = new UpdateDelete();
             ud.search();
         }
     });
     eFrame.add(eBack);
     eFrame.add(searchbar);
     eFrame.add(search);
     eFrame.add(etable);
     eFrame.setLayout(null);
     eFrame.setVisible(true);
   }
}
