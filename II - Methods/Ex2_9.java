public class Ex2_9 
{
	public static void main(String [] args) 
	{
		Ex2_9 n0 = new Ex2_9();
		
		double tempC = 45.3;
		double tempF = 61.4;
		
		double answerC = n0.convertToCelsius(tempF);
		System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.\n", tempF, answerC);
		
		double answerF = n0.convertToFahrenheit(tempC);
		System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.\n", tempC, answerF);
	}
	
	public double convertToCelsius(double temperature) 
	{
		double conversion = (5.0 / 9.0) * (temperature - 32.0);
		return conversion;
	}
	
	public double convertToFahrenheit(double temperature) 
	{
		double conversion = ((9.0 / 5.0) * temperature) + 32.0;
		return conversion;
	}
}