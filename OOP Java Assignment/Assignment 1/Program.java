public class Program {

    static Date date = new Date();

    static boolean dateSet = false;


    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== DATE MENU ==========");

            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");

            int choice = ConsoleInput.getInt();


            switch (choice) {

                case 1:
                    setDate();
                    break;

                case 2:
                    addDays();
                    break;

                case 3:
                    addMonths();
                    break;

                case 4:
                    addYears();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println(
                        "Compare dates - Not implemented yet."
                    );
                    break;

                case 7:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    
    // Set Date
    static void setDate() {

        System.out.print("Enter Day: ");
        int day = ConsoleInput.getInt();

        System.out.print("Enter Month: ");
        int month = ConsoleInput.getInt();

        System.out.print("Enter Year: ");
        int year = ConsoleInput.getInt();


        if (date.setDate(day, month, year)) {

            dateSet = true;

            System.out.println("Date set successfully.");

        } else {

            System.out.println("Invalid date.");
        }
    }


    // Add Days
    static void addDays() {

        if (!dateSet) {

            System.out.println("Please set the date first.");

            return;
        }


        System.out.print("Enter days to add: ");

        int days = ConsoleInput.getInt();


        if (days < 0) {

            System.out.println("Days cannot be negative.");

            return;
        }


        date.addDays(days);

        System.out.println("Days added successfully.");
    }


   
    // Add Months
    static void addMonths() {

        if (!dateSet) {

            System.out.println("Please set the date first.");

            return;
        }


        System.out.print("Enter months to add: ");

        int months = ConsoleInput.getInt();


        if (months < 0) {

            System.out.println("Months cannot be negative.");

            return;
        }


        date.addMonths(months);

        System.out.println("Months added successfully.");
    }


    // =========================
    // Add Years
    // =========================

    static void addYears() {

        if (!dateSet) {

            System.out.println("Please set the date first.");

            return;
        }


        System.out.print("Enter years to add: ");

        int years = ConsoleInput.getInt();


        if (years < 0) {

            System.out.println("Years cannot be negative.");

            return;
        }


        date.addYears(years);

        System.out.println("Years added successfully.");
    }


    // Display
    static void display() {

        if (!dateSet) {

            System.out.println("Date has not been set.");

            return;
        }


        date.display();
    }
}