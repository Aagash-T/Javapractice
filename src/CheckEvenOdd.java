import java.util.Scanner;

public class CheckEvenOdd {
    public static void Check(int a){
        if(a%2==0){
            System.out.println("The Number "+a+" is Even.");
        }
        else{
            System.out.println("The Number "+a+" is Odd.");
        }
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        Check(num);
    }
}
