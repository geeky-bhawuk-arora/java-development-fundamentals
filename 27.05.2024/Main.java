// Linked List, Priority Queue

import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.offer(1);
        num.offer(2);
        num.offer(3);
        System.out.println("Queue : " + num);

        int accessedNum = num.peek(); // Retreives the head of the queue
        System.out.println("Accessed Number: " + accessedNum);

        int removedNum = num.poll(); // Removes the first element of the queue
        System.out.println("Removed Element: " + removedNum);

        System.out.println("Updated Queue: " + num);
    }
}
