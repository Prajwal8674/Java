package Project;

import com.mysql.jdbc.util.ResultSetUtil;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class JDBC {

    public void ADD(Pojo p) throws ClassNotFoundException, SQLException {
        Class.forName(  "com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "admin01");
        
        PreparedStatement ps = con.prepareStatement("insert into mydb values(?,?,?,?,?)");
        ps.setInt(1, p.getId());
        ps.setString(2, p.getpName());
        ps.setInt(3, p.getQuantity());
        ps.setInt(4, p.getRate1());
        ps.setInt(5, p.getRate2());
        int a = ps.executeUpdate();

    }
   public ArrayList<Pojo> getAllData() throws SQLException, ClassNotFoundException {
        ArrayList<Pojo> al = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "admin01");
        PreparedStatement sps = con.prepareStatement("select * from mydb");
        ResultSet rs = sps.executeQuery();
        while (rs.next()){
            Pojo p= new Pojo();
            p.setId(rs.getInt(1));
            p.setpName(rs.getString(2));
            p.setQuantity(rs.getInt(3));
            p.setRate1(rs.getInt(4));
            p.setRate2(rs.getInt(5));
            al.add(p);
        }
        return al;
    }
    public Pojo getBypName(String name) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "admin01");
        PreparedStatement sps = con.prepareStatement("select * from mydb where PRODUCT_NAME=?");
        Pojo p1 = new Pojo();
        sps.setString(1, name);
        ResultSet rs  = sps.executeQuery();
        while (rs.next()){
            p1.setId(rs.getInt(1));
            p1.setpName(rs.getString(2));
            p1.setQuantity(rs.getInt(3));
            p1.setRate1(rs.getInt(4));
        }
        return p1;
    }
    public Pojo searchById(int id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "admin01");
        PreparedStatement sps = con.prepareStatement("select * from mydb where ID=?");
        Pojo p2 = new Pojo();
        sps.setInt(1,id);
        ResultSet rs = sps.executeQuery();
        while(rs.next()){
            p2.setId(rs.getInt(1));
            p2.setpName(rs.getString(2));
            p2.setQuantity(rs.getInt(3));
            p2.setRate1(rs.getInt(4));
        }
        return p2;
    }
    public Pojo DelById(int id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "admin01");
        PreparedStatement sps = con.prepareStatement("delete  from mydb where ID=?");
        Pojo p3 = new Pojo();
        sps.setInt(1,id);
        int deleted = sps.executeUpdate();
        if(deleted>0){
            System.out.println("deleted");
        }
       /* while(rs.next()){
            p3.setId(rs.getInt(1));
            p3.setpName(rs.getString(2));
            p3.setQuantity(rs.getInt(3));
            p3.setRate1(rs.getInt(4));
        }*/
        return p3;
    }

}
