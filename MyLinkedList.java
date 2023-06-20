package com.bl.linkedlist;

public class MyLinkedList {
    Node head;

    //Creating new node
    public void add(int data){
        Node node = new Node(); //Create object in memory
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){  //For travesrsing from 1st node to last node
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void show(){
        Node node = head; //Initially we have to start with head
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void append(int index,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node temp = head; //for traversing we use temp
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node temp = head;
            Node temp1 = null;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp1 = temp.next;
            temp.next = temp1.next;
        }
    }

    public void sortList()
    {

        // Node current will point to head
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

//    public void insertAtStart(int data){
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//        node.next = head;
//        head = node;
//    }
}
