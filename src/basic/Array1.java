package basic;

class Student{
    int roll_no;
    String name;
    Student(int roll_no,String name ){
        this.roll_no=roll_no;
        this.name=name;

    }
}

class ArrayProblem{
    //maximum element of array
    int ArrMax(int[] ar){  // 4 5 6 5 8 9 7 4 6
        int max=0;
        for(int i=0;i< ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
    //sum of array
    int sumArr(int [] ar){ //1 5 4 6 7
        int sum=0;
        for(int i=0; i<ar.length;i++){
            sum=ar[i]+sum;

        }
        return sum;
    }

    int Fibo(){

        return 0;
    }

    // sum of two array ar1 and ar2
    void twoArrAdd(int[] arr1, int[]arr2,int lengths){
        System.out.println("the sum of array:");
        for(int i=0;i<lengths;i++ ){
            System.out.println( arr1[i]+arr2[i]);
        }

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

        //array problem
        int[] list={4,5,6,7,8,9,41,2,3,4,5};
        ArrayProblem A1 = new ArrayProblem();
        int maxValue=A1.ArrMax(list);
        int sumValue=A1.sumArr(list);
        System.out.println("the maximum is :" +maxValue);
        System.out.println("the sum is: "+sumValue);
        // array arr1 add arr2
        int[] arr1={2,4,6};
        int[] arr2={3,5,1};
        int lengths=3;
        A1.twoArrAdd(arr1,arr2,lengths);


        //fibonacci series
    }
}
