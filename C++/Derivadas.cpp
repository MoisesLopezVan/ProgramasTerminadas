#include <iostream>
#include <math.h>
using namespace std;

int main(){
double a, b, c, d, e, f, resultado=0,error;
double E, x;   //Valores del error relativo (E) y el valor inicial (Xi)
double F, Fprima, Fprima2;  //variables de las funciones (x) y sus derivadas.
int i=0;
cout<<"Ingresa el error relativo. \n";
cout<<"E= ";
cin>>E;
cout<<"Ingresa el valor inicial Xi. \n";
cout<<"Xi= ";
cin>> x;
//Variables de sustituciones
cout<<"Ingresa el valor de <<a>>: ";
cin>> a;
cout<<"Ingresa el valor de <<b>>: ";
cin>> b;
cout<<"Ingresa el valor de <<c>>: ";
cin>> c;
cout<<"Ingresa el valor de <<d>>: ";
cin>> d;
cout<<"Ingresa el valor de <<e>>: ";
cin>> e;
cout<<"Ingresa el valor de <<f>>: ";
cin>> f;

//Ciclo do while para sacar el error relativo.
do{
//Proceso para conocer los valores de la derivada de la funcion.
	i++;
  F = a*pow(x,5) + b*pow(x,4) + c*pow(x,3) + d*pow(x,2)+ e*x+ f;
  Fprima = 5*a*pow(x,4) + 4*b*pow(x,3) + 3*c*pow(x,2)+ 2*d*x + e;
  Fprima2 = 20*a*pow(x,3)+12*b*pow(x,2) + 6*c*x + 2*d;
  
	resultado =	x-((F*Fprima)/((pow(Fprima,2))-F*Fprima2));   
	       
    if(i>1)
    {
    	error=((resultado-x)/resultado)*100;
    	if(error<0)
		{
    		error=error*-1;
    	}
    }
    x=resultado;

 }while(error<E);
	cout<<"Numero de interaciones: "<<i<<endl;
	cout<<"Su valor X es de: "<<x<<endl;
	cout<<"Error relativo: "<<error<<endl;
}

