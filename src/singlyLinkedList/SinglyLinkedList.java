package singlyLinkedList;

import node.Node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 06-07-2021
 * Time: 09:20
 */

public class SinglyLinkedList {
    private Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtEnd( int data) {
        Node newNode = new Node(data);
        if(head.getNext() == null) {
            head.setNext(newNode);
        }
        else{
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
        }
        else{
            Node previous = head;
            int count = 1;
            while(count < (position-1)){
                previous = previous.getNext();
                count++;
            }
            Node current = previous.getNext();
            newNode.setNext(current);
            previous.setNext(newNode);
        }
    }

    public Node reverseLinkedList () {
        Node current = head;
        Node newHead = null;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(newHead);
            newHead = current;
            current = next;
        }
        return newHead;

    }

    public int middleOfLinkedList () {
        Node middleNode = head;
        Node FastPtr = head;
        while (FastPtr != null && FastPtr.getNext() != null) {
            middleNode = middleNode.getNext();
            FastPtr = FastPtr.getNext().getNext();
        }

        return middleNode.getData();
    }



    public int search(int searchData) {
        if(head == null) {
            System.out.println("LinkedList is already empty.");
            return -1;
        }
        int count = 1;
        Node current = head;
        while(current != null) {
            if(current.getData() == searchData) {
                return count;
            }
            count++;
            current = current.getNext();
        }
        return -1;
    }

    public void delete(int position){

        if(head == null) {
            System.out.println("LinkedList is already empty.");
            return;
        }
        if(position == 1){
            head = head.getNext();
        }
        else {
            Node previous = head;
            int count = 1;
            while(count < position-1) {
                previous = previous.getNext();
                count++;
            }
            Node current = previous.getNext();
            System.out.println(current.getData() + " is deleted from the LinkedList.");
            previous.setNext(current.getNext());
        }
    }


    public int length() {
        Node temp = head;
        int count = 0;
        if(head == null){
            return 0;
        }
        while(temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " --> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

}
