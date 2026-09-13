public class Program {

    static EmployeeList list = new EmployeeList();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = ConsoleInput.getInt();

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
                    saveToFile();
                    break;

                case 5:
                    loadFromFile();
                    break;

                case 6:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ==============================
    // ADD EMPLOYEE MENU
    // ==============================

    static void addEmployeeMenu() {

        while (true) {

            System.out.println("\n===== Add Employee =====");
            System.out.println("1. Manager");
            System.out.println("2. Engineer");
            System.out.println("3. Sales Person");
            System.out.println("4. Exit to Main Menu");

            System.out.print("Enter choice: ");
            int choice = ConsoleInput.getInt();

            switch (choice) {

                case 1:
                    addManager();
                    break;

                case 2:
                    addEngineer();
                    break;

                case 3:
                    addSalesPerson();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ==============================
    // ADD MANAGER
    // ==============================

    static void addManager() {

        Manager m = new Manager();

        System.out.print("Enter Name: ");
        m.setName(ConsoleInput.getString());

        System.out.print("Enter Age: ");
        m.setAge(ConsoleInput.getInt());

        System.out.print("Enter Phone: ");
        m.setPhone(ConsoleInput.getString());

        System.out.print("Enter Address: ");
        m.setAddress(ConsoleInput.getString());

        System.out.print("Enter Salary: ");
        m.setSalary(ConsoleInput.getDouble());

        System.out.print("Enter Department: ");
        m.setDepartment(ConsoleInput.getString());

        list.add(m);

        System.out.println("Manager added successfully.");
    }


    // ==============================
    // ADD ENGINEER
    // ==============================

    static void addEngineer() {

        Engineer e = new Engineer();

        System.out.print("Enter Name: ");
        e.setName(ConsoleInput.getString());

        System.out.print("Enter Age: ");
        e.setAge(ConsoleInput.getInt());

        System.out.print("Enter Phone: ");
        e.setPhone(ConsoleInput.getString());

        System.out.print("Enter Address: ");
        e.setAddress(ConsoleInput.getString());

        System.out.print("Enter Salary: ");
        e.setSalary(ConsoleInput.getDouble());

        System.out.print("Enter Specialization: ");
        e.setSpecialization(ConsoleInput.getString());

        list.add(e);

        System.out.println("Engineer added successfully.");
    }


    // ==============================
    // ADD SALES PERSON
    // ==============================

    static void addSalesPerson() {

        SalesPerson s = new SalesPerson();

        System.out.print("Enter Name: ");
        s.setName(ConsoleInput.getString());

        System.out.print("Enter Age: ");
        s.setAge(ConsoleInput.getInt());

        System.out.print("Enter Phone: ");
        s.setPhone(ConsoleInput.getString());

        System.out.print("Enter Address: ");
        s.setAddress(ConsoleInput.getString());

        System.out.print("Enter Salary: ");
        s.setSalary(ConsoleInput.getDouble());

        System.out.print("Enter Commission: ");
        s.setCommision(ConsoleInput.getDouble());

        list.add(s);

        System.out.println("Sales Person added successfully.");
    }


    // ==============================
    // DISPLAY MENU
    // ==============================

    static void displayMenu() {

        while (true) {

            System.out.println("\n===== Display =====");
            System.out.println("1. All Employees");
            System.out.println("2. First Employee");
            System.out.println("3. Next Employee");
            System.out.println("4. Previous Employee");
            System.out.println("5. Last Employee");
            System.out.println("6. Exit to Main Menu");

            System.out.print("Enter choice: ");
            int choice = ConsoleInput.getInt();

            switch (choice) {

                case 1:
                    list.displayAll();
                    break;

                case 2:
                    list.first();
                    break;

                case 3:
                    list.next();
                    break;

                case 4:
                    list.previous();
                    break;

                case 5:
                    list.last();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ==============================
    // SORT MENU
    // ==============================

    static void sortMenu() {

        while (true) {

            System.out.println("\n===== Sort =====");
            System.out.println("1. All Managers");
            System.out.println("2. All Engineers");
            System.out.println("3. All Sales Person");
            System.out.println("4. All Employees Alphabetic Ascending");
            System.out.println("5. All Employees Alphabetic Descending");
            System.out.println("6. Exit to Main Menu");

            System.out.print("Enter choice: ");
            int choice = ConsoleInput.getInt();

            switch (choice) {

                case 1:
                    list.sortManagers();
                    list.displayManagers();
                    break;

                case 2:
                    list.sortEngineers();
                    list.displayEngineers();
                    break;

                case 3:
                    list.sortSalesPersons();
                    list.displaySalesPersons();
                    break;

                case 4:
                    list.sortAscending();
                    list.displayAll();
                    break;

                case 5:
                    list.sortDescending();
                    list.displayAll();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ==============================
    // SAVE TO FILE
    // ==============================

    static void saveToFile() {

        try {

            FileOutputStream fos =
                    new FileOutputStream("employees.dat");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(list);

            oos.close();
            fos.close();

            System.out.println("Employees saved successfully.");

        } catch (Exception e) {

            System.out.println("Error while saving file.");
            e.printStackTrace();
        }
    }


    // ==============================
    // LOAD FROM FILE
    // ==============================

    static void loadFromFile() {

        try {

            FileInputStream fis =
                    new FileInputStream("employees.dat");

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            list = (EmployeeList) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Employees loaded successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("No saved employee file found.");

        } catch (Exception e) {

            System.out.println("Error while loading file.");
            e.printStackTrace();
        }
    }
}