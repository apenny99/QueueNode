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

    public void enqueue(E element){
        if(length == 0){
            root.setDataType(element);
        }
        if (length == 1) {
            node n=new node(element, null,root);
        }
    }


}
