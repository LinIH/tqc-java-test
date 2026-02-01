
class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return this.width * this.height;
    }

    @Override
    public void printInfo(){
        System.out.println("This is a rectangle.");
    }
}