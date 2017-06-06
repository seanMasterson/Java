public interface Apprentice 
{
	enum Phases 
	{
		PHASE_ONE(1), PHASE_TWO(2), PHASE_THREE(3), PHASE_FOUR(4), PHASE_FIVE(5);
		
		private int phaseNum;
		
		Phases(int phaseNum) 
		{
			this.phaseNum = phaseNum;
		}
		
		public int getPhaseNum() 
		{
			return phaseNum;
		}
	};	
	
	public int getPhase();
	public void setPhase(int phase);
	
	public String getEmployersName();
	public void setEmployersName(String employersName);
}
