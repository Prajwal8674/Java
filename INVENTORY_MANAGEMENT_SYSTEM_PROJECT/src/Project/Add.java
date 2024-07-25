package Project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Add extends Frame{
   public void addf() throws SQLException {

       JFrame addframe=new JFrame("Add Product");
       addframe.setSize(670,400);
       addframe.getContentPane().setBackground(Color.lightGray);

       JLabel id=new JLabel("ID ");
    id.setBounds(150,20,100,30);

       JTextField aid=new JTextField();
       aid.setBounds(270,20,180,30);
       aid.setBorder(new LineBorder(Color.BLACK));

       JLabel ProductName =new JLabel("Product  Name ");
      ProductName.setBounds(150,80,100,30);

      JTextField pn=new JTextField();
      pn.setBounds(270,80,180,30);
       pn.setBorder(new LineBorder(Color.BLACK));

       JLabel Quantity=new JLabel("Quantity ");
       Quantity.setBounds(150,140,100,30);

       JTextField q=new JTextField();
       q.setBounds(270,140,180,30);
       q.setBorder(new LineBorder(Color.BLACK));

       JLabel Rate1=new JLabel("Rate ");
       Rate1.setBounds(150,200,100,30);

       JTextField r1=new JTextField();
       r1.setBounds(270,200,180,30);
       r1.setBorder(new LineBorder(Color.BLACK));


       JLabel Rate2=new JLabel("Rate ");
       Rate2.setBounds(150,260,100,30);

       JTextField r2=new JTextField();
       r2.setBounds(270,260,180,30);
r2.setBorder(new LineBorder(Color.BLACK));

JButton Clear = new JButton("CLEAR");
        Clear.setBounds(150,320,80,25);
       JButton Add = new JButton("ADD");
       Add.setBounds(260,320,80,25);
       JButton Back= new JButton("BACK");
       Back.setBounds(370,320,80,25);



       JDBC jdbc= new JDBC();
       Add.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               if(aid.getText().equals("")||pn.getText().equals("")||q.getText().equals("")||r1.getText().equals("")||r2.getText().equals("")){
                   JOptionPane.showMessageDialog(addframe,"Fill The All Entities Please !");
               }
               int id=Integer.parseInt(aid.getText());
               String pName=pn.getText();
               int quantity=Integer.parseInt(q.getText());
               int rate1=Integer.parseInt(r1.getText());
               int rate2=Integer.parseInt(r2.getText());
Pojo p = new Pojo(id,pName,quantity,rate1,rate2);
try{
    jdbc.ADD(p);
    JOptionPane.showMessageDialog(addframe,"Data Recorded Successfully !!");
}catch(Exception ee){
    System.out.println(ee);
    ee.printStackTrace();
               }
           }
       });

       Back.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               addframe.setVisible(false);
               MainFrame mf=new MainFrame();
               mf.frame1();
           }
       });
       Clear.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          aid.setText("");
          pn.setText("");
          q.setText("");
          r1.setText("");
          r2.setText("");
           }
       });
       addframe.add(id);addframe.add(aid);addframe.add(Back);addframe.add(Add);addframe.add(Clear);
       addframe.add(Rate2);addframe.add(r2);addframe.add(Rate1);addframe.add(r1);addframe.add(Quantity);
       addframe.add(q);addframe.add(pn);addframe.add(ProductName);addframe.setLayout(null);addframe.setVisible(true);
   }

}
