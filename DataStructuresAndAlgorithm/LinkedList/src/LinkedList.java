public class LinkedList {
    Node head;

    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        Node next = temp.next;
        temp.next = next.next;
    }

    public void insertAtIndex(int index, int val){
        if(index == 0) {
            addAtStart(val);
            return;
        }
        Node node = new Node(val);
        Node prev = head;
        Node next = null;
        int i=0;
        while(i < index-1){
            prev = prev.next;
            i++;
        }
        next = prev.next;
        prev.next = node;
        node.next=next;

    }
    public void addAtStart(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

    }

    public void add(int val){
        Node node = new Node(val);
        if(head == null) head = node;
        else{
            Node temp = head;
            while(temp.next != null){

                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList(){
        Node temp = head;
        System.out.print("List : ");
        while(temp.next!=null){
            System.out.print(temp.val +"-->");
            temp = temp.next;

        }
        System.out.print(temp.val +"-->");

        System.out.print("Null");
        System.out.println();
    }
}
