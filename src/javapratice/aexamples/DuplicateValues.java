package javapratice.aexamples;

public class DuplicateValues {
    public static void main(String[] args) {
        int arr[]= new int[]{2,4,7,8,7,8,9,9,2,4,6};
        System.out.println("print the duplicate elements");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
              
            }
        }
    }
}
