package java_hw_8.hw_task_3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queueForExample = new LinkedList<>();
        System.out.println("We add a few items to our queue");
        queueForExample.offer("The first example");
        queueForExample.offer("The second example");
        queueForExample.offer("The third example");
        queueForExample.offer("The fourth example");
        queueForExample.offer("The fifth example");
        System.out.println(queueForExample);

        System.out.println("We are getting the length of the queue");
        System.out.println(queueForExample.size());

        System.out.println("We are getting the first item of the queue without removing but if a queue is empty we get the error");
        System.out.println(queueForExample.element());

        System.out.println("We are getting the first item of the queue without removing but if a queue is empty we get the null");
        System.out.println(queueForExample.peek());

        System.out.println("We are getting the first item of the queue but remove it. When queue is empty it return the null");
        System.out.println(queueForExample.poll());

        System.out.println("We are getting the first item of the queue but remove it. When queue is empty it return the error");
        System.out.println(queueForExample.remove());
    }
}
