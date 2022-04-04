package DataStructure;

class Bubble{
    void bubble(int[] ar){
        for(int i=0; i< ar.length-1;i++){
            for(int j=0; j < ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int k=0; k< ar.length;k++){
            System.out.print(ar[k]+" ");
        }


    }
}

class Selection{
    void selection(int ar[]){

        for(int i=0; i<ar.length-1;i++){


        }
    }
}

class BasicSort{
    public static void main(String args[]){
        //lets define bubble sort
        int arr[]={4,5,11,7,8,2,9};
         Bubble b1= new Bubble();
        b1.bubble(arr);
        System.out.println("\n Bubble sorted!");


    }
}