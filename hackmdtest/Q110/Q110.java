
class Q110{
    public static void main(String[] args){
        double cir = calCircle(5);
        double tri = calTriangle(10, 5);
        double rec = calRectangle(5, 10);
        System.out.printf("圓形面積為：%.6f\n三角形面積為：%.6f\n方形面積為%.6f\n此圖形面積為：%.6f\n", cir, tri, rec, cir + tri + rec);
    }

    public static double calCircle(int length){
        return length * length * 3.1415926;
    }

    public static double calTriangle(int length, int height){
        return length * height / 2.0;
    }

    public static double calRectangle(int length, int height){
        return length * height;
    }
}