package javapratice.stringexamples;

public class InternExample {
    public static void main(String[] args) {
        String name="mainclass";
        String name2=name.intern();
        String name3= new String("java").intern();
        String name4=name3.intern();
        System.out.println(name==name2);
        System.out.println(name3==name2);
        System.out.println(name3==name4);

    }
}
