package basic;
import java.util.*;

class Student{
    int roll_no;
    String name;
    Student(int roll_no,String name ){
        this.roll_no=roll_no;
        this.name=name;

    }
}
public class Array1 {
    public static void main(String args[]){
        Student s1=new Student(20,"ritik");
        Student[] arr;

        //allocation memory for object
        arr= new Student[5];

        System.out.println(s1.name);
        arr[0]=new Student(1,"Ninja");
        arr[1]=new Student(2,"sumit");
        arr[2]=new Student(4,"randhawa");
        arr[3] = new Student(2,"vaibhav");
        arr[4] = new Student(1,"aman");

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].roll_no+" "+arr[i].name);
        }

        //Arrays class in Java
        int Arr[]={10,20,3,0,4,56,66,4,45,66};
        int Arr2[]={10,33,4,4,56,6,5,55,8};
        System.out.println(Arrays.compare(Arr,Arr2));
        System.out.println( Arrays.asList(Arr));


    }
}
