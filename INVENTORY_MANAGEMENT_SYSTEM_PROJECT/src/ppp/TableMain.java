package ppp;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class TableMain {
    public static void main(String []args){
            JFrame frame = new JFrame("Creating a Scrollable JTable!");
            JPanel panel = new JPanel();
            String data[][] = {{"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
                    {"001","vinod","Bihar","India","Biology","65","First"},
                    {"002","Raju","ABC","Kanada","Geography","58","second"},
                    {"003","Aman","Delhi","India","computer","98","Dictontion"},
                    {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"}};
            String col[] = {"Roll","Name","State","country","Math","Marks","Grade"};
            JTable table = new JTable(data,col);
            JTableHeader header = table.getTableHeader();
            header.setBackground(Color.yellow);
            JScrollPane pane = new JScrollPane(table);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            panel.add(pane);
            frame.add(panel);
            frame.setSize(500,150);
            frame.setUndecorated(true);
            frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
    }

