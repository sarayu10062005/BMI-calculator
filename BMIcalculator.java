import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter weight");
            double a=sc.nextDouble();
            System.out.println("enter height");
            double h=sc.nextDouble();
            System.out.println("BMI: "+(a/h*h));
        }
    
    }
    
}

