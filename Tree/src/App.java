public class App {
    public static void main(String[] args){
        binaryTree bt = new binaryTree();
        bt.Insert(20);
        bt.Insert(50);
        bt.Insert(100);
        System.out.println(bt.Count());
    }
}
