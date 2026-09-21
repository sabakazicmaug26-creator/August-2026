import java.util.Scanner;

public class EmployeeApplication {
	
	static Scanner sc = new Scanner(System.in);

    static EmployeeList employeeList =
            new EmployeeList();

    static final String FILE_NAME = "employees.dat";


    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("       EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployeeMenu();
                    break;

                case 2:
                    displayMenu();
                    break;

                case 3:
                    sortMenu();
                    break;

                case 4:
                    employeeList.saveToFile(FILE_NAME);
                    break;

                case 5:

                    EmployeeList loadedList =
                            EmployeeList.loadFromFile(FILE_NAME);

                    if (loadedList != null) {
                        employeeList = loadedList;
                    }

                    break;

                case 6:
                    System.out.println("\nProgram terminated.");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
    
    
    // Add employee menu
    static void addEmployeeMenu() {

        int choice;

        do {

            System.out.println("\n========== ADD EMPLOYEE ==========");

            System.out.println("a. Manager");
            System.out.println("b. Engineer");
            System.out.println("c. Sales Person");
            System.out.println("d. Exit to Main Menu");

            System.out.print("\nEnter your choice: ");

            char ch = sc.next().charAt(0);

            switch (ch) {

                case 'a':
                case 'A':

                    addManager();
                    break;

                case 'b':
                case 'B':

                    addEngineer();
                    break;

                case 'c':
                case 'C':

                    addSalesPerson();
                    break;

                case 'd':
                case 'D':

                    System.out.println("Returning to Main Menu.");
                    return;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (true);
    }  
    
    // Add manager
    static void addManager() {

        System.out.println("\nEnter Manager Details");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Manager manager =
                new Manager(id, name, salary);

        employeeList.addEmployee(manager);
    }
    
    // Add engineer
    static void addEngineer() {

        System.out.println("\nEnter Engineer Details");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Engineer engineer =
                new Engineer(id, name, salary);

        employeeList.addEmployee(engineer);
    }
    
    // Add sales person
    static void addSalesPerson() {

        System.out.println("\nEnter Sales Person Details");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        SalesPerson salesPerson =
                new SalesPerson(id, name, salary);

        employeeList.addEmployee(salesPerson);
    }
    
    
    // Display menu
    static void displayMenu() {

        while (true) {

            System.out.println("\n========== DISPLAY ==========");

            System.out.println("a. All Employees");
            System.out.println("b. First Employee");
            System.out.println("c. Next Employee");
            System.out.println("d. Previous Employee");
            System.out.println("e. Last Employee");
            System.out.println("f. Exit to Main Menu");

            System.out.print("\nEnter your choice: ");

            char ch = sc.next().charAt(0);

            switch (ch) {

                case 'a':
                case 'A':
                    employeeList.displayAll();
                    break;

                case 'b':
                case 'B':
                    employeeList.firstEmployee();
                    break;

                case 'c':
                case 'C':
                    employeeList.nextEmployee();
                    break;

                case 'd':
                case 'D':
                    employeeList.previousEmployee();
                    break;

                case 'e':
                case 'E':
                    employeeList.lastEmployee();
                    break;

                case 'f':
                case 'F':
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    
    
    // Sort menu
    static void sortMenu() {

        while (true) {

            System.out.println("\n========== SORT ==========");

            System.out.println("a. All Managers");
            System.out.println("b. All Engineers");
            System.out.println("c. All Sales Person");
            System.out.println("d. All Employees Alphabetic order ascending");
            System.out.println("e. All Employees Alphabetic order descending");
            System.out.println("f. Exit to Main Menu");

            System.out.print("\nEnter your choice: ");

            char ch = sc.next().charAt(0);

            switch (ch) {

                case 'a':
                case 'A':

                    employeeList.displayByType("Manager");
                    break;

                case 'b':
                case 'B':

                    employeeList.displayByType("Engineer");
                    break;

                case 'c':
                case 'C':

                    employeeList.displayByType("Sales Person");
                    break;

                case 'd':
                case 'D':

                    employeeList.sortAscending();
                    break;

                case 'e':
                case 'E':

                    employeeList.sortDescending();
                    break;

                case 'f':
                case 'F':

                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }

}
