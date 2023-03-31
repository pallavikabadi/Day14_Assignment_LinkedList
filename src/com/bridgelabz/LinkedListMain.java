package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer>linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        linkedList1.display();
//UC5:Delete the first Element;
        Integer poppedData = linkedList1.pop();
        if (poppedData == null)
            System.out.println("LinkedList is Empty");
        else
            System.out.println("The Element popped is "+poppedData);
        linkedList1.display();
        System.out.println("*****************************************");
//UC6:Delete the Last Element;
        LinkedList<Integer>linkedList2 = new LinkedList<>();
        linkedList2.push(70);
        linkedList2.push(30);
        linkedList2.push(56);
        linkedList2.display();

        Integer poppedData2 = linkedList2.poplast();
        if (poppedData2 == null) {
            System.out.println("LinkedList is Empty");
        }else
            System.out.println("The Element popped is "+poppedData2);

        linkedList2.display();
        System.out.println("-------");
//UC7:search LinkedList to find Node with value 30;
        LinkedList<Integer>linkedList3 = new LinkedList<>();
        linkedList3.push(70);
        linkedList3.push(30);
        linkedList3.push(56);
        linkedList3.display();

        Node<Integer> searchedData = linkedList3.search(30);
        if (searchedData == null)
            System.out.println("Element 30 is not Found.");
        else
            System.out.println("Element 30 is Found.");
        System.out.println("-------");
//UC8:insert 40 after 30 to the Linked List sequence of 56->30->70;
        linkedList3.display();

        Boolean isInserted = linkedList3.insertAfter(30,40);
        if (isInserted)
            System.out.println("Element 40 is successfully Inserted.");
        else
            System.out.println("Element 40 is not Inserted.");

        linkedList3.display();

        //UC9:Delete 40 & linkedList Size;
        linkedList3.display();
        Node<Integer> deletedData = linkedList3.delete(40);
        if (deletedData == null)
            System.out.println("Element 40 is NOT Deleted.");
        else
            System.out.println("Element 40 is Deleted.");

        linkedList3.display();
        linkedList3.size();

    }
}