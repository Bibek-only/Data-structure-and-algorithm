public class _18mergeSortOnLinkedList {

    public static class LinkedList {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        Node mergeSort(Node head) {

            if (head == null || head.next == null) { //base condition if there is one node or absent of node it is already sorted
                return head;
            }

            // step1-> get the mid
            Node mid = getMid(head);

            // step2-> devide the ll into two part
            Node rightHead = mid.next;
            mid.next = null;

            // call the merge sort for both part of thelinked list
            Node newLeftHead = mergeSort(head);
            Node newRightHead = mergeSort(rightHead);

            // call for the merging operation
            return merge(newLeftHead, newRightHead);
        }

        // function to get mid
        Node getMid(Node head) {

            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        // function to doing the merging operation
        Node merge(Node leftHead, Node rightHead) {

            Node mergedLL = new Node(-1); //create a newe merged linkedlist to arrange sorted nodes
            Node temp = mergedLL; //to track the new sorted linked list nodes

            while (leftHead != null && rightHead != null) { //rearrange the liked list

                if (leftHead.data <= rightHead.data) {
                    temp.next = leftHead;
                    leftHead = leftHead.next;
                    temp = temp.next;
                } else {
                    temp.next = rightHead;
                    rightHead = rightHead.next;
                    temp = temp.next;
                }

            }

            while (leftHead != null) {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            }
            while (rightHead != null) {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }

            return mergedLL.next; // return the head of the merged linked list
        }

        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
            return;
        }

        void printLL() {
            if (head == null) {
                return;
            }

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(5);

        ll.printLL();

        ll.head = ll.mergeSort(ll.head); // update the head with the new merged linked list head

        ll.printLL();

    }
}