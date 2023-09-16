package java.pratice.array.examples;

public class MultiDimensional {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{2,5,6},{4,5,6}};
        int[][]arr1={{3,4,6},{5,8,9},{6,8,9}};
        int c[][] =new int[3][3];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                c[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        }
}
