public class Ex16_3 
{
	public static void main(String[] args) 
	{
		StringBuilder todayMenu = new StringBuilder("Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.");
		System.out.println(todayMenu);
		
		//a
		String string0 = todayMenu.substring(todayMenu.indexOf(" "), todayMenu.length());
		String tomorrowMenu = "Thursday's";
		tomorrowMenu = tomorrowMenu.concat(string0);
		System.out.println(tomorrowMenu);
		
		//b
		String beef = "beef";
		String newMenu = tomorrowMenu.replaceAll("turkey", beef);
		System.out.println(newMenu);
		
		//c
		System.out.println(newMenu = newMenu.concat(" Jelly and Ice Cream for Dessert."));
		
		//d
		System.out.println(newMenu.replaceAll(" and Ice Cream ", " "));
	}
}
