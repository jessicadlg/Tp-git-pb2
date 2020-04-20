package pb;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		 Integer a;
		 Integer b;
		 Integer option;
		 Integer resultado;
		 do{
		 System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir");
		 option = teclado.nextInt();
		 }while(option < 1 && option > 4);
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
		 if(option.equals(3)){
		 resultado = a + b;
		 }else if(option.equals(2)){
		 resultado = a - b;
		 }else if(option.equals(1)){
		 resultado = a * b;
		 }else{
		 resultado = a / b;
		 }
		 System.out.println("El resultado es " + resultado.toString());
		 }
}
