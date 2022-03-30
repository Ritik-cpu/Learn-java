package basic;

import java.util.*;

public class DateTime {
    public static void main(String[] args){

        Date date=new Date(45222222223L); //date object using milliseconds
        System.out.println(date);
        Date date1=new Date();//it is use for current date time
        System.out.println(date1);

        Date date2=new Date(2000,11,21); //return the day name
        System.out.println(date2);

//        Date(int year, int month, int date, int hrs, int min)
//        Date(int year, int month, int date, int hrs, int min, int sec)
//        Date(String s)



    }
}


