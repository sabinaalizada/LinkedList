import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Node node=new Node(1);
        //System.out.println(node.value);
////////////////////////////////////Singly Linked List///////////////////////////////////////////////////////////////////////////////
        //SinglyLinkedList list=new SinglyLinkedList();
        //list.insertFront(3);
        //System.out.println("The value at the head is: " + list.getHeadValue());
        //list.insertFront(2);
        //System.out.println("The value at the head is: " + list.getHeadValue());

//        int n=scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            int value=scanner.nextInt();
//            list.insertAtEnd(value);
//        }
//        list.print();


//        int position=scanner.nextInt();
//        int newValue=scanner.nextInt();
//        list.insertAfterK(newValue,position);
//        list.print();



//        int deleteValue=scanner.nextInt();
//        list.deleteNode(deleteValue);
//        list.print();
//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////Circular Linked List/////////////////////////////////////////////////////////////
//        CircularLinkedList circularLinkedList=new CircularLinkedList();

//        int size=scanner.nextInt();
//        for (int i = 0; i < size; i++) {
//            int value=scanner.nextInt();
//            circularLinkedList.insertAtEnd(value);
//        }
//        circularLinkedList.print();

//        int deleteValue=scanner.nextInt();
//        circularLinkedList.deleteValue(deleteValue);
//        circularLinkedList.print();
//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////Doubly Linked List/////////////////////////////////////////////////////////////
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        int position=scanner.nextInt();
        int newValue=scanner.nextInt();
        doublyLinkedList.insertValue(position,newValue);
        doublyLinkedList.print();

    }
}