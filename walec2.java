package studia;

public class walec2 extends punkt2 {

	
	public float moment_bezwładności ()
	{
		return getmasa()*promien*promien/2;
	}
	public float steiner()
	{
		return moment_bezwładności()+getmasa()*odleglosc*odleglosc;
	}
	public String opis_obiektu()
	{
		return "walec";
	}
}
