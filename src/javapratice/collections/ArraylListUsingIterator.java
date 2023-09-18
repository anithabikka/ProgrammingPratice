package javapratice.collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylListUsingIterator {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("mango");
        list1.add("orange");
        list1.add("grapes");
        list1.add("pineapple");
//        Iterator itr= list1.iterator();
//        while (itr.hasNext()){
        for (String fruit:list1){
        System.out.println(fruit);
    }}
}
