#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Product {
private:
    int productId;
    string name;
    double price;
    int quantity;

public:
    // Accept product details
    void acceptDetails() {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    // Display product details
    void displayDetails() const {
        cout << left << setw(10) << productId
             << setw(15) << name
             << setw(12) << fixed << setprecision(2) << price
             << setw(10) << quantity
             << setw(15) << totalValue();

        if (isLowStock(10)) {
            cout << " LOW STOCK";
        }

        cout << endl;
    }

    // Calculate total value
    double totalValue() const {
        return price * quantity;
    }

    // Check whether stock is low
    bool isLowStock(int threshold) const {
        return quantity < threshold;
    }

    // Getter for name
    string getName() const {
        return name;
    }
};

int main() {

    // Array of 5 Product objects
    Product products[5];

    // Accept details of all 5 products
    cout << "===== ENTER PRODUCT DETAILS =====\n\n";

    for (int i = 0; i < 5; i++) {
        cout << "Product " << i + 1 << endl;
        products[i].acceptDetails();
        cout << endl;
    }

    // Display all products
    cout << "\n===== INVENTORY REPORT =====\n";

    cout << left << setw(10) << "ID"
         << setw(15) << "Name"
         << setw(12) << "Price"
         << setw(10) << "Qty"
         << setw(15) << "Total Value"
         << endl;

    cout << "------------------------------------------------------------\n";

    for (int i = 0; i < 5; i++) {
        products[i].displayDetails();
    }

    // Find product with highest total value
    int highestIndex = 0;

    for (int i = 1; i < 5; i++) {
        if (products[i].totalValue() >
            products[highestIndex].totalValue()) {

            highestIndex = i;
        }
    }

    cout << "\nHighest Value Product : "
         << products[highestIndex].getName()
         << " (Rs. "
         << fixed << setprecision(2)
         << products[highestIndex].totalValue()
         << ")\n";

    // Ask for stock threshold
    int threshold;

    cout << "\nEnter low-stock threshold: ";
    cin >> threshold;

    // Display low-stock products
    cout << "\nLow Stock (threshold: "
         << threshold << ") : ";

    bool found = false;

    for (int i = 0; i < 5; i++) {
        if (products[i].isLowStock(threshold)) {

            if (found) {
                cout << ", ";
            }

            cout << products[i].getName();
            found = true;
        }
    }

    if (!found) {
        cout << "None";
    }

    cout << endl;

    return 0;
}