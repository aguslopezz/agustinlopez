#include <iostream>
#include <vector>
using namespace std;

int sumaNros(int a, int b){
    int res=a+b;
    cout <<"El resultado es : ";
    return res;
}

int main(){
    int a,b;
    cout <<"Ingrese 2 Numeros: "<< "\n" << "\n";
    cin >> a;
    cin >> b;
    cout <<endl<<endl;
    cout <<sumaNros(a,b);
    cout << "\n" << "\n";
}