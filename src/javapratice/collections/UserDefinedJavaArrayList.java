package javapratice.collections;

import javapratice.oopspratice.Student;
import java.util.*;
public class UserDefinedJavaArrayList {
    public static void main(String[] args) {

        Student s1=new Student(101,"ayesha",23);
        Student s2=new Student(102,"sahasra",25);
        Student s3=new Student(103,"manish sai",31);
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            Student str= (Student) itr.next();
            System.out.println(str.rollno+" "+str.name+" "+str.id);



        }
    }
}
