package Media;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Media media = new Media();
		
		
		media.cadastrarNotas();
		media.calcularMedia();
		media.mostrarNotas();
		media.mostrarMedia();
		
		if(media.media == 10) { 
			System.out.println("Aprovado com distinção");
		}else if(media.media>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
	}

}
