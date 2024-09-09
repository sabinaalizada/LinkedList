public class DoublyLinkedList {
    private Node head;

    public void insertValue(int index,int value){
        Node newNode=new Node(value);

        if(index==0){
            newNode.next=head;
            if(head!=null){
                head.previous=newNode;
            }
            head=newNode;
        }else{
            Node node=head;
            for (int i = 0; i < index-1; i++) {
                node=node.next;
            }
            Node A=node;
            Node B=node.next;

            A.next=newNode;
            if(B!=null){
                B.previous=newNode;
            }
            newNode.next=B;
            newNode.previous=A;
        }
    }

    public void print(){
        Node temp=this.head;
        while (temp != null) {
            System.out.printf("%d ", temp.value);
            temp = temp.next;
        }
        System.out.print("\n");
    }

    public void deleteNode(int value){
        Node targetNode=head;
        while(targetNode!=null && targetNode.value!=value){
            targetNode=targetNode.next;
        }

        if(targetNode==null)
            return;

        Node A=targetNode.previous;
        Node B=targetNode.next;

        if(A!=null){
            A.next=B;
        }

        if(B!=null){
            B.previous=A;
        }

        if(targetNode==head){
            head=head.next;
        }

    }


}
