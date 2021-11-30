/**
 * QueueNode
 * a Queue of nodes
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in
 **/
public class QueueNode<E> {
    private node root;
    private int length;
    

    public QueueNode(){
        length=0;
    }

    private node lastNode(node n2){
        if (n2.getNext()==null){
            return n2;
        }
        return lastNode(n2.getNext());

    }


    public void enqueue(E element){
        if(length == 0){
            root.setDataType(element);
            length++;
        }
        if (length == 1) {
            node n=new node(element, null,root);
            length++;
        }
        if(length>1){
            node n = new node(element, null, lastNode(root));
            lastNode(root).getPrev().setNext(n);
            length++;
        }
    }

   

}
