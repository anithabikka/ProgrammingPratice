package java_pratice.array_examples.oops_pratice;

class Couplin {
//    java_pratice.array_examples.oops_pratice.Couplin( int a,int b) {
//    }
    void scale(){
        System.out.println("my name is");

    }}
    class B extends Couplin{


        void scale( ){
            System.out.println("my name is");
        }
    }
    class Coupling{
        public static void main(String[] args) {
          B s1=new B();
          s1.scale();

        }
    }

