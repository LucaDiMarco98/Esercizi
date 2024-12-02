   package main;

   import java.util.Scanner;


public class Esercizi {

	public static void main(String[] args) {
	
    	//creazione scanner
		Scanner scanner = new Scanner(System.in);
		
		//esercizio numero 1
		System.out.println("ciaooo inserisci 2 numeri :");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int somma = numero1+numero2;
		System.out.println("la loro somma è :" + somma);
		
		//esercizio numero 2
		System.out.println("inserisci 2 numeri :");
		int numero3 = scanner.nextInt();
		int numero4 = scanner.nextInt();
	    System.out.println("la loro differenza é :"+(numero3-numero4));
	    
	    //esercizio numero 3
	    System.out.println("inserisci 2 numeri :");
	    int numero5 = scanner.nextInt();
		int numero6 = scanner.nextInt();
	    System.out.println("il loro prodotto é :"+(numero5*numero6));
	    
	    //esercizio numero 4
	    System.out.println("inserisci 2 numeri :");
	    int numero7 = scanner.nextInt();
		int numero8 = scanner.nextInt();
	    System.out.println("la loro divisione é :"+(numero7/numero8));
	    
	    //esercizio numero 5
	    System.out.println("inserisci base e altezza di un rettangolo :");
	    int base = scanner.nextInt();
	    int altezza = scanner.nextInt();
	    System.out.println("l'area del rettangolo è :"+(base*altezza));
	    
	    //esercizio numero 6
	    System.out.println("inserisci il lato di un quadrato :");
	    int lato = scanner.nextInt();
	    System.out.println("il perimetro del quadrato é :"+(lato*4));
	    
	    //esercizio numero 7
	    System.out.println("inserisci 3 numeri :");
	    int numero9 = scanner.nextInt();
	    int numero10 = scanner.nextInt();
	    int numero11 = scanner.nextInt();
	    System.out.println("la media dei numeri è :"+(numero9+numero10+numero11)/3);
	    
	    //esercizio numero 8 
	    System.out.println("inserisci 1 numero :");
	    int numero12 = scanner.nextInt();
	    System.out.println("il numero successivo è:"+(numero12+1) );
	    System.out.println("il numero precedente è:"+(numero12-1) );
	    
	    //chiusura dello scanner
	    scanner.close();
	}  

}
