import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Book> bookList = new ArrayList<>();
    static ArrayList<Student> userStudent = new ArrayList<>();

    public static void main(String[] args) {
        initializeData();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    inputNim(scanner);
                    break;
                case "2":
                    Admin admin = new Admin();
                    admin.menuAdmin(scanner);
                    break;
                case "3":
                    System.out.println("Thank you. Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void inputNim(Scanner scanner) {
        System.out.print("Enter your NIM (input 99 for back): ");
        String nim = scanner.nextLine();
        if (nim.equals("99")) {
            return;
        } else if (checkNim(nim)) {
            Student student = new Student(nim);
            student.menuStudent(scanner); // Panggil menuStudent dari objek student yang sudah dibuat
        } else {
            System.out.println("Invalid NIM. Please try again.");
            inputNim(scanner);
        }
    }

    public static boolean checkNim(String nim) {
        for (Student student : userStudent) {
            if (student.getNim().equals(nim)) {
                return true;
            }
        }
        return false;
    }

    public static void initializeData() {
        // Inisialisasi data buku
        bookList.add(new Book("388c-e681-9152", "Harry potter", "J. K. Rowling", "fiksi", 8));
        bookList.add(new Book("ed90-be30-5cdb", "tereliye", "erik siksa kubur", "humanity", 11));
        bookList.add(new Book("d95e-0c4a-9523", "gamakichi", "radit", "Sejarah arab", 3));

        // Inisialisasi data user
        userStudent.add(new Student("Celvin saputra", "202310370311216", "Teknik", "Informatika"));
        userStudent.add(new Student("ryan gosling", "202310370311111", "Teknik", "Informatika"));
        userStudent.add(new Student("erik putra nugraha", "202210370311250", "Teknik", "Informatika"));
    }

}





