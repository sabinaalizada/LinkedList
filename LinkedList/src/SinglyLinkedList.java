public class SinglyLinkedList {
    /////////////////////////insertion to the front
    private Node head;
    private Node tail;
    public void insertFront(int value){
        System.out.println("Inserting" + value);

        Node newNode=new Node(value);

        newNode.next=head;

        head=newNode;
    }
    public int getHeadValue(){
        if(head==null){
            return -1;
        }else {
            return head.value;
        }
    }
    /////////////////////////////
    // insertion to the end
    public SinglyLinkedList(){
        head=null; //list empty
    }
    public void insertAtEnd(int val){
        Node newnode=new Node(val);

        if(this.head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;

    }
    public void print(){
        Node temp=this.head;
        while (temp != null) {
            System.out.printf("%d ", temp.value);
            temp = temp.next;
        }
        System.out.print("\n");
    }
    //add element at k-th position
    public void insertAfterK(int value,int k){
        Node newNode=new Node(value);
        Node current =head;
        if(current==null){
            head=newNode;
            return;
        }
        for (int i = 0; i < k; i++) {
            current=current.next;
        }
        if(current!=null) {
            newNode.next = current.next;
            current.next = newNode;
        }else {
            System.out.println("The k-th node is null.");
        }
    }
    /////////////////Delete node
    public void deleteNode(int value){
        if (head.value == value) {
            Node targetNode = head;
            head = head.next;
            return;
        }
        Node delete=head;
        while (delete.next!=null){
            if(delete.next.value==value){
                delete.next=delete.next.next;
                return;
            }
            delete=delete.next;
        }
    }


}
