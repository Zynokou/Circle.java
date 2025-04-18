import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        
        //Variable declaration
        double radius;
        Scanner sc = new Scanner(System.in);

        //Declaration of results
        double area;
        double circumference;

        //Variable entry
        System.out.println("What is the radius of your circle ?");
        radius = sc.nextDouble();

        //Data processing
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        //Display of results
        System.out.println("The circumference of your circle is " + circumference + " and its area is " + area);
    
        //Closing the scanner
        sc.close();
    }
}