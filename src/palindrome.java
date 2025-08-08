import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input:");
        String q=s.nextLine();
        if(ispalindrome(q)){
            System.out.println("this is a palindrome");
        }
        else{
            System.out.println("this is not a palindrome");
        }
    }
    public static boolean ispalindrome(String q){
        int left=0;
        int right=q.length()-1;
        while(left<right){
            if(q.charAt(left)!=q.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
