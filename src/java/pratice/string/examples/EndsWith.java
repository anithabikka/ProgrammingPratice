package java.pratice.string.examples;

public class EndsWith {
    public static void main(String[] args) {
//        String name="i am working";
//        if (name.endsWith("ing")){
//            System.out.println(" yes the string name ends with ing");
//        }
//        else{
//            System.out.println(" it does not end with ing");
//        }
        String str = "a";   // String
        String str1 = "123";
        String str2 = "45.89";
        String str3 = "false";
        Character c = new Character('A');  // char
        Integer i = new Integer(123);  // int
        Float f = new Float(45.89); // float
        Boolean b = new Boolean(false); // boolean

        System.out.println(str.equals(c)); // false

        System.out.println(str1.equals(i)); // false

        System.out.println(str2.equals(f)); // 

        System.out.println(str3.equals(b));

        System.out.println(str.equals(c.toString())); // true
        System.out.println(str1.equals(i.toString()));
        System.out.println(str2.equals(f.toString()));
        System.out.println(str3.equals(b.toString()));
    }
}








