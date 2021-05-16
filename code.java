/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package jdbc_program;

import java.io.*;
import java.sql.*;

/**
 *
 * @author Maitreyee Paliwal
 */
public class Main {

    static final String DB_URL = "jdbc:mysql://localhost:3306/sampledb";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("\tDone by Maitreyee Paliwal \n");
        System.out.println("Connecting to the database sampledb");
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
                Statement stmt = conn.createStatement();) {
            System.out.println("Connected to the database");
            System.out.println("...\n");
            System.out.println("Create Table Students in the datbase sampledb");
            String sql = "CREATE TABLE students "
                    + "(Name VARCHAR(1000), "
                    + " Photo longblob, "
                    + " Registration_Number VARCHAR(100), "
                    + " City VARCHAR(100), "
                    + " Company VARCHAR(1000), "
                    + " Salary INT(100), "
                    + " CGPA DECIMAL(50,2), "
                    + " PRIMARY KEY ( Registration_Number ))";

            stmt.executeUpdate(sql);
            System.out.println("Created Table");
            System.out.println("...\n");
            System.out.println("Inserting records into the table students of datbase sampledb);

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Iron Man', 'AB123', 'Manhattan, New York', 'Stark Industries',8000000, 9.48)");
            InputStream in = new FileInputStream("A:\\Photos\\Ironman.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Captain America', 'BE802', 'Brooklyn, New York', 'US Army',900000, 8.76)");
            in = new FileInputStream("A:\\Photos\\Captain america.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Thor', 'HU980', 'Asgard', 'Asgardian Army',1700000, 7.21)");
            in = new FileInputStream("A:\\Photos\\thor.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Doctor Strange', 'OP802', 'New York City', 'Metro General hospital',3000000, 9.14)");
            in = new FileInputStream("A:\\Photos\\doctorstrange.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Black Panther', 'IU667', 'Wakanda', 'Wakanda Rule House',2000000, 8.92)");
            in = new FileInputStream("A:\\Photos\\blackpanther.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Bruce Banner', 'PP988', 'Virginia', 'Virginia University Lab',2900000, 9.28)");
            in = new FileInputStream("A:\\Photos\\hulk.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Star Lord', 'KJ008', 'St. Charles, Missouri', 'Guardians of the Galaxy',1000000, 6.24)");
            in = new FileInputStream("A:\\Photos\\starlord.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Spider Man', 'YT678', 'Queens, New York', 'Midtown High School',600000, 8.66)");
            in = new FileInputStream("A:\\Photos\\spiderman.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Natasa Romanoff', 'XX832', 'Stalingrad', 'Widows Bite',2400000, 8.46)");
            in = new FileInputStream("A:\\Photos\\blackwidow.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Bucky Barnes', 'OL768', ' Shelbyville, Indiana', 'US Army',900000, 8.1)");
            in = new FileInputStream("A:\\Photos\\bucky.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Wanda Maximoff', 'RR998', 'Sokovia', 'Magic Manipulation School',1200000, 8.43)");
            in = new FileInputStream("A:\\Photos\\scarletwitch.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Vision', 'RT333', 'Brooklyn, New York', 'Android',2000000, 8.81)");
            in = new FileInputStream("A:\\Photos\\vision.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Shuri', 'BO111', 'Wakanda', 'Wakandan Design Group',2100000, 9.02)");
            in = new FileInputStream("A:\\Photos\\shuri.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            pstmt = conn.prepareStatement("INSERT INTO students(Photo, Name, Registration_Number, City, Company, Salary, CGPA) VALUES(?, 'Okaye', 'UI972', 'Wakanda', 'Dora Milaje',1500000, 8.83)");
            in = new FileInputStream("A:\\Photos\\okoye.jpg");
            pstmt.setBlob(1, in);
            pstmt.executeUpdate();
            
            System.out.println("Inserted the records");
            System.out.println("...\n");
            System.out.println("Retrieving details of student with highest package from the table students of datbase sampledb");
            System.out.println("...\n");
            PreparedStatement ps = conn.prepareStatement("select * from students where (Registration_Number, Salary) IN (SELECT Registration_Number, MAX(Salary) from students GROUP By Registration_Number)");
            ResultSet rs = ps.executeQuery();
            System.out.println("Details of Student with highest package: \n");
            if (rs.next()) {

                Blob b = rs.getBlob(2);
                byte barr[] = b.getBytes(1, (int) b.length());
                FileOutputStream fout = new FileOutputStream("A:\\Photos_output\\Highest_Package.jpg");
                fout.write(barr);
                fout.close();
                System.out.println("Nane: " + rs.getString("Name"));
                System.out.println("Registration Number: " + rs.getString("Registration_Number"));
                System.out.println("City: " + rs.getString("City"));
                System.out.println("Company Placed: " + rs.getString("Company"));
                System.out.println("Salary: " + rs.getInt("Salary"));
                System.out.println("CGPA: " + rs.getFloat("CGPA"));
            }

            System.out.println("\nGet the photo of the student with the heighest package at : A:\\Photos_output\\Highest_Package.jpg\n\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
