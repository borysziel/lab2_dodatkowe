package studia;
import java.util.Scanner;
public class testowy2 {

	public static void main(String[] args) {
		
		
Scanner klawiatura = new Scanner(System.in);

		walec2 walec1=new walec2();//tworzymy nowy obiekt walec1
		kula2 kula1 = new kula2();//tworzymy nowy obiekt kula1
		pret2 pret1 = new pret2();//tworzymy nowy obiekt pr�t1
				
		while (true){  					// otwarcie niesko�czonej p�tli
		System.out.println(" Wybierz figur� i wpisz jej numer "); // menu
		System.out.println("1. Pr�t");
		System.out.println("2. Walec");
		System.out.println("3. Kula");
		
		System.out.println();
							
		int numer1=klawiatura.nextInt();
		int numer = 1;
				
				
		switch(numer1)
		{
		case 1:	System.out.println("wybrales pret");
	System.out.println("wpisz mas� pr�ta : " );
	pret1.setmasa(klawiatura.nextInt());
	System.out.println("Wpisz d�ugo�� pr�ta: ");
	pret1.setdlugosc(klawiatura.nextInt());
	System.out.println("moment bezwladnosci preta wynosi : "+ pret1.moment_bezw�adno�ci());
	System.out.println("Wpisz odleg�o�� od nowej osi : ");
	pret1.setodleglosc(klawiatura.nextInt());
	System.out.println("moment bezwladnosci wzgledem nowej osi : "+pret1.steiner());
				break;
		case 2:
	System.out.println("wybrales walec");
	System.out.println("wpisz mas� walca : " );
	walec1.setmasa(klawiatura.nextInt());
	System.out.println("Wpisz d�ugo�� promienia walca: ");
	walec1.setpromien(klawiatura.nextInt());
	System.out.println("moment bezwladnosci walca wynosi : "+ walec1.moment_bezw�adno�ci());
	System.out.println("Wpisz odleg�o�� od nowej osi : ");
	walec1.setodleglosc(klawiatura.nextInt());
	System.out.println("moment bezwladnosci wzgledem nowej osi : "+walec1.steiner());		 
	break;
		case 3:
	System.out.println("wybrales Kule");
	System.out.println("wpisz mas� Kuli : " );
	kula1.setmasa(klawiatura.nextInt());
	System.out.println("Wpisz d�ugo�� promienia Kuli: ");
	kula1.setpromien(klawiatura.nextInt());
	System.out.println("moment bezwladnosci kuli wynosi : "+ kula1.moment_bezw�adno�ci());
	System.out.println("Wpisz odleg�o�� od nowej osi : ");
	kula1.setodleglosc(klawiatura.nextInt());
	System.out.println("moment bezwladnosci wzgledem nowej osi : "+kula1.steiner());
	break;
		
				
				
				
				
				
				
		}
				
				
				
			}
				
			
			
			
	}}


