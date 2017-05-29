public class Ex10_1 
{
	public static void main(String[] args) 
	{
		Shape[] shapeArray = new Shape[4];
		
		shapeArray[0] = new Rectangle(4,5, Shape.Colours.BLACK);
		shapeArray[1] = new Triangle(Shape.Colours.PINK);
		shapeArray[2] = new Circle(6, Shape.Colours.GREEN);
		shapeArray[3] = new Shape();
		
		for(Shape shape : shapeArray) 
		{
			System.out.println(shape.toString());
		}
	}
}
