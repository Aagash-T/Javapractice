import java.util.Scanner;

public class DaycCalc {
    public int Days(int date,int month,int year){
        if(year>=1000){
            if(year==2000){
                year=year-1;
            }
            int y1=(year/100)*100;
            int num=(y1/400)*400;
            int bal=y1-num;
            if(num%400==0){
                num=0;
            }
            if(bal==100){
                bal=5;
            }
            else if(bal==200){
                bal=3;
            }
            else if(bal==300){
                bal=1;
            }
            else{
                bal=0;
            }
            int y2=0;
            if(year==2000){
                y2=(year%100);
            }
            else { y2=(year%100)-1;}

            int e=y2/4;
            int f=e*2;
            int g=y2-e;
            int h=(g+f)%7;
            int[] monthleap={31,29,31,30,31,30,31,31,30,31,30,31};
            int[] monthnonleap={31,28,31,30,31,30,31,31,30,31,30,31};
            int totalDays=0;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                for (int i = 0; i < month - 1; i++) {
                    totalDays += monthleap[i];
                }
            } else {
                for (int i = 0; i < month - 1; i++) {
                    totalDays += monthnonleap[i];
                }
            }

            totalDays += date;
            int dayCode = (bal + h + totalDays) % 7;
            return dayCode;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        DaycCalc D=new DaycCalc();
        System.out.print("Enter the Year:");
        int year=scan.nextInt();
        System.out.print("Enter the Month:");
        int month =scan.nextInt();
        System.out.print("Enter the Date:");
        int date=scan.nextInt();
        System.out.println(date+"."+month+"."+year);
        if (month <= 0 || month > 12) {
            System.out.println("Invalid month");
            return;
        }
        if (date <= 0 || date > 31) {
            System.out.println("Invalid date");
            return;
        }
        int choice=D.Days(date,month,year);
        switch(choice){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid flag");
        }
        if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
