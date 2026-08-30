#include <iostream>
using namespace std;


bool parsePacket(const int* rawData, int size, int** outMin, int** outMax){
    if (size <= 0)
    {
        return false;
    }

    // Start by assuming the first element is both minimum and maximum
    const int* minPtr = rawData;
    const int* maxPtr = rawData;

    // Search for minimum and maximum
    for (int i = 1; i < size; i++)
    {
        if (*(rawData + i) < *minPtr)
        {
            minPtr = rawData + i;
        }

        if (*(rawData + i) > *maxPtr)
        {
            maxPtr = rawData + i;
        }
    }

    // Convert const int* to int* for the output pointers
    *outMin = const_cast<int*>(minPtr);
    *outMax = const_cast<int*>(maxPtr);

    return true;
}


int main()
{
    int packet[] = {45, 12, 67, 8, 55, 31};

    int* minPtr = nullptr;
    int* maxPtr = nullptr;

    if (parsePacket(packet, 6, &minPtr, &maxPtr))
    {
        cout << "Calibration Min : "
             << *minPtr << endl;

        cout << "Calibration Max : "
             << *maxPtr << endl;
    }

    return 0;
}