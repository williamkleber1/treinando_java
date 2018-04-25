package principal;

public class Main
{
	public static void main(String[] args)
	{
		TV tv1 = new TV(220,590.00,65.0, "samsung");
		TV tv2 = new TV(110,200.9,60.09, "LG");
		Radio radio = new Radio(110,36.8, "phillips");
		System.out.println(tv1.toString());
		System.out.println(radio.toString());
		System.out.println(tv2.toString());
	}

}
