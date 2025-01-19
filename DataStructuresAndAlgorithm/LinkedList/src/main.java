public class main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(18);
        linkedList.add(27);
        linkedList.add(36);
        linkedList.add(45);
        linkedList.add(54);

        linkedList.printList();
        linkedList.addAtStart(98);
        linkedList.printList();
        linkedList.insertAtIndex(4,76);
        linkedList.insertAtIndex(0,0);
        linkedList.printList();
        linkedList.deleteAtIndex(4);
        linkedList.printList();
        linkedList.deleteAtIndex(0);
        linkedList.printList();
    }
}
