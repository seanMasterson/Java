import java.util.ArrayList;

public class BasicArrayList 
{
	public static void main(String[] args) 
	{
		String s1 = "one";
		String s2 = "two";
		String s3 = "three";
		String s4 = "four";
		String s5 = "five";
		String s6 = "six";
		
		ArrayList<String> nums = new ArrayList<String>();
		nums.add(s1);
		nums.add(s2);
		nums.add(s3);
		nums.add(s4);
		nums.add(s5);
		nums.add(s6);
		
		System.out.println(nums);
	}
}
