#include <iostream>
#include <string>
using namespace std;

class Patient {

private:
    int id;
    string name;
    int age;
    string ward;
    const string bloodGroop;
    
public:
// Constructor 1 — Default
     Patient():
        id(0),
        name("Unknown"),
        age(0),
        ward("General"),
        bloodGroop("O+"){
            cout << "[Constructor] Default patient registered successfully " << endl;
        }

// Constructor 2 — Emergency admission
     Patient(int id, const string& name):
     id(id),
     name(name),
     age(0),
     ward("Emergency"),
     bloodGroop("O+"){
        cout << "[Constructor] Emergency: " << name << endl;
     }

// Constructor 3 — Full admission details     
     Patient(int id, const string& name, int age, const string& ward, const string& bg):
     id(id),
     name(name),
     age(age),
     ward(ward),
     bloodGroop(bg){
        cout << "[Constructor] Full admission: " << name << endl;
     }

// Destructor     
     ~Patient(){
        cout << "[Destructor] Patient " << name << "discharged." << endl;
     }


void displayRecord() const{
    cout << "===== Patient Record =====" << endl;
    cout << "ID        : " << id << endl;
    cout << "Name      : " << name << endl;
    cout << "Age       : " << age << endl;
    cout << "Ward      : " << ward << endl;
    cout << "Blood Grp : " << bloodGroop << endl;
}


void transferWard(const string& newWard){
    cout << "Ward Transfer: " << name << " -> " << newWard << endl;

    ward = newWard;
}
};

int main(){

    cout << "===== Patient Registry =====" << endl;

    //  Patient of each 3 type of constructor using stack objects    
    Patient p1(102, "Bob", 25, "Cardiology", "A+");
    Patient p2(101, "Alice");
    Patient p3;


    // Dynamic array of 4 patients on the heap
    cout << "===== Dynamic Patient Array =====" << endl;
    Patient* p = new Patient[4];


    // Display all 4 patients record
    for(int i=0; i<4; i++){
        p[i].displayRecord();
    }


    // Transfer patient ward
    cout << "===== Ward Transfer =====" << endl;
    p[1].transferWard("ICU");

    delete[] p;

    return 0;



}