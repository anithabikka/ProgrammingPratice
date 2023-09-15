package java_pratice.array_examples.control_statements_examples;

public class Marks {
    public static void main (String[] args){
        //above 90 outstanding,80-90=excellent,70-80=good,60-70=average,below 70 average,below 35 fail
        int num = 56;
        if (num >= 90){
            
                System.out.println("outstanding");
        } else if(num >= 80 && num <= 90) {
            System.out.println("excellent");
            
        }else if (num >= 70 && num <= 80){
            System.out.println("good");
        } else if (num >= 60 && num <= 70) {
            System.out.println("average");

        } else if (num <70) {
            System.out.println("average");

        }else if(num<35){
            System.out.println("fail");
        }else{
            System.out.println("not mentioned");
        }

    }
}
