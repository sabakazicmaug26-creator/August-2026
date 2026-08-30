#include <iostream>
#include <cmath>
using namespace std;

// Compute RMS
double computeRMS(double* signal, int n){
    double sum = 0;

    for(int i=0; i<n ;i++){
        sum = sum + (*(signal + i) * *(signal + i));
    }
    return sqrt(sum/n);
}

// Normalise
void normalise(double* signal, int n){

    double maxValue = 0;

    for(int i=0; i<n; i++){
        if(fabs(*(signal+i))>maxValue){
            maxValue = fabs(*(signal+i));
        }

    if(maxValue != 0){
        *(signal + i) = *(signal + i) / maxValue;
        }
    }
}

// Count Zero Crossings
int countZeroCrossings(double* signal, int n){

    int count = 0;

    for(int i = 0; i<n-1; i++){

        if((*(signal + i)<0 && *(signal + i + 1)>0) || (*(signal + i)>0 && *(signal + i + 1)<0));
        count++;
    }
return count;    
}

// Apply Gain
void applyGain(double* signal, int n, double gainFactor){

    for(int i=0; i<n; i++){

        *(signal + i) *= gainFactor;
    }
}

// Print array
void printSignal(double* signal, int n){

    for(int i=0; i<n; i++){

        cout << *(signal + i) << " " << endl;
    }
}


int main(){
    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};

    int n = 7;

    cout << "Original signal : ";
    printSignal(signal, n);


    // Compute RMS
    double rms = computeRMS(signal, n);

    cout << "RMS : " << rms << endl;


    // Count zero crossings
    int crossings = countZeroCrossings(signal, n);

    cout << "Zero crossings : " << crossings << endl;


    // Normalise the signal
    normalise(signal, n);

    cout << "After normalise : ";
    printSignal(signal, n);


    // Apply gain
    double gainFactor = 2.0;

    applyGain(signal, n, gainFactor);

    cout << "After gain : ";
    printSignal(signal, n);


    return 0;
}