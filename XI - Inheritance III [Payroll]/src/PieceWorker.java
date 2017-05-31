import java.time.LocalDate;

public class PieceWorker extends Employee
{
	private int quantity;
	private double wagePerPiece;
	
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	public double getWagePerPiece() 
	{
		return wagePerPiece;
	}
	public void setWagePerPiece(double wagePerPiece) 
	{
		this.wagePerPiece = wagePerPiece;
	}

	@Override
	public double getEarnings() 
	{	
		return wagePerPiece;
	}
	
	public PieceWorker() 
	{
		
	}
	
	public PieceWorker(String firstName, String lastName, LocalDate dob, int quantity, double wagePerPiece) 
	{
		super(firstName, lastName, dob);
		setQuantity(quantity);
		setWagePerPiece(wagePerPiece);
	}
	
	@Override
	public String toString() 
	{
		return "Piece Worker: [" +  super.toString() + 
				", Wage Per Piece: " + String.format("%.2f", getEarnings()) + 
				", Quantity: " + getQuantity() + "]";
	}
}
