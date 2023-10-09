package javapratice.controlstatementsexamples;

public class PractiseOnJava {
static int y =50;
static int b;
    int x= 100809;
    void number(){
        int a = 25;
       // System.out.println(z); // gets an error bcoz we cant access out side the method
        System.out.println(x);
        System.out.println(a);
        System.out.println(y);
      //  System.out.println(num);
        //System.out.println( obj.x);// gets an error bcoz reference varaible should be used with in the method
    }
    public int num(){
        return 10;
    }
    public static void main(String[] args) {
        int z = 45;
        PractiseOnJava obj = new PractiseOnJava();
        int sd = 23;
       System.out.println(obj.x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(obj.b);
        obj.number();
        System.out.println(obj.num());
       // System.out.println(a);// it will get an error
       // System.out.println(obj.a);
       // System.out.println(pr);
        }


}
