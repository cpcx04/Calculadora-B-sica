package Ejercicio;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		int resultado;
		
		Scanner lectura=new Scanner(System.in);
		
		System.out.println("Calculadora Basica");
		
		System.out.println("Indique los numeros que desea sumar");
		num1=lectura.nextInt();
		System.out.println("Num 2:");
		num2=lectura.nextInt();
		resultado=num1+num2;
		System.out.println("Resultado : "+resultado);
		System.out.println("Suma completada");
		
		System.out.println("Indique los numeros que desea restar");
		num1=lectura.nextInt();
		System.out.println("Num2: ");
		num2=lectura.nextInt();
		resultado=num1+num2;
		System.out.println("Resultado : "+resultado);
		System.out.println("Resta completada");
		
		System.out.println("Indique los numeros que desea multiplicar");
		num1=lectura.nextInt();
		System.out.println("Num2: ");
		num2=lectura.nextInt();
		resultado=num1*num2;
		System.out.println("Resultado : "+resultado);
		System.out.println("Multipliacion completada");
		

		
		
	}

}
