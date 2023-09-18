package javapratice.collections;
import java.util.*;

public class RetainALL {
    
        public static void main(String args[]){
            ArrayList<String> al=new ArrayList<String>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ajay");
            ArrayList<String> al2=new ArrayList<String>();
            al2.add("Ashok");
            al2.add("Ayesha");
            al.retainAll(al2);
            System.out.println("iterating the elements after retaining the elements of al2");
            Iterator itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }

    }
