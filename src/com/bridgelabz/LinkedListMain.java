package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {

        //UC4:Inserting Element;
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(70);
        linkedList1.display();

        Boolean isInserted = linkedList1.insertAfter(56, 30);
        if (isInserted)
            System.out.println("Element Inserted Successfully.");
        else
            System.out.println("Element is not Inserted!");
        linkedList1.display();
        System.out.println("*****************************************");
//UC5:Delete the first Element;
        linkedList1.display();
        Integer poppedData = linkedList1.pop();
        if (poppedData == null)
            System.out.println("LinkedList is Empty");
        else
            System.out.println("The Element popped is " + poppedData);
        linkedList1.display();
        System.out.println("----------");
//UC6:Delete the Last Element;
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.push(70);
        linkedList2.push(30);
        linkedList2.push(56);
        linkedList2.display();

        Integer poppedData2 = linkedList2.poplast();
        if (poppedData2 == null) {
            System.out.println("LinkedList is Empty");
        } else
            System.out.println("The Element popped is " + poppedData2);

        linkedList2.display();
        System.out.println("----------");
    }
}