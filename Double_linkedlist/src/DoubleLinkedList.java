public class DoubleLinkedList {
    static Node Head = null;
    static Node Tail = null;

static Node createNode(int data){
   Node node = new Node(); 
   if(node != null){
       node.Data = data;
       node.Prev = null;
       node.Next = null;
    
    }
    return node;
}
public static boolean addNode(int data){
        boolean retval = false;
        Node node = createNode(data);
        if(node != null){
            if(Head == null){
             Head = node;
             Tail = node;
            }else{
                Tail.Next = node;
                node.Prev = Tail;
                Tail = node;
            }
            retval = true;
            
    }
        return retval;
}
public static Node searchNode(int data){
    Node node ;
    node = Head;
    while(node!=null && node.Data != data){
        node = node.Next;
    }
    return node;
}
public static boolean insertNode(int data, int loc){
    boolean retval = false;
    Node node = createNode(data);
     if(node != null){
         if(Head == null){
             Head = Tail = node;
     }else{
        if(loc == 0){
            node.Next = Head;
            Head.Prev = node;
            Head = node;
           
        }else{
            Node temp;
            temp = Head;
            for(int i = 0 ; i < loc-1 && temp != null; i++){
                temp = temp.Next;
            }
            if(temp == null || temp == Tail){
                Tail.Next = node;
                node.Prev = Tail;
                Tail = node;
            }else{
               temp.Next.Prev = node;
               node.Next = temp.Next;
               node.Prev = temp;
               temp.Next = node; 
            }
           
        
     }
    
    }
    retval = true;
}
return retval;
}

public static boolean deleteNode(int loc){
    boolean retval = false;
    
    if(Head != null){
        if(loc == 0){
            if(Head == Tail){
            Head = Tail = null;
            }else{
                Head = Head.Next;
                Head.Prev = null;
            }
            retval = true;
        }else{
            Node temp;
            temp = Head;
            for(int i = 0; i< loc && temp != null; i++){
                    temp = temp.Next;
            }if(temp != null){
                if(temp == Tail){
                    Tail = Tail.Prev;
                    Tail.Next = null;
                }else{
                    temp.Next.Prev = temp.Prev;
                    temp.Prev.Next = temp.Next;
                } 
                retval = true;               
            }
        }
}
    
    
    return retval;
}
}
