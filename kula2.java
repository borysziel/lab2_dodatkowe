package studia;

public class kula2 extends punkt2 {
	
	
		
		
		public float moment_bezw�adno�ci ()
		{
			return getmasa()*promien*promien/2;
		}
		public float steiner()
		{
			return moment_bezw�adno�ci()+getmasa()*odleglosc*odleglosc;
		}
		public String opis_obiektu()
		{
			return "kula";
		}
	}


