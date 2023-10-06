package javapratice.lamdaexpression;

import java.util.ArrayList;

public class ArrayListParameterInLamda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(56);
        arr.add(27);
        arr.add(39);
        arr.add(29);
        arr.add(10);
        arr.forEach(y-> System.out.println(y));
        arr.forEach(y->{
            if (y%2==0)
                System.out.println(y);

        });

    }
}
