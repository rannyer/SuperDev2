package Exemplos;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 =  new Animal();
	
		
		Scanner scan = new Scanner(System.in);
		
		
		animal1.especie = "Peixe-Palhaço";
		animal1.classe = "peixe";
		animal1.nome = "Nemo";
		animal1.peso = 10.4;
		animal1.caracteristicasFisicas[0] = "Colorido";
		animal1.caracteristicasFisicas[1] = "Possui boca grande";
		
		System.out.println(animal1.especie);
		System.out.println(animal1.classe);
		System.out.println(animal1.nome);
		
	}

}
