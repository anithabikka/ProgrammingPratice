package java_pratice.array_examples.oops_pratice;

class RunTime {
     void run() {
         System.out.println("runtime");
     }
 }
    class compiletime extends RunTime {
        void run() {
            System.out.println("running slowly");

        }


        public static void main(String[] args) {

            RunTime obj=new compiletime();
            obj.run();
        }

    }


