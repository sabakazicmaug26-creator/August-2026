#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    double temperature[3][3];

    for(int floor=0; floor<3; floor++){
        cout << "\nFloor : " << floor+1 << endl;

        for(int room=0; room<3; room++){
            cout << "Enter temperature for room " << room+1 << " : " << endl;
            cin >> temperature[floor][room];
        }
    }
    cout << "\n";
    cout << setw(10) << " " << setw(10) << "Room 1" << setw(10) << "Room 2" << setw(10) << "Room 3" << endl; 

    for(int floor = 0; floor<3; floor++){
        cout << setw(10) << "Floor : " << floor+1;

        for(int room=0; room<3; room++){
            cout << setw(10) << temperature[floor][room];
        }
        cout << endl;
    }
    double hottest = temperature[0][0];

    int hottestfloor = 0;
    int hottestroom = 0;

    for(int floor=0; floor<3; floor++){
        for(int room=0; room<3; room++){
            if(temperature[floor][room] > hottest){
                hottest = temperature[floor][room];
                hottestfloor = floor;
                hottestroom = room;
            }
        }
    }
    cout << fixed << setprecision(2);
    cout << "\nHottest Room : Floor" << hottestfloor+1 << ", Room" << hottestroom+1 << "->" << hottest << " C" << endl;
    
    double highestAvg = 0;
    int hottestFloorNumber = 0;

    for(int floor=0; floor<3; floor++){
        double sum = 0;
        
        for(int room=0; room<3; room++){
            sum += temperature[floor][room];
        }
        double avg = sum/3;

        if(floor == 0 || avg>highestAvg){
            highestAvg = avg;
            hottestFloorNumber = floor;
        }
    }
    cout << "Hottest Floor : Floor " << hottestFloorNumber+1 << "(avg " << highestAvg << " C)" << endl;

    int warning = 0;

    for(int floor = 0; floor<3; floor++){
        for(int room = 0; room<3; room++){
            if(temperature[floor][room]>=30){
                warning++;
            }
        }
    }
    cout << "Rooms at WARNING or above : " << warning << endl;

    return 0;

}