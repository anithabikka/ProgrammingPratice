package javapratice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
    int empid;
    String name;
    int salary;


    FilterAndMap(int empid,String name,int salary){
        this.empid = empid ;
        this. name = name;
        this. salary = salary;}

    public static void main(String[] args) {
        List<FilterAndMap> employee = Arrays.asList(
                new FilterAndMap(111,"gowthami",20000),
        new FilterAndMap(112,"anjali",30000),
        new FilterAndMap(113,"kusuma",28000),
                new FilterAndMap(114,"geethu",35000),
                new FilterAndMap(115,"reshma",40000)
        );
        List employeelist = new ArrayList<>();
       employeelist= employee.stream().filter(emp->emp.salary>25000).map(emp->emp.empid).collect(Collectors.toList());
        System.out.println(employeelist);

    }





}
