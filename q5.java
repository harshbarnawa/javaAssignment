import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheit = (celsius * 1.8f) + 32;

        System.out.println("Fahrenheit: "+ fahrenheit);
        sc.close();

    }
}