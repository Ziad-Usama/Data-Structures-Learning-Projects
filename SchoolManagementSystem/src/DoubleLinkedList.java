import java.util.*;
public class DoubleLinkedList {
    static Node Head;
    static  Node Tail;
    public Node createNode(String NAME, long ID,double GPA,String DEP){
        Node node = new Node();
        if(node != null){
            node.name = NAME;
            node.id = ID;
            node.gpa = GPA;
            node.dep = DEP;
            node.Next = null;
            node.Prev = null;
        }
        return node;
    }
    public boolean addNode(String NAME, long ID,double GPA,String DEP){
        boolean retval = false;
                Node node = createNode(NAME,ID,GPA,DEP);
                if(node != null){
                    if(Head == null){
                        Head = Tail = node;
                    }else{
                        Tail.Next = node;
                        node.Prev = Tail;
                        Tail = node;
                    }
                    retval = true;
                }
                
        return retval;
    }
public void DeleteById(long StudentID){
        Node current = Head;

    if (Head == null) {
            System.out.println("No students found");
        }else{
            
    if (Head == Tail && Head.id == StudentID) {   //We want to delete the first node 
        Head = Tail = null;
    }

else if(Head.id == StudentID){
    Head.Next.Prev = null;
    Head = Head.Next;
}
else{

        while(current.id != StudentID){  //We want to delete middle or last node
            current=current.Next;

            if(current==null){
                System.out.println("No student found with this ID");
            }
        }


        if(current != null){      //there is a node to delete
            if(current == Tail){         //We want to delete the last node

                Tail = Tail.Prev;
                Tail.Next = null;

            }
            else{   //Middle node is to be deleted

            current.Prev.Next = current.Next;
            current.Next.Prev = current.Prev;

            }

        }
    }
}
}

public void DeleteByName(String StudentName){
    Node current = Head;

if (Head == null) {
        System.out.println("No students found");
    }else{
        
if (Head == Tail && Head.name == StudentName) {   //We want to delete the first node 
    Head = Tail = null;
}

else if(Head.name == StudentName){
Head.Next.Prev = null;
Head = Head.Next;
}
else{

    while(current.name.compareTo(StudentName) != 0){  //We want to delete middle or last node
        current=current.Next;

        if(current==null){
            System.out.println("No student found with this Name");
        }
    }


    if(current != null){      //there is a node to delete
        if(current == Tail){         //We want to delete the last node

            Tail = Tail.Prev;
            Tail.Next = null;

        }
        else{   //Middle node is to be deleted

        current.Prev.Next = current.Next;
        current.Next.Prev = current.Prev;

        }

    }
}
}
}



public boolean insertNode(String NAME, long ID,double GPA,String DEP, int locationStartingFromZero){
    boolean retval = false;
    Node node = createNode(NAME, ID, GPA, DEP);
    if(node != null ){
        if(Head == null){
           Head = Tail = node; 
        }else{
            if(locationStartingFromZero == 0){
                node.Next = Head;
                Head.Prev = node;
                Head = node;
            }else{
                Node temp;
                temp = Head;
                for(int i = 0; i < locationStartingFromZero -1 && temp != null; i++){
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
// public void updateNode(){
//     if(Head != null){
//     Scanner sc = new Scanner(System.in);
//     Node temp = Head;
//     System.out.println("Do you want to update a student data? (y/n):");
//     String ans1 = sc.nextLine();
//     if(!ans1.toLowerCase().equals("n")){
//         System.out.println("Which student you want to update his/her data?");
//         int n=0;
//         int ans2 = sc.nextInt();
//         while(temp.Next!=null && n!=ans2){
//             temp = temp.Next;
//             n++;
//         }
//         System.out.println("Which data you want to update? (-1 to exit):\n1)Name.\n2)ID.\n3)Department.\n4)GPA.");
//         int ans3 = sc.nextInt();
//         if(ans3 != -1) {
//             Scanner in = new Scanner(System.in);
//             if (ans3 == 1) {
//                 System.out.println("Enter student name:");
//                 String newName = in.nextLine();
//                 temp.name = newName;
//                 System.out.println("Student name has been updated.");
//             } else if (ans3 == 2) {
//                 System.out.println("Enter student new ID:");
//                 long newID = in.nextLong();
//                 temp.id = newID;
//                 System.out.println("Student ID has been updated.");
//             }else if(ans3 == 3){
//                 System.out.println("Enter student new department:");
//                 String newDEP = in.nextLine();
//                 temp.dep = newDEP;
//                 System.out.println("Student ID has been updated.");
//             }else if (ans3 == 4) {
//                 System.out.println("Enter student new GPA:");
//                 double newGPA = in.nextDouble();
//                 temp.gpa = newGPA;
//                 System.out.println("Student GPA has been updated.");
//             }
//         }
//         }
//     }else{
//         System.out.println("No data has been added.");
//     }
// }


public void updateNode(long id){
    Node temp = new Node();
    temp = Head;
    while(temp != null && temp.id != id){
        temp = temp.Next;
    }
    if(temp == null){
        System.out.println("NOT Found !!\ttry again");
    }
    else{
        Scanner s = new Scanner(System.in);
        System.out.print("What do you want to update [N]ame,[I]d,[G]PA, [D]epartment:");
        char x = s.next().charAt(0);
        switch(x){
            case 'N':
            case 'n':
            String Na;
            System.out.print("Enter the new name: ");
            Na = s.next();
            temp.name = Na;
            break;
            case 'I':
            case 'i':
            long i ;
            System.out.print("Enter the new Id: ");
            i = s.nextLong();
            temp.id = i;
            break;
            case 'G':
            case 'g':
            double g ;
            System.out.print("Enter the new GPA: ");
            g = s.nextDouble();
            temp.gpa = g;
            break;
            case 'D':
            case 'd':
            String d;
            System.out.print("Enter the new Department: ");
            d = s.next();
            temp.dep = d;
            break;
            default:
            System.out.print("Enter a Valid Symbol");
            break;

        }
    }
}

public void displayList(){
    if(Head != null){
        Node temp;
        temp = Head;
        System.out.println("Name "+"Id "+"GPA "+"Department");
        while(temp!=null){
            
            System.out.println(temp.name+" "+temp.id+" "+temp.gpa+" "+temp.dep+"\n");
            temp = temp.Next;
        }
    }
}

public void searchnode(long id){
    Node temp = new Node();
    temp = Head;
    while(temp != null && temp.id != id){
        temp = temp.Next;
    }
    if(temp == null){
        System.out.println("NOT Found !!\ttry again");
    }
    else{
        System.out.println("Found:\n(Student's info)\n");
        System.out.println("Name\tID\tGPA\tDepartment");
        System.out.println(temp.name+"\t"+temp.id+"\t"+temp.gpa+"\t"+temp.dep);
    }
}


}
