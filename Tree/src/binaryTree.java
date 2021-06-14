public class binaryTree {
   NodeTree Root; 
    public binaryTree(){
        Root = null;
    }
    public boolean isEmpty(){
        return(Root == null);
    }
    public void Insert(int Data){
        Root = insertNode(Root,Data);
    }
    private NodeTree insertNode(NodeTree node, int d){
        if(node == null){
            node = new NodeTree(d);
        }else{
            if(node.Right == null){
                node.Right = insertNode(node.Right, d);
            }else{
                node.Left = insertNode(node.Left, d);
            }

        }
    return node;
    }
    public int Count(){
        return(countNodes(Root));
    }
    private int countNodes(NodeTree node){
        int retval;
        if(node == null){
            retval = 0;
        }else{
            int x = 1;
            x += countNodes(node.Left);
            x += countNodes(node.Right);
            retval = x; 
        }
        return retval;
    }
}
