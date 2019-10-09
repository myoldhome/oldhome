package intermediate;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01?characterEncoding=UTF-8",
                "root", "abc123456");
             Statement s = c.createStatement();

        ) {
            String name = "dashen";
            //正确的密码是：thisispassword
            String password = "thisispassword1";

            String sql = "select * from user where name = '" + name +"' and password = '" + password+"'";

            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);

            if(rs.next())
                System.out.println("账号密码正确");
            else
                System.out.println("账号密码错误");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
