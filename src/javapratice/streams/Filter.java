package javapratice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numberlist =  Arrays.asList(18,37,49,56,28,27);
        List<Integer> evennumber = new ArrayList<>();
        // with out using streams
//        for (int n: numberlist){
//            if (n%2==0)
//                System.out.println(n);
        //with streams
        evennumber=numberlist.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(evennumber);//  this is used to collect the elements
        // if we dont want to collect and just we want print
      //  numberlist.stream().filter(num->num%2==0).forEach(num-> System.out.println(num));

        }
    }

