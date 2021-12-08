/**
 * QueueNode
 * a Queue of nodes
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in 12/8/21
 **/
public class QueueNode<E> {
    private node root=new node();
    private int length;
    

    public QueueNode(){//default constructor
        length=0;
    }

    private node lastNode(node n2){//private method that returns the last node in the queue
        if (n2.getChild()==null){
            return n2;
        }
        return lastNode(n2.getChild());

    }


    public void enqueue(E element){//adds a node onto the end of the queue of nodes
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

    public E dequeue(){//removes the top node in the queue
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

    public boolean isEmpty(){//retuens true if the queue is empty and false if it is not
        if (length==0){
            return true;
        }
        if (root.getValue()==null){
            return true;
        }
        return false;
    }

    public int size(){//returns the size of the queue
        return length;
    }

    public E peek(){//returns the top value without removing it
        return (E)root.getValue();
    }

    

   

}
