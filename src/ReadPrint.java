import java.util.Scanner;
public class ReadPrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the value:");
        int i=s.nextInt();
        System.out.println("entered value is:"+i);
        s.close();
    }
}
