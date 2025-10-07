package lab4;
import java.util.Scanner;
public class EmployeeView {
    private EmployeeDAO dao = new EmployeeDAO();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View by ID");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> add();
                case 2 -> viewAll();
                case 3 -> viewById();
                case 4 -> updateSalary();
                case 5 -> delete();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    void add() {
        System.out.print("EmpNo: ");
        int no = sc.nextInt();
        System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("City: ");
        String city = sc.next();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(no, fname, lname, city, salary);
        dao.addEmployee(emp);
        System.out.println("Added.");
    }

    void viewAll() {
        for (Employee emp : dao.getAllEmployees()) {
            System.out.println(emp);
        }
    }

    void viewById() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        Employee emp = dao.getEmployeeById(id);
        System.out.println(emp != null ? emp : "Not Found");
    }

    void updateSalary() {
        System.out.print("EmpNo: ");
        int no = sc.nextInt();
        System.out.print("New Salary: ");
        double salary = sc.nextDouble();
        dao.updateSalary(no, salary);
        System.out.println("Updated.");
    }

    void delete() {
        System.out.print("EmpNo to delete: ");
        int no = sc.nextInt();
        dao.deleteEmployee(no);
        System.out.println("Deleted if existed.");
    }
}
