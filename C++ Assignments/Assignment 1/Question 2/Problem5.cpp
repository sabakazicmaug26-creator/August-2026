#include <iostream>
#include <cmath>

using namespace std;


// DISTANCE BETWEEN TWO POINTS
inline double distanceBetween(double x1, double y1, double x2, double y2){
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}


// CONVERT DEGREES TO RADIANS
inline double toRadians(double degrees){
    return degrees * (M_PI / 180.0);
}


// CLAMP A VALUE
inline double clamp(double value, double minVal, double maxVal){
    if (value < minVal)
    {
        return minVal;
    }
    else if (value > maxVal)
    {
        return maxVal;
    }
    else
    {
        return value;
    }
}


// CHECK SAFE ZONE
inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
    double distance = distanceBetween(x, y, cx, cy);

    return distance <= radius;
}


int main()
{
    // Home position
    double homeX = 0.0;
    double homeY = 0.0;

    // Safe-zone radius
    double radius = 50.0;


    // Three waypoints
    double x1 = 10.0;
    double y1 = 20.0;

    double x2 = 30.0;
    double y2 = 40.0;

    double x3 = 60.0;
    double y3 = 30.0;


    // Waypoint 1
    double distance1 = distanceBetween(
        homeX, homeY, x1, y1
    );

    cout << "Waypoint 1 : ("
         << x1 << ", " << y1 << ")" << endl;

    cout << "Distance from home : "
         << distance1 << endl;

    if (isInSafeZone(x1, y1, homeX, homeY, radius))
    {
        cout << "Safe Zone : YES" << endl;
    }
    else
    {
        cout << "Safe Zone : NO" << endl;
    }


    // Waypoint 2
    double distance2 = distanceBetween(
        homeX, homeY, x2, y2
    );

    cout << "\nWaypoint 2 : ("
         << x2 << ", " << y2 << ")" << endl;

    cout << "Distance from home : "
         << distance2 << endl;

    if (isInSafeZone(x2, y2, homeX, homeY, radius))
    {
        cout << "Safe Zone : YES" << endl;
    }
    else
    {
        cout << "Safe Zone : NO" << endl;
    }


    // Waypoint 3
    double distance3 = distanceBetween(
        homeX, homeY, x3, y3
    );

    cout << "\nWaypoint 3 : ("
         << x3 << ", " << y3 << ")" << endl;

    cout << "Distance from home : "
         << distance3 << endl;

    if (isInSafeZone(x3, y3, homeX, homeY, radius))
    {
        cout << "Safe Zone : YES" << endl;
    }
    else
    {
        cout << "Safe Zone : NO" << endl;
    }


    // Demonstrate toRadians()
    double degrees = 90.0;

    cout << "\n90 degrees in radians : "
         << toRadians(degrees) << endl;


    // Demonstrate clamp()
    double value = 75.0;

    cout << "Clamped value : "
         << clamp(value, 0.0, 50.0)
         << endl;


    return 0;
}