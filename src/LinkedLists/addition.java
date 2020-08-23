package LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class addition
{

    //Problem: You have two numbers represented by a linked list, where each node contains a sin- gle digit
    // The digits are stored in reverse order, such that the 1’s digit is at the head of the list
    // Write a function that adds the two numbers and returns the sum as a linked list


    /*

    Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
    Output: 8 -> 0 -> 8
     */


    public static class LinkedList
    {

        Node head;
        Node tail;


        public class Node
        {

            Node next = null;
            int data;

            public Node(int _data)
            {
                data = _data;
            }


        }


        void addHed(int data)
        {

            if (head == null)
            {
                Node temp = new Node(data);
                temp.next = null;

                head = temp;
                tail = temp;

            } else
            {
                Node temp = new Node(data);
                temp.next = head;

                head = temp;
            }


        }


        public static LinkedList addition(LinkedList head1, LinkedList head2) {

            int count = 0;


            Node currentNode = head1.head;

            Node currentNode2 = head2.head;


            int sum = 0;


            while (currentNode != null && currentNode2 != null)
            {

                int number = (int) Math.pow(10, count) * currentNode.data;

                sum += number;

                currentNode = currentNode.next;


                int number2 = (int) Math.pow(10, count) * currentNode2.data;

                sum += number2;

                currentNode2 = currentNode2.next;

                count++;

            }


            System.out.println(sum);


            LinkedList output = new LinkedList();


            while (sum > 0) {

                int digit = sum % 10;

                output.addHed(digit);

                sum = sum / 10;


            }

            return output;

        }
    }

    public static void main(String[] args) {

        LinkedList first = new LinkedList();

        first.addHed(5);
        first.addHed(1);
        first.addHed(3);

        LinkedList second = new LinkedList();


        second.addHed(2);
        second.addHed(9);
        second.addHed(5);


        LinkedList output = LinkedList.addition(first, second);

    }
}



