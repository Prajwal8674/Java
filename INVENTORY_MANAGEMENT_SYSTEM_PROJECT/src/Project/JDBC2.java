package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC2 {
        public void ADD(Pojo2  p2) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "admin01");
            PreparedStatement ps = con.prepareStatement("insert into buyerdb values(?,?,?,?)");
            ps.setInt(1, p2.getId2());
            ps.setString(2, p2.getpName2());
            ps.setInt(3, p2.getQuantitiy2());
            ps.setInt(4, p2.getRate1());

/*
            ps.setInt(5, p2.getRate2());
*/
            int a = ps.executeUpdate();

        }
    }

