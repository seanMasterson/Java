public class Ex10_1 
{
	public static void main(String[] args) 
	{
		Shape[] shapeArray = new Shape[8];
		
		shapeArray[0] = new Rectangle(4,5, Shape.Colours.BLACK);
		shapeArray[1] = new Triangle(Shape.Colours.PINK);
		shapeArray[2] = new Circle(6, Shape.Colours.GREEN);
		shapeArray[3] = new Shape(Shape.Colours.ORANGE);
		shapeArray[4] = new Rectangle(3,7, Shape.Colours.YELLOW);
		shapeArray[5] = new Triangle(Shape.Colours.BLUE);
		shapeArray[6] = new Circle(8, Shape.Colours.RED);
		shapeArray[7] = new Shape(Shape.Colours.WHITE);
		
		for(Shape shape : shapeArray) 
		{
			System.out.println(shape.toString());
			System.out.println();
		}
	}
}
