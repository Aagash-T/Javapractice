import java.util.Scanner;

public class MultipleFloatingpoint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the float value1:");
        float num1=s.nextFloat();
        System.out.println("enter the float value2:");
        float num2=s.nextFloat();
        float result=num1*num2;
        System.out.println("Result:"+result);
    }
}
