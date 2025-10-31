import java.util.Scanner;

public class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length = ");
        int length = sc.nextInt();

        System.out.println("Enter width");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of rectangle is: "+ area);
        System.out.println("Perimeter of rectangle is: "+ perimeter);
    }
}