package ch5ex16;
import java.util.Scanner;
import java.lang.Math;

public class Ch5Ex16 {

    public static void main(String[] args) {
        double angle,rad;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the degree of an angle");
            angle=input.nextInt();
            
            rad=Math.toRadians(angle);
            
            System.out.format("Sin: %.2f\n",Math.sin(rad));
            System.out.format("Cos: %.2f\n",Math.cos(rad));
            System.out.format("Tan: %.2f\n",Math.tan(rad));
            
    }
    
}
