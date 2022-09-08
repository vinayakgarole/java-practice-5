// area of circle = PI*r*r
// PI = 22/7 or 3.14
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI=3.14,area;
        int r;
        System.out.println("Enter radius of circle: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=PI*r*r;
        System.out.println("Area of circle "+area);
    }
}
