package studia;

public class pret2 extends punkt2 {

	
	
		
	
		
		public float moment_bezw³adnoœci ()//prze³adowanie zmiennej 
		{	
			return getmasa()*d³ugoœæ_prêta*d³ugoœæ_prêta/2;
		}
		public float steiner()
		{
			return moment_bezw³adnoœci()+getmasa()*odleglosc*odleglosc;
		}
		public String opis_obiektu()//opis obiektu
		{
			return "prêt";
		}
		
	

}
