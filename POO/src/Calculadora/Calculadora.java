package Calculadora;

import java.util.Scanner;

public class Calculadora {
//Calcular-> Soma, Divisão, Subtração e Multiplicação
//Entrada de Dados
//Saída de Dados
	
	public double valor1;
	public double valor2;
	public double total;
	public int op;
	
	Scanner scan = new Scanner(System.in);
	
	public void entrarDados() {
		System.out.println("Digite o valor 1: ");
		valor1 =  scan.nextDouble();
		System.out.println("Digite o valor 2: ");
		valor2 =  scan.nextDouble();
	}
	
	public double somar() {
		return valor1+valor2 ;
	}
	
	public double subtrair() {
		return valor1-valor2 ;
	}
	
	public double multiplicar() {
		return valor1*valor2 ;
	}
	public double dividir() {
		return valor1/valor2;
	}
	
	
	
	public void sairDados() {
		System.out.println("Total: "+total);
	}
}
