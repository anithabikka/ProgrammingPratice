package javapratice.lambdaexpression;

public class MultopleParameterInLambda {
    public static void main(String[] args) {

        interface Parameter1{
            void addition(int a, int b);

          //  void multiplication(int i, int i1);
        }
        interface Parameter2{
            void multiplication(int c, int d);
        }
        Parameter1 obj = (int a,int b)-> System.out.println(a+b);
        Parameter2 obj1  = (int c,int d)-> System.out.println(c*d);
        obj.addition(3,5);
        obj1.multiplication(7,8);


    }
}
