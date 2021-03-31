#include <iostream>

using namespace std;
 
int main () 
{

	/*
		comando para compilar:
		g++ -o ejecutable holaMundo.cpp

		comando para ejecutar:
		./ejecutable
	*/

    cout << "Bienvenido! Ingrese su nombre." << endl;

	string nombreIngresado;

	cin >> nombreIngresado;

	cout << "Hola, " << nombreIngresado << ".\n";

	
    return 0;
}
