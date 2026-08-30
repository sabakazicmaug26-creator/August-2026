#include <iostream>
using namespace std;

int main()
{
    // Hardware registers
    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;

    
    // REGPTR1 — POINTER TO CONSTANT (const int*)

    const int* regPtr1 = &statusReg;

    cout << "Status Register : " << *regPtr1 << endl;

    // NOT ALLOWED:
    // *regPtr1 = 100;
    // Error: regPtr1 is a pointer to const int.
    // We cannot change the value through this pointer.

    // THIS IS ALLOWED:
    regPtr1 = &dataReg;

    cout << "regPtr1 now points to : "
         << *regPtr1 << endl;


    // REGPTR2 — CONSTANT POINTER (int* const)

    int* const regPtr2 = &controlReg;

    // Writing through the pointer is allowed
    *regPtr2 = 123;

    cout << "Control Register : "
         << *regPtr2 << endl;

    // NOT ALLOWED:
    // regPtr2 = &dataReg;
    // Error: regPtr2 is a constant pointer.
    // The pointer must always point to controlReg.


    // REGPTR3 — CONSTANT POINTER TO CONSTANT (const int* const)

    const int* const regPtr3 = &statusReg;

    cout << "Status Register through regPtr3 : "
         << *regPtr3 << endl;

    // NOT ALLOWED:
    // *regPtr3 = 200;
    // Error: Cannot modify the value through a pointer to const.

    // NOT ALLOWED:
    // regPtr3 = &dataReg;
    // Error: regPtr3 itself is a constant pointer.
    // It cannot be changed to point somewhere else.


    return 0;
}