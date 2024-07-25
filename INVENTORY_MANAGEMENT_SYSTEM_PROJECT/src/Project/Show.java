package Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Show {
    void show(){
        JFrame sf=new JFrame("SHOW");
        sf.setSize(520,350);
        sf.getContentPane().setBackground(Color.lightGray);
        sf.getRootPane().setBorder( BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));


        JButton sClear = new JButton("CLEAR");
        sClear.setBounds(30,5,100,30);
        sf.add(sClear);

        JButton sBack= new JButton("BACK");
        sBack.setBounds(370,5,100,30);
        sf.add(sBack);

        JButton sView = new JButton("VIEW");
        sView.setBounds(200,5,100,30);
        sf.add(sView);

        JButton sUpdate = new JButton("UPDATE");
        sUpdate.setBounds(100,255,100,30);
        sf.add(sUpdate);

        JButton sDelete = new JButton("DELETE");
        sDelete.setBounds(270,255,100,30);
        sf.add(sDelete);

        DefaultTableModel sdtm = new DefaultTableModel();
        JTable stable=new JTable(sdtm);
        sdtm.addColumn(new Object[]{""});
        sdtm.addColumn("");
       sdtm.addColumn("");
        sdtm.addColumn("");


        sdtm.addRow(new Object[]{"ID","PRODUCT NAME","PRODUCT QUANTITY","RATE"});

        stable.setBounds(0,40,500,200);
        stable.setRowHeight(40);
        stable.getColumnModel().getColumn(0).setPreferredWidth(20);
        stable.getColumnModel().getColumn(1).setPreferredWidth(200);
        stable.getColumnModel().getColumn(2).setPreferredWidth(150);
        stable.getColumnModel().getColumn(3).setPreferredWidth(130);
        sf.add(stable);

        sView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    JDBC sjdbc= new JDBC();
                    Pojo p= new Pojo();
                    ArrayList<Pojo>al = new ArrayList();
                  al =  sjdbc.getAllData();
for(Pojo data:al){
    sdtm.insertRow(1,new Object[]{data.getId(),data.getpName(),data.getQuantity(),data.getRate1()});
}
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);

                }
            }
        });
        sClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sf.setVisible(false);
                MainFrame mf = new MainFrame();
                mf.frame1();
            }
        });
        sf.setLayout(null);
        sf.setVisible(true);
    }
}
