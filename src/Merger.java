import java.util.Scanner;

public class Merger {

	private long n1;
    private long n2;
    private long mergeNum;
    
    public Merger(){
        n1 = 0L;
        n2 = 0L;
        mergeNum = 0L;
    }
    
    public void readNum(){
    	Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        n1 = sc.nextInt();
        if(n1 <= 0)
            n1 = 1;
        System.out.print("Second number: ");
        n2 = sc.nextInt();
        if(n2 <= 0)
            n2 = 1;
        sc.close();
    }
    
    public void joinNum(){
        String a = Long.toString(n1);
        String b = Long.toString(n2);
        String c = a + b;
        mergeNum = Long.parseLong(c);
    }
    
    public void show(){
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);
        System.out.println("Merged number: " + mergeNum);
    }
    
    public static void main(String args[])
    {
        Merger obj = new Merger();
        obj.readNum();
        obj.joinNum();
        obj.show();
    }


}
