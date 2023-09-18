package javapratice.oopspratice;

public class ExamplesOfConstructor {
//    int i;
//    String name;
//     java_pratice.oops_pratice.ExamplesOfConstructor(){
//        i=20;
//        name="doll";
//
//    }
//     java_pratice.oops_pratice.ExamplesOfConstructor(int n,String str){
//        n=i;
//        str=name;
//    }
//
//    public static void main(String[] args) {
//        java_pratice.oops_pratice.ExamplesOfConstructor obj=new java_pratice.oops_pratice.ExamplesOfConstructor();
//        System.out.println(obj.i);
//        System.out.println(obj.name);
//
  int i;
  String name;

    void anitha(int m,String num){
        i=m;
        name=num;
    }
   // void dislayingormation(){
    //    System.out.println(i+""+name);
 //  }
//
    public static void main(String[] args) {
        ExamplesOfConstructor obj=new ExamplesOfConstructor();

obj.anitha(23,"anitha");
obj.anitha(28,"cool");

        System.out.println(obj.i +" "+ obj.name);
    }

    }















