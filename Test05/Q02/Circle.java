
class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return this.radius * this.radius * Math.PI;
    }
}