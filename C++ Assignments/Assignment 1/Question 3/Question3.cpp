#include <iostream>
#include <iomanip>
#include <string>

using namespace std;


// EMPLOYEE CLASS
class Employee
{
private:

    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;


public:

    // Constructor
    Employee()
    {
        empId = 1001 + employeeCount;
        employeeCount++;

        name = "";
        department = "";
        grade = 'D';
        basicSalary = 10001;
        isActive = true;
    }


    // SETTERS
    void setName(const string& n)
    {
        if (n.empty())
        {
            cout << "ERROR: Name cannot be empty." << endl;
        }
        else
        {
            name = n;
        }
    }


    void setDepartment(const string& dept)
    {
        if (dept == "Engineering" ||
            dept == "HR" ||
            dept == "Finance" ||
            dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << "ERROR: '" << dept
                 << "' is not a registered department."
                 << endl;
        }
    }


    void setGrade(char g)
    {
        if (g == 'A' ||
            g == 'B' ||
            g == 'C' ||
            g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "ERROR: Invalid grade '"
                 << g
                 << "'. Accepted values: A, B, C, D."
                 << endl;
        }
    }


    void setBasicSalary(double salary)
    {
        if (salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between "
                 << "Rs.10,000 and Rs.5,00,000. "
                 << "Value rejected."
                 << endl;
        }
    }


    void deactivate()
    {
        isActive = false;
    }


    // --------------------------------------------------------
    // GETTERS
    // --------------------------------------------------------

    int getEmpId() const
    {
        return empId;
    }


    string getName() const
    {
        return name;
    }


    string getDepartment() const
    {
        return department;
    }


    char getGrade() const
    {
        return grade;
    }


    double getBasicSalary() const
    {
        return basicSalary;
    }


    bool getIsActive() const
    {
        return isActive;
    }


    // COMPUTE ALLOWANCES
    double computeAllowances() const
    {
        if (grade == 'A')
        {
            return basicSalary * 0.40;
        }
        else if (grade == 'B')
        {
            return basicSalary * 0.30;
        }
        else if (grade == 'C')
        {
            return basicSalary * 0.20;
        }
        else
        {
            return basicSalary * 0.10;
        }
    }


    // COMPUTE GROSS SALARY
    double computeGrossSalary() const
    {
        return basicSalary + computeAllowances();
    }


    // COMPUTE TAX
    double computeTax() const
    {
        double gross = computeGrossSalary();

        if (gross <= 50000)
        {
            return 0;
        }
        else if (gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }


    // COMPUTE NET SALARY
    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }


    // ACCEPT DETAILS
     void acceptDetails()
    {
        string inputName;
        string inputDepartment;
        char inputGrade;
        double inputSalary;


        cout << "\nEnter name: ";
        cin >> ws;
        getline(cin, inputName);

        setName(inputName);


        cout << "Enter department: ";
        getline(cin, inputDepartment);

        setDepartment(inputDepartment);


        cout << "Enter grade: ";
        cin >> inputGrade;

        setGrade(inputGrade);


        cout << "Enter basic salary: ";
        cin >> inputSalary;

        setBasicSalary(inputSalary);
    }


    // PRINT PAYSLIP
    void printPayslip() const
    {
        cout << "\n============================================"
             << endl;

        cout << "        EMPLOYEE PAYSLIP — AUG 2026"
             << endl;

        cout << "============================================"
             << endl;

        cout << "Emp ID : " << empId << endl;

        cout << "Name : " << name << endl;

        cout << "Department : " << department << endl;

        cout << "Grade : " << grade << endl;

        cout << "Status : "
             << (isActive ? "Active" : "Inactive")
             << endl;

        cout << "--------------------------------------------"
             << endl;

        cout << fixed << setprecision(2);

        cout << "Basic Salary : Rs. "
             << basicSalary << endl;

        cout << "Allowances : Rs. "
             << computeAllowances() << endl;

        cout << "Gross Salary : Rs. "
             << computeGrossSalary() << endl;

        cout << "--------------------------------------------"
             << endl;

        cout << "Tax Deduction : Rs. "
             << computeTax() << endl;

        cout << "Net Salary : Rs. "
             << computeNetSalary() << endl;

        cout << "============================================"
             << endl;
    }


    // STATIC FUNCTION
    static int getEmployeeCount()
    {
        return employeeCount;
    }
};


// DEFINE STATIC MEMBER
int Employee::employeeCount = 0;


int main()
{
    // One object on the stack
    Employee e1;

    // Two objects on the heap
    Employee* e2 = new Employee();
    Employee* e3 = new Employee();


    // Accept details
    cout << "\n--- Employee 1 ---" << endl;
    e1.acceptDetails();

    cout << "\n--- Employee 2 ---" << endl;
    e2->acceptDetails();

    cout << "\n--- Employee 3 ---" << endl;
    e3->acceptDetails();


    /*
       These statements are commented because empId
       and basicSalary are private members.

       They cannot be accessed directly from main().
       The compiler will produce an error if we uncomment them.

       e1.empId = 999;
       e1.basicSalary = -1000;
    */


    // Print payslips
    e1.printPayslip();

    e2->printPayslip();

    e3->printPayslip();


    // Simulate resignation
    e3->deactivate();


    if (!e3->getIsActive())
    {
        cout << e3->getName()
             << " is no longer active. Payroll skipped."
             << endl;
    }


    // Display total employees
    cout << "Total Employees : "
         << Employee::getEmployeeCount()
         << endl;


    // Free heap memory
    delete e2;
    delete e3;


    return 0;
}