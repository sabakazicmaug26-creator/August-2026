#include <iostream>
using namespace std;

int main(){

    cout << "Problem 1 : Sensor Reading Classifier" << endl;

    double temp;

    cout << "Enter Temperature: " << endl;
    cin >> temp;
    
    double Fahrenheit = (temp * 9 / 5) + 32;
    cout << "Temperature = " << temp << " C / " << Fahrenheit << " F" << endl;

    int StatusCode;
    if (temp < 0){
        StatusCode = -1;
    }
    else if (temp >= 0 && temp <= 29){
        StatusCode = 0;
         }
    else if (temp >= 30 && temp <= 44){
        StatusCode = 1;
         }
    else if (temp >= 45 && temp <= 59){
        StatusCode = 2;
        }
    else{
        StatusCode = 3;
        }

    switch (StatusCode)
    {
    case -1:
    cout << "Status label : SENSOR_ERROR" << endl;
    cout << "Action : Sensor fault — check wiring" << endl;
        break;

    case 0:
    cout << "Status label : NORMAL" << endl;
    cout << "Action : No action required" << endl;
        break;
        
    case 1:
    cout << "Status label : WARNING" << endl;
    cout << "Action : Alert sent to supervisor" << endl;
        break;
        
    case 2:
    cout << "Status label : CRITICAL" << endl;
    cout << "Action : Cooling system triggered" << endl;
        break;    
    
    default:
    cout << "Status label : SHUTDOWN" << endl;
    cout << "Action : Emergency shutdown initiated" << endl;
        break;
    }

    temp >= 25 ? cout << "Reading : Above Average" : cout << "Reading : Below Average";

    return 0;

}
