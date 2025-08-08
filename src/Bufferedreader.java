import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        System.out.println("num:");
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(is);
        int num=Integer.parseInt(in.readLine());
        System.out.println(num);
        in.close();
    }
}
