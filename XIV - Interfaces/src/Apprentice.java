public interface Apprentice 
{
	public static final int PHASE_ONE = 1;
	public static final int PHASE_TWO = 2;
	public static final int PHASE_THREE = 3;
	public static final int PHASE_FOUR = 4;
	public static final int PHASE_FIVE = 5;
	public static final int PHASE_SIX = 6;
		
	public int getPhases();
	public void setPhases(int phases);
	
	public String getEmployersName();
	public void setEmployersName(String employersName);
}
