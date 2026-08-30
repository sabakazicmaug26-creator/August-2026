#include <iostream>
using namespace std;

int main(){

    cout << "Problem 2 : Sensor Log Buffer" << endl;

    int N;
    cout << "Enter the number of readings (1-100) : " << endl;
    cin >> N;

    if(N<1 || N>100){
        cout << "Invalid number of readings." << endl;
        return 0;
    }

    double readings[100];
    

    for(int i = 0; i < N; i++){
        cout << "Reading entered : " << i+1 << endl;
        cin >> readings[i]; 
    }

    cout << "Valid readings : " << endl;

    int skipped = 0;
    
    for(int i = 0; i < N; i++){
        if(readings[i]<0){
            skipped++;
            continue;
        }
    cout << readings[i] << " " << endl;    
    }
    cout << "Skipped (errors) :" << skipped << endl;

    bool foundCritical = false;

    for(int i=0; i<N; i++){
        if(readings[i]>=45){
            cout << "First CRITICAL : Index " << i << " → " << readings[i] << endl;
        }

        foundCritical = true;
        break;
    }
    if(!foundCritical){
        cout << "First CRITICAL : Not Found" << endl;
    }

    double min = 0;
    double max = 0;
    double sum = 0;

    int ValidCount = 0;

    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    bool firstValid = true;

    for(int i = 0; i < N; i++){
        if(readings[i]<0){
            continue;
        }
    else{      
        if(firstValid){
            min = readings[i];
            max = readings[i];

            firstValid = false;
        }
        else{    
        if(readings[i]<min){
            min = readings[i];
        }
        if(readings[i]>max){
            max = readings[i];
        }
    }
    sum = sum + readings[i];
    ValidCount++;
    }

    if(readings[i]<=29){
        normal++;
    }
    else if(readings[i]<=44){
        warning++;
    }
    else if(readings[i]<=59){
        critical++;
    }
    else{
        shutdown++;
    }
}

if(ValidCount>0){

    double avg = sum / ValidCount;

    cout << "Min : " << min << endl;
    cout << "Max : " << max << endl;
    cout << "Avg : " << avg << endl; 
}
else{
    cout << "No valid readings available." << endl;
    }
cout << "Normal : " << normal << endl << "Warning : " << warning << endl << "Critical : " << critical << endl << "Shutdowm : " << shutdown << endl << endl;

return 0;

}
