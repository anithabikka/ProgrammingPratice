package java_pratice.array_examples.oops_pratice;

class ParentClas {
    void fatherMother(){
        System.out.println("good in studying");

    }}
 class Daughter extends ParentClas{
        void dau() {
            System.out.println("good at studies");

    }
}
 class Parentclass{
     public static void main(String[] args) {
         Daughter obj = new Daughter();
         obj.dau();
         obj.fatherMother();
     }}

