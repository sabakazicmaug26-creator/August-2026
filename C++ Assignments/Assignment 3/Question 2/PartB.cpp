#include <iostream>
#include <string>
#include <memory>
using namespace std;

class Shader{
    private:
    string name;
    string type;

    public:
    Shader(string n, string t){
        name = n;
        type = t;

        cout << "[Shader Compiled]" << endl;
    }

    ~Shader(){
        cout << "[Shader Destroyed]" << endl;
    }

    int getReferenceCount(shared_ptr<Shader> shader){
        return shader.use_count();

    }
};

int main(){
    auto shader = make_shared<Shader>("main_vert", "vertex");
    cout << "Ref count : " << shader.use_count() << endl;
    {
        auto renderRef = shader;
        cout << "Ref count : " << shader.use_count() << endl;

        auto editorRef = shader;
        cout << "REf count : " << shader.use_count() << endl;
    }

    cout << "Ref count : " << shader.use_count() << endl;

    return 0;
}