package basic;

public class Strings {
    public static void main(String args[]){
        String s1="this is string"; //in java string use in double quotes
        System.out.println("s1"); //this line to use print string
        String s2="this is second string";
        System.out.println(s1+s2); //concatenate the string

        //string using new operator
        String s3= new String("third string");
        System.out.println(s3);

        //constructor is new string to use decoding the array bite array
        byte[] arr={90,86,89,81,88,76,87};
        String s4 =new String(arr);
        System.out.println(s4);
        String s5=new String(arr,1,4); //start to length of string
        System.out.println(s5);

         char as[]={'l','o','v','e'};
         String s6=new String(as);
        System.out.println(s6);

        //string methods
        //find length of string
        int len=s2.length();
        System.out.println(len);

        //return the character at ith index
        char c=s3.charAt(4);
        System.out.println(c);

        //substring from ith to end
        String s7=s2.substring(3);
        String s8=s2.substring(3,7);
        System.out.print(s7+"\n"+s8+"\n"+s7.concat(s8));

        int index=s2.indexOf("s");
        int fnd=s2.indexOf("i",3);
        System.out.println(index);
        System.out.println(fnd);

        int output = s2.lastIndexOf("i");





    }
}
