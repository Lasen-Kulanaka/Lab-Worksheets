import java.util.Scanner;

class Circle{
    public static int setRadius(){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        return r;
    }

    public static double computeArea(int radius) {
        double area = (double) (Math.PI*radius*radius);
        return area;
    }

    public static double computeCircumference(int radius){
        double circumference = (double) (2*Math.PI*radius);
        return circumference;
    }
}

public class Q5 {
    public static void main (String[] args){
        System.out.println("Enter the radius of the inner circle : ");
        int ri = Circle.setRadius();
        System.out.println("Enter the radius of the outer circle : ");
        int ro = Circle.setRadius();
        double shadedArea = Circle.computeArea(ro) - Circle.computeArea(ri);
        System.out.println("Shaded Area is " +shadedArea);
        double innerCircleCircumference = Circle.computeCircumference(ri);
        double outerCircleCircumfrence = Circle.computeCircumference(ro);
        System.out.println("Circumference of inner circle is " +innerCircleCircumference+  " and the circumference of outer circle is " +outerCircleCircumfrence);
    }
}
