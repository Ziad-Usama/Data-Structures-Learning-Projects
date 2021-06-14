import java.lang.annotation.Retention;

public class linearQueueLinkedList {
    QNode Front,Rear;
    public linearQueueLinkedList(){
        Front = Rear = null;
    }
    public boolean Enqueue(int data){
        boolean retval = false;
        QNode node = new QNode(data);
        if(node != null){
            if(Rear == null){
                Front = Rear = node;
            }
            else{
               Rear.Next = node; 
               Rear = node;
            }
            retval = true;
        }
        return retval;
    }
    public QNode Dequeue(){
        QNode retval = Front;
        if(Front != null){
            Front = Front.Next;
            if(Front == null){
                Rear = null;
            }
        }
        return retval;
    }
}
