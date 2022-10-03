public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
            tail=head;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("END");

    }

    public void insertLast(int value) {
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtRandom(int value, int index) {
        //if index given is 0 then call insertFirst
        //if index given is size if linkedList then call insertLast
        if(index==0) {
            insertFirst(value);
            return;
        }
        else if(index==size) {
            insertLast(value);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;

    }

    public int deleteFirst() {
        head=head.next;
        if(head==null) {
            tail = null;
            size--;
        }
        int val=head.value;
        return val;

    }

    private class Node{
        private int value;
        private  Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
