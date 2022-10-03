public class Main {
    public static void main(String[] args) {
        LL ll=new LL();
        ll.insertFirst(5);
        ll.insertFirst(17);
        ll.insertFirst(32);
        ll.insertFirst(4);

        ll.display();
        System.out.println();
        ll.insertLast(35);
        ll.insertLast(43);
        ll.display();
        System.out.println();
        ll.insertAtRandom(37,3);
        ll.display();

    }
}