/**
 * myNode
 * A class to make nodes that connect to one another and store data
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in: 9/29/21
 **/

public class node<T> {

    private T val; //data stored
    private node Child; //child node
    private node Parent; //parent node


    public node(){//default constructor
        val=null;
        Child = null;
    }
    public node(T t, node c, node p){//constructor with refrence node and value
        this.val=t;
        this.Child=c;
        this.Parent=p;
    }
    public node(T t){
        this.val=t;
    }
    public T getValue(){//retuens value
        return val;
    }
    public node getChild(){//returns child node
        return Child;
    }
    public node getParent(){//returns previous node
        return Parent;
    }

    public void setChild(node n) {//sets connected node
        Child = n;
    }
    public void setParent(node n){
        Parent=n;
    }
    public void setDataType(T t){//sets value
        this.val=t;
    }
    public String toString(){ //returns the nodes data in the tostring with prefix "Node :"
        return "Node: " + val.toString();
    }
    public boolean equals(node n){
        if (n.getValue().equals(this.getValue())){
            return true;
        }
        return false;
    }


}
