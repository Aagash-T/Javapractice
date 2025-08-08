public class LargestNum {
    public static int Find(int x,int y,int z){
        if(x>=y && x>=z){
            return x;
        }
        else if(y>=x && y>=z){
            return y;
        }
        else{
            return z;
        }
    }

    public static void main(String[] args) {
        System.out.println("the Largest value is "+ Find(99,99,516));
    }
}


//Using Collections.max() method and ArrayList
/*
// Java Program to Find the Largest of three Numbers
// Using Collections.max() method

import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args)
    {
        int a, b, c;
        // Considering random integers three numbers
        a = 5;
        b = 10;
        c = 3;
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);

        // Printing the largest number
        System.out.println(Collections.max(x)
                           + " is the largest number.");
    }
/*
public class LargestNumber {

  public static void main(String[] args) {
    int num1 = 10, num2 = 20, num3 = 15;
    int largest = Math.max(Math.max(num1, num2), num3);

    System.out.println("The largest number is: " + largest);
  }
}

 */