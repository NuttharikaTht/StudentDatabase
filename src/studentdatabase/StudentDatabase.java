/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import Utilities.DatabaseDriver;
import Utilities.DatabaseHandler;

/**
 *
 * @author user
 */
public class StudentDatabase {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/Student";
        String user = "app";
        String passwd = "app";
        /*String driver = "com.mysql.cj.jdbc.Driver";
        //String url="jdbc:mysql://localhost:3306/employee?serverTimezone=UTC";
        String user = "root";
        String passwd = "root";*/
        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        Student std1 = new Student(1, "John", 3.76);
        Student std2 = new Student(2, "Marry", 3.27);
        StudentTable.insertStudent(dbHandler, std1);
        StudentTable.insertStudent(dbHandler, std2);
        ArrayList<Student> studentList = StudentTable.findAllStudent(dbHandler);
        if (studentList != null) {
            printAllStudent(studentList);
        }
        dbHandler.closeConnection();
    }
    
    public static void printAllStudent(ArrayList<Student> stdList) {
        for(int i = 0; i < stdList.size(); i++) {
            System.out.print(stdList.get(i).getID() + " ");
            System.out.print(stdList.get(i).getName() + " ");
            System.out.println(stdList.get(i).getGPA() + " ");
        }
        
    }
}
