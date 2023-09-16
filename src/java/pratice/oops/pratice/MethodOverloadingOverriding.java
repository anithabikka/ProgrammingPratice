package java.pratice.oops.pratice;

public class MethodOverloadingOverriding {


    void method1(int a, int b){
        System.out.println(a+b);

    }
    void method1(int a,int b,int c){
        System.out.println(a+b+c);

    }


    public static void main(String[] args) {
        MethodOverloadingOverriding obj=new MethodOverloadingOverriding();
        obj.method1(29,59);
//        java_pratice.oops_pratice.MethodOverloadingOverriding obj2=new java_pratice.oops_pratice.MethodOverloadingOverriding();
        obj.method1(25,24,29);






    }
}
