#include <iostream>
using namespace std;

// integer quantity
double reorderCost(int qty, double unitPrice){
    return qty * unitPrice;
}

// fractional (by weight)
double reorderCost(double qty, double unitPrice){
    return qty * unitPrice;
}       

// with tax
double reorderCost(int qty, double unitPrice, double taxRate){
    double cost = qty * unitPrice;
    double tax = cost * taxRate/100;
    return cost + tax;
}

// If no discount is passed, apply 10% by default
double applyDiscount(double price, double discountPercent = 10.0){
    return price - (price * discountPercent/100);
}

int main(){

    cout << "Integer quantity cost: " << reorderCost(15, 100.0) << endl;

    cout << "Fractional quantity cost: " << reorderCost(20.25, 50.0) << endl;

    cout << "Cost with tax: " << reorderCost(10, 45.0, 18.0) << endl;

    cout << "Price after default discount: " << applyDiscount(1000.0) << endl;

    cout << "Price after discount of 20% : " << applyDiscount(1000.0, 20.0) << endl;

    return 0;


}
