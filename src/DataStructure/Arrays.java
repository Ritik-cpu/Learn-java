package DataStructure;


import java.util.*;

public class Arrays {
 static void arrayIns(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size");
        int size=scan.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("you array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);;
        }
    }

    public static void main(String args[]){
        //declaring array
      arrayIns();


    }
}
