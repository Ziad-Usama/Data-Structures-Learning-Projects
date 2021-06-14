public class App {
    public static void main(String[] args){
        StackArr s1 = new StackArr(5);
        s1.pushStack(1);
        s1.pushStack(2);
        s1.pushStack(3);
        s1.pushStack(4);
        s1.pushStack(5);
        poper(s1);
  }

  public static void poper(StackArr s){
        while(!s.isEmpty()){
            System.out.println(s.popStack());
        }
  }
}
