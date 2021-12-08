/**
 * QueueNode
 * a Queue of nodes
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in
 **/
public class QueueNode<E> {
    private node root=new node();
    private int length;
    

    public QueueNode(){
        length=0;
    }

    private node lastNode(node n2){
        if (n2.getChild()==null){
            return n2;
        }
        return lastNode(n2.getChild());

    }
//    private node decrement(node n2){//root = root.getChild
//        if(n2.getChild().getChild()==null){
//            n2.setDataType(n2.getChild().getValue());
//            n2.setChild(null);
//            return n2;
//        }
//        n2.setDataType(n2.getChild().getValue());
//        return decrement(n2.getChild());
//        if(n2.getChild()==null){
//            n2.getParent().setDataType(n2.getValue());
//            n2.getParent().setChild(null);
//            return null;
//        }
//        node temp = new node();
//        temp.setDataType(n2.getChild().getValue());
//        n2.setDataType(temp.getValue());
//        return decrement(n2.getChild());
//    }


    public void enqueue(E element){
        if(length == 0) {
            root.setDataType(element);
            length++;
        } else if (length == 1) {
            node n=new node(element, null,root);
            root.setChild(n);
            length++;
        } else {
            node n = new node(element);
            node temp=lastNode(root);
            lastNode(root).setChild(n);
            length++;
        }


    }

    public E dequeue(){
        if (length==0){
            return null;
        }
        node temp = root;
        if (length==1){
            length--;
            root.setDataType(null);
            return (E)temp.getValue();
        }
        root=root.getChild();
        length--;
        return (E)temp.getValue();

    }

    public boolean isEmpty(){
        if (length==0){
            return true;
        }
        if (root.getValue()==null){
            return true;
        }
        return false;
    }

    public int size(){
        return length;
    }

    public E peek(){
        return (E)root.getValue();
    }

    public static void main(String[] args) {
        QueueNode n = new QueueNode();
        System.out.println(n.isEmpty());
        for (int i=0;i<15;i++){
            n.enqueue(i);

        }
        System.out.println(n.isEmpty());
        System.out.println(n.peek());
        System.out.println(n.peek());
        n.dequeue();
        System.out.println(n.peek());
        System.out.println(n.peek());









    }

   

}
