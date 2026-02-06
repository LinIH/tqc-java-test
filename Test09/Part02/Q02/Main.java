
class Main{
	public static void main(String[] args){
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(5, 8);

		System.out.printf("Area of Circle: %.1f\n", c.getArea());
		System.out.printf("Area of Rectangle: %.1f\n", r.getArea());
	}
}