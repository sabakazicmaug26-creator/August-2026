#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {

    int R, C;

    // Take rows and columns from user
    cout << "Enter number of rows: ";
    cin >> R;

    cout << "Enter number of columns: ";
    cin >> C;


    // Allocate outer array
    int** map = new int*[R];

    // Allocate each row
    for (int i = 0; i < R; i++) {
        map[i] = new int[C];
    }


    // Generate random tile values
    srand(time(0));

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            map[i][j] = rand() % 5;
        }
    }


    // Display the map
    cout << "\n===== GAME MAP ("
         << R << " x " << C
         << ") =====\n";

    for (int i = 0; i < R; i++) {

        for (int j = 0; j < C; j++) {
            cout << map[i][j] << " ";
        }

        cout << endl;
    }


    // Legend
    cout << "\nLegend: "
         << "0=Grass "
         << "1=Water "
         << "2=Mountain "
         << "3=Forest "
         << "4=Dungeon"
         << endl;


    // Count each tile type
    int count[5] = {0};

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {

            count[map[i][j]]++;
        }
    }


    // Display tile counts
    cout << "\nTile Count:\n";

    cout << "Grass    : " << count[0] << endl;
    cout << "Water    : " << count[1] << endl;
    cout << "Mountain : " << count[2] << endl;
    cout << "Forest   : " << count[3] << endl;
    cout << "Dungeon  : " << count[4] << endl;


    // Deallocate memory
    for (int i = 0; i < R; i++) {
        delete[] map[i];
    }

    delete[] map;


    return 0;
}