package studia;

public class pret2 extends punkt2 {

	
	
		
	
		
		public float moment_bezw�adno�ci ()//prze�adowanie zmiennej 
		{	
			return getmasa()*d�ugo��_pr�ta*d�ugo��_pr�ta/2;
		}
		public float steiner()
		{
			return moment_bezw�adno�ci()+getmasa()*odleglosc*odleglosc;
		}
		public String opis_obiektu()//opis obiektu
		{
			return "pr�t";
		}
		
	

}
