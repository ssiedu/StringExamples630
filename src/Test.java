public class Test {
    private int x, y;
    public Test(int a, int b){x=a;y=b;}
    public void show(){System.out.println(x+","+y);}
    public void change(){
        x++;y++;
    }
}
