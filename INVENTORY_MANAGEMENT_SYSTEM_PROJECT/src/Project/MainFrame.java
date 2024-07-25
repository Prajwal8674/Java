package Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class MainFrame extends  Frame {
    void  frame1(){

        JFrame f=new JFrame("Inventory Management System");
        f.setSize(670,480);
f.getContentPane().setBackground(Color.lightGray);
f.getRootPane().setBorder( BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));

        JButton add =new JButton("ADD");
        add.setBounds(60,40,160,40);
       add.setFont(new Font("serif",Font.BOLD,20));
        JButton update =new JButton("UPDATE");
        update.setBounds(240,40,160,40);
        update.setFont(new Font("serif",Font.BOLD,20));

        JButton delete =new JButton("DELETE");
        delete.setBounds(420,40,160,40);
        delete.setFont(new Font("serif",Font.BOLD,20));

        JButton show  =new JButton("SHOW");
        show.setBounds(60,100,160,40);
        show.setFont(new Font("serif",Font.BOLD,20));

        JButton purchase =new JButton("PURCHASE");
        purchase.setBounds(240,100,160,40);
        purchase.setFont(new Font("serif",Font.BOLD,20));

        JButton history =new JButton("HISTORY");
        history.setBounds(420,100,160,40);
        history.setFont(new Font("serif",Font.BOLD,20));

        DefaultTableModel dtm = new DefaultTableModel();
        JTable etable=new JTable(dtm);
        dtm.addColumn(new Object[]{""});
        dtm.addColumn("");
        dtm.addColumn("");
        dtm.addColumn("");

        dtm.addRow(new Object[]{""});
        dtm.addRow(new Object[]{""});
        dtm.addRow(new Object[]{""});
        dtm.addRow(new Object[]{""});
        etable.setBounds(60,160,520,160);
        etable.setRowHeight(40);
        etable.getColumnModel().getColumn(0).setPreferredWidth(8);
        etable.getColumnModel().getColumn(1).setPreferredWidth(130);
        etable.getColumnModel().getColumn(2).setPreferredWidth(130);
        etable.getColumnModel().getColumn(3).setPreferredWidth(180);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f.setVisible(false);
                Add a = new Add();
                try {
                    a.addf();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
              UpdateDelete ud = new UpdateDelete();
              ud.search();
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                UpdateDelete ud = new UpdateDelete();
                ud.search();
            }
        });
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                Show ss = new Show();
                ss.show();
            }
        });
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                Purchase p = new Purchase();
                p.purchase();
            }
        });
        f.add(etable);
        f.add(add);
        f.add(update);
        f.add(delete);
        f.add(show);
        f.add(purchase);
        f.add(history);

        f.setLayout(null);
        f.setVisible(true);
    }
}
