public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList(){
        head=null;
        tail=null;
    }

    public void insertAtEnd(int value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        tail.next=head;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.printf("%d ",temp.value);
            if(temp==tail) break;
            temp=temp.next;
        }
        System.out.print("\n");
    }

    public void deleteValue(int value){
        if(head==tail && head.value==value){
            head=null;
            tail=null;
        }
        Node delete=head;
        if(head.value==value){
            head=head.next;
            tail.next=head;
        }
        while (delete.next!=null && delete!=tail){
            if(delete.next.value==value){
                delete.next=delete.next.next;
                break;
            }
            delete=delete.next;
        }
    }
}
