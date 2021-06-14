public class linearQueueArr {
    private int size,rear;
    private int[] queue;
    public linearQueueArr(int size){
        this.size = size;
        queue = new int[size];
        rear = 0;
    }
    public linearQueueArr(){
        size = 10;
        queue = new int[size];
        rear = 0;
    }
    public boolean Enqueue(int data){
        boolean retval = false;
        if(rear < size){
            queue[rear] = data;
            rear ++;
            retval = true;
        }
        return retval;
    }
    public int Dequeue(){
        int retval = -1;
        if(rear > 0){
            retval = queue[0];
            for(int i = 0;i < rear-1; i++){
                queue[i] = queue[i+1];
            }
            rear--;
        }
        return retval;
    }
}
