
class Circle implements Shape{
	private double radius;

	Circle(double radius){
		this.radius = radius;
	}

	public double getArea(){
		return PI * this.radius * this.radius;
	}
}