package basic;


class TwoD_arrBasic{
    void Print2Dar(int [][] ar){
        for(int i=0;i< ar.length;i++){
            System.out.println();
            for(int j=0;j< ar[i].length;j++){
                System.out.print(" "+ar[i][j]);
            }
        }
    }
}
class TwoD_arrProblem{
    //addition of array
    void addition_arr(int[][] ar1,int[][] ar2){
        int[][] sums = new int[2][3];
        for(int i=0;i< ar1.length;i++){
            System.out.println();
            for(int j=0;j< ar1[i].length;j++){
                sums[i][j]=ar1[i][j]+ar2[i][j];
            }

        }
    }
}
public class Array2D {
    public static void main(String args[]){
        int [][] ar1={ { 1, 2, 3 }, { 4, 5, 6 } };
        int [][] ar2={ { 1, 2, 3 }, { 4, 5, 6 } };

        TwoD_arrBasic t1 = new TwoD_arrBasic();
        t1.Print2Dar(ar1);

        //problem on 2d array
        TwoD_arrProblem p=new TwoD_arrProblem();
        p.addition_arr(ar1,ar2);
    }
}
