import java.util.Scanner;

public class lab1activity2 {
    public static void main(String args[]) {
        Scanner inputObj = new Scanner(System.in);
        
        System.out.println("Input First number: ");
        String xStr = inputObj.nextLine();
        int x = Integer.parseInt(xStr);
        
        System.out.println("Input Second number: ");
        String yStr = inputObj.nextLine();
        int y = Integer.parseInt(yStr);        
        
        
        System.out.println("\nArithmetic Operation: ");
        float add = x + y;
        System.out.println("Addition:" + add);
        float sub = x - y;
        System.out.println("Subtraction:" + sub);
        float mult = x * y;
        System.out.println("Multiplication:" + mult);
        float div = x/y; 
        System.out.println("Division:" + div);
        float mod = x%y;
        System.out.println("Modulus:" + mod);
        float incre = x+1;
        System.out.println("Increment:" + incre);
        float decre = x-1;
        System.out.println("Decrement:" + decre);
    }
}
