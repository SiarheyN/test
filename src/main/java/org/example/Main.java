package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello from ira");
            System.out.println("add commit");
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test", "postgres", null);
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
//,mn,mn
//            xcvzcvzxc

            String query = "CREATE TABLE public.test_table1 (\n" +
                    "\tcolumn_test varchar NULL,\n" +
                    "\tcol2 varchar NULL\n" +
                    ")";
//            ResultSet rs = stmt.executeQuery(query);


//            dlskfsdf
//            zc`zc
            System.out.println("ficha2");
            ResultSet rs = stmt.executeQuery("select * from public.test_table1");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}