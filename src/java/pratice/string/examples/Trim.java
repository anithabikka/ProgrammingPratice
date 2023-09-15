package stringexamples;

public class Trim {
    public static void main(String[] args) {
        String name= " hello people ";

        System.out.println(name.length());
        System.out.println(name);
        //String name1=name.trim();
        System.out.println((name.trim()).length());
        System.out.println(name);
    }
}
