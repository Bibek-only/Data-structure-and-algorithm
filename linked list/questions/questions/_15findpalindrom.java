
public class _15findpalindrom {
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

        // find the linked list is palindrom or not
        void checkPalindrom() {
            if (head == null || head == tail) {
                System.out.println("it is palindorm");
                return;
            }

            Node mid = findMiddle(); // step 1
            reverseSecondHalf(mid); // step 2
            checkTwoPart(); // stpe 3
        }

        // find the middle node of a linkedlist
        Node findMiddle() {
            if (head == null || head == tail) { // base condition
                return head;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) { // fast != null (for even ll length), fast .next != null( for
                                                        // odd ll length)

                fast = fast.next.next;
                slow = slow.next;
            }

            return slow;
        }

        // reverse the second half of thelinked list
        void reverseSecondHalf(Node secondHead) {

            Node currentNode = secondHead; // mid of the whole linked list
            Node previousNode = null;
            Node nextNode;

            while (currentNode != null) {
                nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
            }

        }

        // check the two part of linked list
        void checkTwoPart() {
            Node firNode = head; // starting of first farst half
            Node secondNode = tail; // stargin of second half after reversal

            while (secondNode != null) {
                if (firNode.data != secondNode.data) {
                    System.out.println("the linked list is not palindrom");
                    return;
                }

                firNode = firNode.next;
                secondNode = secondNode.next;
            }
            System.out.println("the linked list is palindrom");
        }

        // add at last
        void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // find linked list is palindorm or not

        // print linked list
        void printLL(Node currentNode) {
            if (currentNode == null) {
                System.out.println();
                return;
            }
            System.out.print(currentNode.data + "-> ");
            printLL(currentNode.next);
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);

        ll.printLL(ll.head);
        ll.checkPalindrom();

    }
}
