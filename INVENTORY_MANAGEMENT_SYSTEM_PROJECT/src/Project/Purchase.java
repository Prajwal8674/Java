package Project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Purchase extends Frame {
    void purchase(){
        JFrame pframe=new JFrame("Purchase");
        pframe.setSize(670,400);
        pframe.getContentPane().setBackground(Color.lightGray);

        DefaultTableModel dtm = new DefaultTableModel();
        JTable Ptable=new JTable(dtm);
        dtm.addColumn(new Object[]{""});
        dtm.addColumn("");
        dtm.addColumn("");
        dtm.addColumn("");
        dtm.addColumn("");


        dtm.addRow(new Object[]{"ID","PRODUCT","QUANTITY","RATE","ACTIONS"});

        Ptable.setBounds(60,160,520,120);
        Ptable.setRowHeight(30);
        Ptable.getColumnModel().getColumn(0).setPreferredWidth(8);
        Ptable.getColumnModel().getColumn(1).setPreferredWidth(120);
        Ptable.getColumnModel().getColumn(2).setPreferredWidth(80);
        Ptable.getColumnModel().getColumn(3).setPreferredWidth(80);
        Ptable.getColumnModel().getColumn(4).setPreferredWidth(200);
        pframe.add(Ptable);


        JTextField pSearchBar = new JTextField();
        pSearchBar.setBounds(60,30,290,30);
pSearchBar.setBorder(new LineBorder(Color.BLACK));
     pframe.add(pSearchBar);

        JButton pSearch = new JButton("SEARCH");
        pSearch.setBounds(370,30,100,30);
     pframe.add(pSearch);


     JButton pBack= new JButton("BACK");
        pBack.setBounds(480,30,100,30);
     pframe.add(pBack);

        JTextField ppq = new JTextField();
       ppq.setBounds(60,80,190,30);
        ppq.setBorder(new LineBorder(Color.BLACK));
     pframe.add(ppq);


     JTextField pr = new JTextField();
        pr.setBounds(260,80,90,30);
        pr.setBorder(new LineBorder(Color.BLACK));
     pframe.add(pr);


     JButton padd= new JButton("ADD");
        padd.setBounds(370,80,100,30);
     pframe.add(padd);



        JLabel total = new JLabel("Total : ");
        total.setBounds(60,290,60,30);
     pframe.add(total);

     JLabel totalamt = new JLabel("here ");
        totalamt.setBounds(60,310,60,30);
     pframe.add(totalamt);



     JLabel paid = new JLabel("Paid : ");
        paid.setBounds(150,290,60,30);
     pframe.add(paid);

     JTextField paidtf=new JTextField("paid");
        paidtf.setBounds(150,320,60,20);
        paidtf.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
     pframe.add(paidtf);

     JLabel ReturnC= new JLabel("Return Cash");
     ReturnC.setBounds(250,300,60,20);
     pframe.add(ReturnC);
        JLabel Returned= new JLabel("Returned");
        Returned.setBounds(250,320,60,20);
        pframe.add(Returned);

        JButton Purchase=new JButton("Purchase");
Purchase.setBounds(380,300,100,40);
pframe.add(Purchase);
     JButton pEdit1= new JButton("EDIT");
        pEdit1.setBounds(330,35,90,20);
        Ptable.add(pEdit1);

     JButton pDel1= new JButton("DELETE");
        pDel1.setBounds(420,35,90,20);
        Ptable.add(pDel1);

        JButton pEdit2= new JButton("EDIT");
        pEdit2.setBounds(330,65,90,20);
        Ptable.add(pEdit2);

        JButton pDel2= new JButton("DELETE");
        pDel2.setBounds(420,65,90,20);
        Ptable.add(pDel2);

        JButton pEdit3= new JButton("EDIT");
        pEdit3.setBounds(330,95,90,20);
     Ptable.add(pEdit3);

     JButton pDel3= new JButton("DELETE");
        pDel3.setBounds(420,95,90,20);
        Ptable.add(pDel3);
        JDBC pjdbc = new JDBC();
        pSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String find=pSearchBar.getText();
                try {
                    Pojo p2 = new Pojo();
                    p2= pjdbc.getBypName(find);
                    ArrayList<Pojo> al = new ArrayList();
                    al =  pjdbc.getAllData();

                    for(Pojo data:al){

/*
                        String quantity = String.valueOf(p2.getQuantity());
*/

                        String rate = String.valueOf(p2.getRate1());

                        if(p2.getpName().equals(data.getpName())){
/*
                        ppq.setText(quantity);
*/
                            pr.setText(rate);

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

        JDBC2 jdbc2= new JDBC2();

        padd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pojo p2 = new Pojo();
                int id2 = p2.getId();
                String pName=pSearchBar.getText();
                int quantity=Integer.parseInt(ppq.getText());
                int rate1=Integer.parseInt(pr.getText());
                dtm.addRow(new Object[]{p2.getId(),pName,quantity,rate1});
/*
                int rate2=Integer.parseInt(r2.getText());
*/
                Pojo2 p3 = new Pojo2(id2,pName,quantity,rate1);
                try{
                    jdbc2.ADD(p3);
                    JOptionPane.showMessageDialog(pframe,"Data Added In Cart !!");
                }catch(Exception ee){
                    System.out.println(ee);
                    ee.printStackTrace();
                }
            }
        });
        pBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pframe.setVisible(false);
                MainFrame mf = new MainFrame();
                mf.frame1();
            }
        });
        pframe.setLayout(null);
        pframe.setVisible(true);
    }
}
