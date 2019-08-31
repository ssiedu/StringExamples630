
import java.util.Scanner;


public class StringMethodsTwo {
    public static void main(String[] args) {
        System.out.println("Enter Your Pincode");
        Scanner sc=new Scanner(System.in);
        String pin=sc.next();
        
        if(pin.startsWith("452")){
            System.out.println("North Region");
        }else if(pin.startsWith("453")){
            System.out.println("South Region");
        }else if(pin.startsWith("454")){
            System.out.println("East Region");
        }else if(pin.startsWith("455")){
            System.out.println("West Region");
        }else{
            System.out.println("Invalid PIN");
        }
    }
}
