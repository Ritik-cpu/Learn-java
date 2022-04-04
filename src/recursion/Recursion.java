package recursion;


//1print number N using recursion
//sum

public class Recursion {
    public static void printNm(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printNm(num-1);
    }
    //sum------


    public static void printInc(int num){
            if(num==6){
                return;
            }
        System.out.println(num);
        printInc(num+1);

    }

    public static void main(String args[]){
        int n=1;
        printNm(5);
        System.out.println("increase");
        printInc(n);
    }

}
