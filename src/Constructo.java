public class Constructo {
    static void sum(int y,int z){
        System.out.println(y+z);
    }
    Constructo(){
        System.out.println("hi there");
    }
    Constructo(int x){
        System.out.println("the value of construtor:"+x);
    }

    public static void main(String[] args) {
        Constructo i=new Constructo(10);
        sum(45,89);
    }
}
