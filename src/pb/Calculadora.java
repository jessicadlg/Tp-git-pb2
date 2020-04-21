package pb;

import java.util.Scanner;

public class Calculadora {
	
		
		Scanner teclado = new Scanner(System.in); 
		 Integer n1;
		 Integer n2;
		 Integer resultado=0;
		 
		 
		 
		 //constructor:
		 
		 public Calculadora (Integer num1, Integer num2) {
			 this.n1=num1;
			 this.n2=num2;
		 }
		 
		 
		 //metodos:
		 
		 public Integer sumar(Integer num1, Integer num2) {
			 resultado = num1+num2;
			 return resultado;
			 
		 }
		 
		 
		 
		 public Integer restar(Integer num1, Integer num2) {
			 resultado = num1-num2;
			 return resultado;
				 }
		 
		 
		 
		 public Integer multiplicar (Integer num1, Integer num2) {
			 resultado= num1+num2;
			 return resultado;
			 
		 }
		 
		 
		 public Integer dividir (Integer num1, Integer num2) {
			 if(num2!=0) {
				 resultado= num1/num2;
				 return resultado;
		 }else{
			 System.out.println("no se puede operar");
			 return 0;
		 }}
		 
		 
		 
		 
		 
		 
		 
		 }

