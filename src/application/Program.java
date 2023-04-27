package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int numPersons = sc.nextInt();
		
		String [] vetNomes = new String [numPersons];
		int [] vetIdades = new int [numPersons];
		double [] vetAlturas = new double [numPersons]; 
		
		for (int i=0; i<numPersons; i++) {
			
			System.out.printf("Dados da %da pessoa:%n", (i+1));
			System.out.print("Nome: ");
			vetNomes[i] = sc.next();
			System.out.print("Idade: ");
			vetIdades[i] = sc.nextInt();
			System.out.print("Altura: ");
			vetAlturas[i] = sc.nextDouble();
			
		}
		
		double sum = 0.0;
		
		for(int i=0; i<numPersons; i++) {
			
			sum += vetAlturas[i];
			
		}
		
		System.out.println();
		double mediaAlt = sum / numPersons;
		System.out.printf("Altura média: %.2f%n", mediaAlt);
		
		int cont = 0; 
		
		for (int i = 0; i < numPersons; i++) {
			
			if (vetIdades[i] < 16) {
				
				cont++; 
				
			}			
		}
		
		double percent = cont*100.0 / numPersons; 
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 0; i < numPersons; i++) {
			
			if (vetIdades[i]<16) {
				
				System.out.println(vetNomes[i]);
				
			}
			
		}
		
		sc.close(); 
	}

}
