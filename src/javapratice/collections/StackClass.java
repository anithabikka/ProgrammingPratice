package javapratice.collections;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stk=new Stack<>();
        stk.push("sathya");
        stk.push("kavya");
        stk.push("thanusri");
        stk.push("chandu");
        stk.push("raji");
        System.out.println(stk);
       stk.pop();
        System.out.println(stk);
int location=stk.search("thanusri");
        System.out.println(location);
        System.out.println(stk.size());
    }
}
//        Stack<String> stk= new Stack<>();
////pushing elements into Stack
//        stk.push("Mac Book");
//        stk.push("HP");
//        stk.push("DELL");
//        stk.push("Asus");
//        System.out.println("Stack: " + stk);
//// Search an element
//        int location = stk.search("HP");
//        System.out.println("Location of Dell: " + location);
//    }
//}