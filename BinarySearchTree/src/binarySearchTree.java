public class binarySearchTree {
    NodeTree Root;
    public binarySearchTree(){
        Root = null;
    }
    public void Insert(int Data){
        Root = insertNode(Root,Data);
    }
    private NodeTree insertNode(NodeTree node,int Data){
        if(node == null){
            node = new NodeTree(Data);
        }else{
            if(Data < node.Data){
                node.Left = insertNode(node.Left, Data);
            }else{
                node.Right = insertNode(node.Right, Data);
            }
        }
        return node;
    }
    public NodeTree Search(NodeTree node,int Data){
        NodeTree retval;
        if(node == null || node.Data == Data){
            retval = node;
        }else{
            if(node.Data > Data){
               retval =  Search(node.Left, Data);
            }else{
                retval = Search(node.Right, Data);
            }
        }
    return retval;
    }
}
