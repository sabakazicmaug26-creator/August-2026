public class Date {

    private int day;
    private int month;
    private int year;

    
    // Getters
     public int getDay() {
        return day;
   }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    // Setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }



    // Set Complete Date
    public boolean setDate(int day, int month, int year) {

        if (isValidDate(day, month, year)) {

            this.day = day;
            this.month = month;
            this.year = year;

            return true;
        }

        return false;
    }


    // Add Days
    public void addDays(int days) {

        while (days > 0) {

            day++;
            days--;

            if (day > getDaysInMonth(month, year)) {

                day = 1;
                month++;

                if (month > 12) {

                    month = 1;
                    year++;
                }
            }
        }
    }


    // Add Months
    public void addMonths(int months) {

        while (months > 0) {

            month++;
            months--;

            if (month > 12) {

                month = 1;
                year++;
            }
        }

        int maxDays = getDaysInMonth(month, year);

        if (day > maxDays) {
            day = maxDays;
        }
    }


    // Add Years
    public void addYears(int years) {

        year = year + years;

        // 29 February special case

        if (month == 2 && day == 29 && !isLeapYear(year)) {

            day = 28;
        }
    }


    // Display
    public void display() {

        System.out.println(
            "Date: " + day + "/" + month + "/" + year
        );
    }


    // Validate Date
    public boolean isValidDate(int day, int month, int year) {

        if (year <= 0) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int maxDays = getDaysInMonth(month, year);

        if (day < 1 || day > maxDays) {
            return false;
        }

        return true;
    }


    // Get Days in Months
    public int getDaysInMonth(int month, int year) {

        switch (month) {

            case 1:
                return 31;

            case 2:

                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                return 0;
        }
    }


    // Leap Year
    public boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}