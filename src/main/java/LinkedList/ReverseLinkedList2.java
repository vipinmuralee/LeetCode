package LinkedList;

import sun.awt.image.ImageWatched;

public class ReverseLinkedList2 {

    static LinkedList head;
    public static void main(String[] args) {
        printList(reverseLinked(new int[]{1, 2, 3, 4, 5}, 2, 4));
        System.out.println();
    }

    public static LinkedList reverseLinked(int[] list, int left, int right) {
        head = null;
        for (int i = list.length - 1; i >= 0 ; i--) {
            LinkedList n = new LinkedList();
            n.val = list[i];
            n.next = head;
            head = n;
        }


        LinkedList prev = null;
        for (int i = 0; i < list.length; i++) {
            LinkedList forw = head.next;
            head.next = prev;
            prev = head;
            head = forw;
        }
        return prev;
    }

    public static LinkedList insert(LinkedList head, int i) {
        LinkedList n = new LinkedList();
            n.val = i;
            n.next = head;
            head = n;

        return head;
    }
    static class LinkedList {

        int val;
        LinkedList next;
        LinkedList() {}

        LinkedList(int val) {
            this.val = val;
        }

        LinkedList(int val, LinkedList next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void printList(LinkedList head) {
        LinkedList n = head;
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
    }

}
