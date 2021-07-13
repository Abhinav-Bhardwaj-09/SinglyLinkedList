package singlyLinkedList;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 06-07-2021
 * Time: 09:31
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        System.out.print("Insert data of your first node :  ");
        int val = sc.nextInt();
        sll.insertAtStart(val);
        boolean condition = true;
        int choice, data, position;
        while (condition) {
            System.out.println("\n");
            System.out.println("Press 1 to insert data at the start of the LinkedList");
            System.out.println("Press 2 to insert data at the end of the LinkedList");
            System.out.println("Press 3 to insert data at any position in the LinkedList");
            System.out.println("Press 4 to delete node using its position in the LinkedList");
            System.out.println("Press 5 to display the LinkedList");
            System.out.println("Press 6 to exit\n");
            System.out.print("Your choice : ");
            choice = sc.nextInt();
            if(choice == 6){
                condition = false;
            }
            else{
                switch (choice) {
                    case 1:
                        System.out.print("Data value: ");
                        data = sc.nextInt();
                        sll.insertAtStart(data);
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Data value: ");
                        data = sc.nextInt();
                        sll.insertAtEnd(data);
                        break;
                    case 3:
                        System.out.print("Data value: ");
                        data = sc.nextInt();
                        System.out.println();
                        System.out.print("Position :");
                        position = sc.nextInt();
                        while (position > sll.length()) {
                            System.out.println();
                            System.out.println("Position should lie inside LinkedList.");
                            System.out.print("Position :");
                            position = sc.nextInt();
                        }
                        sll.insertAtPosition(position, data);
                        break;
                    case 4:
                        System.out.print("Position :");
                        position = sc.nextInt();
                        while (position > sll.length()) {
                            System.out.println();
                            System.out.println("Position should lie inside LinkedList.");
                            System.out.print("Position :");
                            position = sc.nextInt();
                        }
                        sll.delete(position);
                        break;
                    case 5:
                        System.out.println("\n");
                        System.out.print("LinkedList:  ");
                        sll.display();
                        break;
                }
            }
        }
    }
}
