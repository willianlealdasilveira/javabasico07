package fai.projeto07;
import java.util.Scanner;

public class Main {
	int numero1,numero2,soma;
	double numero11,numero21,soma2;
	String s1 = "44"; 
	String s2 = "um texto qualquer "; 
	
	public static void main(String[] args) {
		

		Main app = new Main();
		
		 app.adcao();
		 app.subtracao();
		 app.concatenarstring();


	}
	
		private void adcao() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o valor");
			numero1 = ler.nextInt();
			System.out.println("Digite o valor");
			numero2 = ler.nextInt();
			soma = numero1 + numero2;
			System.out.println("Resultado da operação  " +soma);

		}
		private void subtracao() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o valor");
			numero11 = ler.nextDouble();
			System.out.println("Digite o valor");
			numero21 = ler.nextDouble();
			soma2 = numero11 - numero21;
			System.out.println("Resultado da operação  " +soma2);

		}
		private void concatenarstring() {
			 String s3 = s1+s2;
			 
			 System.out.println("Resultado da operação " +s3);

		}
		
		
	}
	

