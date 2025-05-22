import java.util.Scanner;
public class err2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        float a=Sc.nextFloat(); float b= Sc.nextFloat();
        try {
            float c = a / b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("we can not divide by zero ");
        }
    }
}
