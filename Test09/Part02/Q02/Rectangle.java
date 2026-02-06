
class Rectangle implements Shape{
	private double width;
	private double height;

	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double getArea(){
		return this.width * this.height;
	}
}