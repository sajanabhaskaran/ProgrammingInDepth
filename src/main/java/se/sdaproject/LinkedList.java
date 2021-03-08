package se.sdaproject;

// a "box" in our previous picture
class Node {
    // field 1: the data
    // in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;
    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}


public class LinkedList {

    private Node first = null;

    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node
            
            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }
            // what do we know about "current"?
            // current.next == null
            // AWESOME!
            // it means, "current" is the last node!

            // step 3: create a new node with the given int "num"
            Node node = new Node(num);

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = node;
        }

    }

    public int search(int num){
        int index=0;
        if (first== null){
            return -1;
        }
        else{
            Node current= first;
            if (current.elem==num){
                return index;
            }
            else {
                while(current.next!=null){
                    index+=1;
                    if (current.next.elem== num) {
                        return index;
                    }
                    current=current.next;
                }
            }
            return -1;
        }
    }

    public int get(int index){
        int tempIndex=0;
        int number=0;
        if (first==null){
            return -1;
        }
        else if(index==0){
            number=first.elem;
        }else {
            Node current=first;
            while (current.next!=null){
                tempIndex=tempIndex+1;
                if (tempIndex==index){
                    return current.next.elem;
                }
                current=current.next;
            }
        }
       return -1;
    }

    public int size(){
        int size=1;
        if (first==null){
            return 0;
        }
        else{
            Node current= first;
            while(current.next!=null){
                size+=1;
                current=current.next;
            }
            return size;
        }
    }

    public void remove(int num){
        int index=this.search(num);
        Node current=first;
        if (index==0){
            first=current.next;
        }
        else{
            while (current!=null && current.next!=null){
                if (current.next.elem== num){
                    current.next=current.next.next;
                }
                current=current.next;
            }
        }






    }

    // useful for testing!
    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        if (first == null) {
            // what to do here?
            // string to be returned: "LinkedList()"
            // nothing left to do!
        } else {
            // here, we know that first != null
            // go through the chain of nodes, starting with
            // "first"

            Node current = first;            
            // treat first element specially:
            builder.append("" + current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append("," + current.elem);
            }
            // current.next == null
            // we have already appended the last num!
        }

        // append ")"
        builder.append(")");
        return builder.toString();
    }
}