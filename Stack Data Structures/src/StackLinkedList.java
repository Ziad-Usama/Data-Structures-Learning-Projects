public class StackLinkedList {
    public static StackNode Tail = null;
    public static boolean pushData(int data){
        boolean retval = false;
        StackNode node = new StackNode(data);
        if(node != null){
            node.prev = Tail;   
            Tail = node;
            retval = true;
        }
        return retval;
    }

    public static StackNode popStack(){
        StackNode retval = Tail;
        if(Tail != null){
        Tail = Tail.prev;
    }
        return retval;

    }
}
