#include <iostream>
using namespace std;

namespace Physics {

    double clamp(double val, double min, double max) {
        if (val < min)
            return min;

        if (val > max)
            return max;

        return val;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}


namespace GameMath {

    int clamp(int val, int min, int max) {
        if (val < min)
            return min;

        if (val > max)
            return max;

        return val;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}


int main() {

    cout << "===== PHYSICS =====" << endl;

    cout << "Clamped velocity: "
         << Physics::clamp(120.5, 0.0, 100.0)
         << endl;

    cout << "Physics Lerp: "
         << Physics::lerp(0.0, 100.0, 0.5)
         << endl;


    cout << "\n===== GAME MATH =====" << endl;

    cout << "Clamped health: "
         << GameMath::clamp(120, 0, 100)
         << endl;

    cout << "GameMath Lerp: "
         << GameMath::lerp(0.0, 100.0, 0.25)
         << endl;


    // Limited namespace scope
    cout << "\n===== LIMITED USING NAMESPACE =====" << endl;

    {
        using namespace Physics;

        cout << "Clamped value: "
             << clamp(150.0, 0.0, 100.0)
             << endl;
    }


    return 0;
}