public class LinkedList{
    public static Node Head = null;
    static Node createNode(int data){
        Node node = new Node();
        if(node != null){
            node.data = data;
            node.Next = null;
        }
        return node;
    }
    static boolean addNode(int data){
        Node node = createNode(data);
        boolean retval = false;
        if(node != null){
            if(Head == null){
                Head = node;
            }else{
                Node temp = Head;
                while(temp.Next != null){
                    temp = temp.Next;
                }
                temp.Next = node;
            }
            retval = true;
        }
        return retval;
    }
    static void displayElements(){
        Node temp = Head;
        if(Head == null){
            System.out.println("List is Empty");
    }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.Next;
        }
        System.out.println();
        
}
static int countElements(){
        int count = 0;
            Node temp = Head;
            while(temp != null){
                count++;
                temp = temp.Next;
            }
        return count;
}
static boolean search(int value){
    boolean retval = false;
    Node temp = Head;
    if(Head != null){
        while(temp != null){
            if(temp.data == value){
                retval = true;
                break;
            }
            else{
                temp = temp.Next;
            }
        }
        
    }else{
        return retval;
    }
    return retval;
}
static int findPos(int value){
    int pos = -1;
    if(search(value)){
        pos = 0;
        Node temp = Head;
        while(temp != null){
            if(temp.data == value){
                return pos;
            }
            temp = temp.Next;
            pos++;
        }
    }
    return pos;
}
static void findMaxMin(){
    if(Head != null){
        Node temp = Head;
        int max = Head.data;
        while(temp != null){
            if(temp.data > max){
                max = temp.data;
            }
            temp = temp.Next;
        }
        System.out.println("Maximum Element in the LinkedList = "+max);
        Node tempMin = Head;
        int min = Head.data;
        while(tempMin != null){
            if(tempMin.data < min){
                min = tempMin.data;
            }
            tempMin = tempMin.Next;
        }
        System.out.println("Minimum Element in the LinkedList = "+min);
    }

}
static int findAvg(){
    int sum = 0;
    if(Head != null){
        Node temp;
        temp = Head;
        while(temp != null){
            sum += temp.data;
            temp = temp.Next;
        }

    }
    int avg = sum/countElements();
    return avg;
}
 static void insertNode(int pos, int data){
    Node node = createNode(data); 
    int count = countElements();
    if(pos < 0 || pos > count){
        System.out.println("Error!");
    }else{
        
         if(pos == 0){
            node.Next = Head;
            Head = node;
         }else if(pos == count){
             Node temp = Head;
             while(temp.Next != null){
                 temp = temp.Next;
             }
             temp.Next = node;
         }else{
             Node temp = Head;
             for(int i = 0; i < pos -1; i++){
                temp = temp.Next;
             }
             node.Next = temp.Next;
             temp.Next = node;
         }
 }
 }
 static void deleteNode(int pos){
    int count = countElements();
    if(pos < 0 || pos> count){
        System.out.println("Error!");
    }else{
    if(pos == 0){
        Head = Head.Next;
    }else if(pos == count){
         Node beforeLast = Head;
         Node Last = Head.Next;
         while(Last != null){
             Last = Last.Next;
             beforeLast = beforeLast.Next;
         }
         beforeLast.Next = null;
    }
    else{
        Node temp = Head;
        for(int i =0 ; i< pos -1; i++){
            temp = temp.Next;
        }
        temp.Next = temp.Next.Next;
    }
}
}
static void updateNode(int data, int newdata){
     int pos = findPos(data); 
     if(pos == -1){
         System.out.println("Error");
     }else{
         Node temp = Head;
         while(temp.data != data){
             temp = temp.Next;
         }
         temp.data = newdata;
     }
}

 static int countEven(){
     int count = 0 ;
     if(Head != null){
        Node temp = Head;
        while(temp!=null){
            count++;
            Node s = temp.Next;
            if(s != null){
                temp = s.Next;
            }else{
                return count;
            }
        }
        
     }else{
         return count;
     }
     return count;
 }


}
