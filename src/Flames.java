import java.util.Scanner;

public class Flames {
    public int FLAMES(String a,String b){
        StringBuffer B=new StringBuffer(a);
        StringBuffer C=new StringBuffer(b);
        for(int i=0;i<B.length();i++){
            char str1=B.charAt(i);
            for(int j=0;j<C.length();j++){
                char str2=C.charAt(j);
                if(str1==str2){
                    B.deleteCharAt(i);
                    C.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        String add=B.toString()+C.toString();
        int len=add.length();
        return len;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Flames F=new Flames();
        String input1=scan.nextLine();
        String input2=scan.nextLine();
        int value=F.FLAMES(input1,input2);
        String game="FLAMES";
        StringBuffer S=new StringBuffer(game);
        int index=0;
        while (S.length() > 1) {
            index = (index + value - 1) % S.length();
            System.out.println(index);
            S.deleteCharAt(index);
        }
        System.out.println(S);
    }
}
