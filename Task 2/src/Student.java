import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private final int id;
    private String department;

    private static final List<Student> students = new ArrayList<>();

     static Scanner sc = new Scanner(System.in);

    public Student() {
        this.id = students.size() + 1;
        System.out.println("Enter first name:");
        this.firstName = sc.nextLine();
        System.out.println("Enter last name:");
        this.lastName = sc.nextLine();
        System.out.println("Enter department name:");
        this.department = sc.nextLine();
    }

    public static int getInputId(){
        System.out.println("Enter id");
        return sc.nextInt();
    }
    public static void add(){
        students.add(new Student());
    }

    public static void view(){
        System.out.println("\n Student details:");
        System.out.println("ID\t\tName\t\tDepartment Name");
        students.forEach(student ->  System.out.println( student.id + "\t\t" +student.firstName + " " + student.lastName + "\t\t" + student.department));
    }

    public static void delete(){
        int searchId = getInputId();
       students.removeIf( student -> student.id == searchId);
    }

    public static void update(){
        int searchId = getInputId();
        Student st = new Student();
        students.stream().filter(student -> student.id == searchId).findFirst().ifPresent(student -> {
            student.firstName = st.firstName;
            student.lastName = st.lastName;
            student.department = st.department;
        });
    }


}
