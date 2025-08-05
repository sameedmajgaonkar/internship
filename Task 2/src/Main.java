import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("\n 1. Add\n 2. View\n 3. Update\n 4. Delete\n 5. Exit");
            System.out.println("Enter your choice:");
            String input = sc.next();
            switch (input){
                case "1" -> Student.add();
                case "2" -> Student.view();
                case "3" -> Student.update();
                case "4" -> Student.delete();
                case "5" -> System.exit(0);
            }
        }
    }
}
