
import java.util.Scanner;


public class StringMethodsOne {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String");
        String s1=sc.next();
        System.out.println("Enter Second String");
        String s2=sc.next();
        //boolean res=s1.equals(s2);
        boolean res=s1.equalsIgnoreCase(s2);
        if(res==true){
            System.out.println("Both Are Same");
        }else{
            System.out.println("Both Are Different");
        }
        
        
        
    }
}
/*
    non-static

    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)
    boolean endsWith(String)
    int compareTo(String)

    int n=s1.compareTo(s2);

    s1>s2   +ve
    s1<s2   -ve
    s1=s2   0





    





*/
