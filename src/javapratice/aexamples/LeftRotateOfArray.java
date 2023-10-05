package javapratice.aexamples;

public class LeftRotateOfArray {
    public static void main(String[] args) {
        int arr[] = new int[]{34,4,7,8,9,14};
        System.out.println("print the original array");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);}
        System.out.println("print the reverse order");
            for (int j= arr.length-1;j>=0;j--){
                //arr[j]=arr[j+1];

            System.out.println(arr[j]);
        }
    }
}
