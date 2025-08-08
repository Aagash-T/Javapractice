public class LCM {//Least Common Multiple

    public static void main(String[] args) {
        int a=15;
        int b=26;
        int ans =(a>b)?a:b;
        while(true){
            if(ans%a==0 && ans%b==0){
                break;
            }
            ans++;
        }
        System.out.println("The LCM of "+a+" and "+b+" is "+ans);
    }
}
