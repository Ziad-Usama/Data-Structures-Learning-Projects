import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList x = new LinkedList();
        x.addNode(0);
        x.addNode(1);
        x.addNode(2);
        x.addNode(3);
        x.addNode(4);
        //  x.displayElements();
        // System.out.println(x.countElements());
        // System.out.println(x.search(100));
        // System.out.println(x.findPos(0));
        // x.findMaxMin();
        // System.out.println(x.findAvg());
        x.displayElements();
        // x.insertNode(2, 30);
        System.out.println(x.countEven());
        
    }
}
