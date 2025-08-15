import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "sameedsql";

        try(
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
        ){
//           CREATE
            String sql = "INSERT INTO students VALUES (2, 'Subhan', 'CSE');";
            stmt.executeUpdate(sql);
            System.out.println("Successfully inserted into students table");

            // READ

            String sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);
            List<Student> students = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                students.add(new Student(id, name, department));
            }

            students.forEach(System.out::println);

            // Update
            String sql = "UPDATE students SET name='Subhan Chigga' WHERE id=2";
            stmt.executeUpdate(sql);
            System.out.println("Updated");

            // Delete
            String sql = "DELETE FROM students WHERE id = 1";
            stmt.executeUpdate(sql);
            System.out.println("Deleted");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
