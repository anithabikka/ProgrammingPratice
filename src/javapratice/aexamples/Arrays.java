package javapratice.aexamples;

public class Arrays {
    public static int[] get(){
       return new int[]{4,6,82,85};

    }
    public static void main(String[] args) {
//        String[] name={"lela","sai","harish","dinesh"};
//        for (int i=0;i<=name.length;i++){
//            System.out.println(name[i]);
//        }
        int[] num = get();
//        int i;
//        for ( int i = 0; i < num.length; i++) {
        for (int i:num){
            System.out.println(i);

        }}
}
