import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        /* Priority Queue = A FIFO data structure that serves elements
         * with the highest priorities first
         * before elements with lower priority.
         */

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }

}
