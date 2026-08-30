#include <iostream>
using namespace std;

// Call by value
void resetSensorPairV1(int reading1, int reading2){        
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

// Call by reference
void resetSensorPairV2(int& reading1, int& reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

// Call by pointer
void resetSensorPairV3(int* reading1, int* reading2){
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
}

int main(){

    /* V1 fails because it is call by value.
    The function recieved the copies of the original value.
    In the main() function the copies can swap themselves but not the original variable.
    Hence, the values remain unchanged after V1. */

    // Call by value
    int a = 35;
    int b = 45;

    cout << "--- V1: Call by Value ---" << endl;
    cout << "Before : A="<< a << "  B=" << b << endl;

    resetSensorPairV1(a, b);

    cout << "After : A="<< a << "  B=" << b << endl;


    // Call by reference

    cout << "--- V2: Call by Reference ---" << endl;
    cout << "Before : A="<< a << "  B=" << b << endl;

    resetSensorPairV2(a, b);

    cout << "After : A="<< a << "  B=" << b << endl;


    // Call by pointer

    cout << "--- V3: Call by Pointer ---" << endl;
    cout << "Before : A="<< a << "  B=" << b << endl;

    resetSensorPairV3(&a, &b);

    cout << "After : A="<< a << "  B=" << b << endl;


return 0;    


}
