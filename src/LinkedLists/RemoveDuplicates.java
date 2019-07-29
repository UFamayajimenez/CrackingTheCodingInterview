package LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    //Problem: Write code to remove duplicates from an unsorted linked list.

    public static class LinkedList{

        Node head;
        Node tail;


        public class Node{

            Node next = null;
            Node prev = null;
            int data;

            public Node (int _data){
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
                head.prev = temp;

                head = temp;
            }


        }


        void printForward(){


            if(head != null){

                Node currentNode = head;

                while (currentNode != null){

                    System.out.println(currentNode.data);

                    currentNode = currentNode.next;

                }
            }

        }


        void removeNode(Node theNode){


            if(theNode == head){
                 head = theNode.next;

            }
            else if(theNode == tail){
                tail = theNode.prev;

                theNode.prev.next = null;

            }
            else{


                theNode.prev.next = theNode.next;
                theNode.next.prev = theNode.prev;


            }
        }


        void deleteDuplicates(){


            List<Integer> nums = new ArrayList<Integer>();

            Node currentNode = head;


            while (currentNode != null){

                if(currentNode == head){

                    nums.add(currentNode.data);

                }else{

                    if(nums.contains(currentNode.data)){

                        removeNode(currentNode);


                    }else{
                        nums.add(currentNode.data);
                    }

                }

                currentNode = currentNode.next;

            }

        }

    }

    public static void main (String args[]){

        LinkedList myList = new LinkedList();

        myList.addHed(7);
        myList.addHed(7);
        myList.addHed(5);
        myList.addHed(4);
        myList.addHed(4);
        myList.addHed(3);
        myList.addHed(2);
        myList.addHed(2);
        myList.addHed(4);
        myList.addHed(1);
        myList.addHed(3);
        myList.addHed(3);
        myList.addHed(5);


       myList.printForward();

       System.out.println("Attempting to delete duplicates...");

       myList.deleteDuplicates();

       myList.printForward();


    }


}
