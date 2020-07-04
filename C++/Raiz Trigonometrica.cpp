#include<iostream>
#include <Math.h>
using namespace std;
//Derivada Trigonometrica
int main()
{
   float F,Fprima, Fprima2;
   float x;
   float E,resultado,error;
   int i=0;
  
   cout<<"Ingresa tu error relativo: ";cin>>E;
   cout<<"Ingresa el valor inicial: ";cin>>x;
   do{
      i++;
   	  F=sin(x);
      Fprima= cos(x);
      Fprima2= -sin(x);
   	   resultado = x - ((F*Fprima) / ((pow(Fprima,2)) -F*Fprima2));
   	  
    	error=((resultado-x)/resultado)*100;
    	if(error<0)
		{
    		error=error*-1;
    	}
    x=resultado;
   }while(error>E);
   cout<<"Numero de Interaccion: "<<i<<endl;
   cout<<"El valor de x es: "<<x<<endl;
   cout<<"El valor es: "<<error<<endl;
   	
}
