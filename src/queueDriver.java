/**
 * queueDriver
 * A program designed to test the queueNode class
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: 12/9/21
 **/

public class queueDriver {
    public static void main(String[] args) {
        QueueNode n = new QueueNode();
        for (int i=0;i<15;i++){
            n.enqueue(i);
        }
        System.out.println("Enqueued 0-14");
        for(int d=0;d<15;d++){
            System.out.println(n.dequeue());
        }
        System.out.println("Should be empty");
        System.out.println("isEmpty: "+n.isEmpty());

        n.enqueue(false);
        n.enqueue(false);
        n.enqueue(true);
        System.out.println("Should print false false true");
        System.out.println(n.dequeue());
        System.out.println(n.dequeue());
        System.out.println(n.dequeue());
        
    }
}
