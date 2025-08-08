public class AddBinaryString {
    public static String Add_binary(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int num3=num1+num2;
        String result=Integer.toBinaryString(num3);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Add_binary("011011","1010111"));

    }
}
