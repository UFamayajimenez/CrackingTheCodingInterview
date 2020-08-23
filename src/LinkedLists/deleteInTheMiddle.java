package LinkedLists;

public class deleteInTheMiddle
{


    //Problem: Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node

    // a -> b -> c -> d -> e
    // given c the alg should do
    // a -> b -> d -> e ->

    public static class Node{

        Node next = null;
        int data;

        public Node (int _data){
            data = _data;
        }


    }


    public static boolean deleteInTheMiddle(Node theNode){


        if(theNode == null || theNode.next == null){

            return false;
        }


        Node theNextNode = theNode.next;

        int nextData = theNextNode.data;

        theNode.data = nextData;


        theNode.next = theNextNode.next;


        return true;

    }


    public static void main(String[] args) {

        Node head = new Node(1);

        Node two = new Node(2);

        Node three = new Node(3);

        Node four = new Node(4);

        Node five = new Node(5);

        Node six = new Node(6);

        head.next = two;

        two.next = three;

        three.next = four;

        four.next = five;

        five.next = six;


        deleteInTheMiddle(three);

    }













}
