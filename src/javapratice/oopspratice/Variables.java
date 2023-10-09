package javapratice.oopspratice;
class Variables {
   protected static int num = 90;
    public int getNum() {
        return num;
    }
}

class Variables2 extends Variables{
    public static void main(String args[]){
        System.out.println(Variables.num);
    }}
