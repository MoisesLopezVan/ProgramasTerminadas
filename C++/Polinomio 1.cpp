#include <iostream>
#include <Math.h>
using namespace std; 
float calcularError (float valorActual, float valorAnterior);
main(){
	int grado;
	float E=0,x=0,error=0;
    float resultado=0;
    
	cout<<"Ingrese el valor inicial. \n"<<"Xi: ";
	cin>>x;
	cout<<"Ingrese el error relativo. \n"<<"E: ";
	cin>>E;
	cout<<"Ingrese el grado. ";
	cin>>grado;
	cout<<"Ingrese el valor de variables:\n "<<"Nota: Las expresiones va en asedente Ax^0,Bx^1,Cx^2....Z:\n ";
   float arreglo[grado];

	int j=1;
	for(int i=0;i<grado;i++){
		cout<<j<<":";
		cin>>arreglo[i];
		j++;
	}
   cout<<"----------------------------------------------------------------------------"<<endl;
	cout<<"Derivada 1\n: ";
 float formula1=0;
	
   
		//Derivada 1
	float Fprima[grado-1];
	for(int i=1;i<grado;i++){
		Fprima[i-1]=arreglo[i]*i;
	  
	}
	
	
	for(int i=0;i<grado-1;i++){
		cout<<Fprima[i]<<"\n";
	
	}
	cout<<"Derivada 2\n: ";
	//Derivada 2
	float calculoderivada2=0;

  float Fprima2[grado-1];
  for(int i=1;i<grado;i++){
  	Fprima2[i-1]=Fprima[i]*i;
  }
 
  
  for(int i=0;i<grado-2;i++){
  	cout<<Fprima2[i]<<"\n";
  	
  }
 
  int con=1;
  	
  //Procedimiento del Error Relativo
  do{
  	
  	//Ecuacion
   for(int i=0;i<grado;i++){
		
		formula1=formula1+arreglo[i]*pow(x,i);
		
	}
  	
  	//Primera Derivada
  	float calculoderivada;
  	for(int i=0;i<grado-1;i++){
		calculoderivada=calculoderivada+Fprima[i]*pow(x,i);
	}
	
	//Segunda Derivada
	for(int i=0;i<grado-2;i++){
  	calculoderivada2=calculoderivada2+Fprima2[i]*pow(x,i);
   }
    resultado = x - ((formula1)*(calculoderivada) / ((pow(calculoderivada,2)) -formula1*calculoderivada2));
   error = calcularError (resultado, x);
		
		cout << endl;
		cout  << "Error " << con << ": " << error << " %";
		
		x = resultado;
		
		con ++;
  	
  }while(error > E);
  

	
}
	float calcularError (float valorActual, float valorAnterior) {
		float error;
		
		error = ((valorActual - valorAnterior) / valorActual)*100;
		
		if (error < 0) {
			
			error = error * -1;
			
		}
		
		return error;
	}


