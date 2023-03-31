package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
    LinkedList<Integer>linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(70);
        linkedList1.display();

    Boolean isInserted = linkedList1.insertAfter(56,30);
        if (isInserted)
            System.out.println("Element Inserted Successfully.");
        else
                System.out.println("Element is not Inserted!");

        linkedList1.display();
}
}
