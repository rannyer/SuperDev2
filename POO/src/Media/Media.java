package Media;

import java.util.Scanner;

public class Media {

	public double notas[] = new double[4];

	
	public double media;
	
	Scanner scan = new Scanner(System.in);
	
	public void cadastrarNotas() {
		
    for (int i = 0; i < notas.length; i++) {
		System.out.println("Digite a nota: ");
		notas[i] =  scan.nextDouble();
	}
	
	}
	
	public void calcularMedia() {
		for (int i = 0; i < notas.length; i++) {
			media+= notas[i];
		}
		media /= 4;//media = media/4
	}
	public void mostrarNotas() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}
	}
	public void mostrarMedia() {
		System.out.println("Media final: "+media);
	}
}
