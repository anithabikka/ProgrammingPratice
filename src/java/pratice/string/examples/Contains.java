package stringexamples;

public class Contains {
    public static void main(String[] args) {
//        String name="do you know my name";
////        System.out.println(name.contains("do you"));
////        System.out.println(name.contains("DO YOU"));
//if (name.contains("anitha")){
//    System.out.println("yes it is present");
//
//}else {
//    System.out.println("no the string doesn't contain");
//}


                String str1 = "Hello";
                String str2 = "Javatpoint";
                String str3 = "Reader";
                // Concatenating Space among strings
                String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
                System.out.println(str4);
                // Concatenating Special Chars
                String str5 = str1.concat("!!!");
                System.out.println(str5);
                String str6 = str1.concat("@").concat(str2);
                System.out.println(str6);
            }
        }






