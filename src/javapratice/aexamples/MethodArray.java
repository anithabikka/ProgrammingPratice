package javapratice.aexamples;

public class MethodArray {
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

        System.out.println(min);
    }

    public static void main(String args[]){
        int a[]={33,3,4,5};//declaring and initializing an array
        min(a);//passing array to method
        int b[]={55,87,89,25};
        min(b);
    }}
