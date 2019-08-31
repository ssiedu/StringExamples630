
public class StringConstructors {

    public static void show(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        String s1 = new String("indore");
        show(s1);
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String s2=new String(ch);
        show(s2);
        String s3=new String(ch,0,4);
        show(s3);
        byte b[]={65,66,67,68,69,70,71,72,73,74,75,76};
        String s4=new String(b);
        show(s4);
        String s5=new String(b,1,4);
        show(s5);
        
        
        
        
    }
}
/*
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)
*/
