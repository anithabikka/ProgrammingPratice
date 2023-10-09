package javapratice.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressionUsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(26);
        num.add(38);
        num.add(56);
        num.add(96);
        num.add(83);
        num.add(345);
        System.out.println(num);
        //Collections.sort(num , (o1,o2)->(o1>o2)?:(o1<o2)?);
        Collections.sort(num, (o1, o2) -> (o1 < o2) ? -1 :
                (o1 > o2) ? 1 : 0);
        System.out.println("elements of arraylist after sorting:"+ num);
 }
}
