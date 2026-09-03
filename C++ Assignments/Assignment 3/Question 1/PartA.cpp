#include <iostream>
#include <string>
using namespace std;

enum class HttpStatus {
OK             = 200,
Created        = 201,
BadRequest     = 400,
Unauthorized   = 401,
NotFound       = 404,
ServerError    = 500
};

void handleResponse(HttpStatus status, const string& endpoint){

    cout << "[ " << endpoint << " ] -> ";

    int code = static_cast<int>(status);

    switch (code)
    {
    case 200:
        cout << "200  OK : Request successful" << endl;
        break;

    case 201:
        cout << "201  Created : Request executed successfully" << endl;
        break;
        
    case 400:
        cout << "400  BadRequest : Invalid request" << endl;
        break;
        
    case 401:
        cout << "401  Unauthorized : Authentication required" << endl;
        break;
        
    case 404:
        cout << "404  NotFound : Endpoint does not exist" << endl;
        break;    
    
    case 500:
        cout << "500  ServerError : Internal server error — retry later" << endl;
        break; 

    default:
        cout << "Unknown Status" << endl;
    }
}

int main(){

    handleResponse(HttpStatus::OK, "/api/users");
    handleResponse(HttpStatus::Unauthorized, "/api/login");
    handleResponse(HttpStatus::NotFound, "/api/products/99");
    handleResponse(HttpStatus::ServerError, "/api/order");

    return 0;
    
}