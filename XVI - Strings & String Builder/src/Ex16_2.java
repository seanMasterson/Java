public class Ex16_2 
{
	public static void main(String[] args) 
	{
		String todayMenu = "Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		System.out.println(todayMenu);
		
		//a
		String string0 = todayMenu.substring(11, todayMenu.length());
		String tomorrowMenu = "Thursday's";
		tomorrowMenu = tomorrowMenu.concat(string0);
		System.out.println(tomorrowMenu);
		
		//b
		String beef = "beef";
		String newMenu = tomorrowMenu.replaceAll("turkey", beef);
		System.out.println(newMenu);
		
		//c
		System.out.println(newMenu + " Jelly and Ice Cream for Dessert.");
		
		//d
		String regex = "\band\bIce\bCream.";
		System.out.println(newMenu.substring(regex, newMenu.length()));
		
	}
}
