package com.bl.linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
//        list.insertAtStart(2);

        list.append(2,40); //UC8
        list.sortList();//UC10
        list.show();
       list.delete(2); //UC9
        list.show();
    }
}
