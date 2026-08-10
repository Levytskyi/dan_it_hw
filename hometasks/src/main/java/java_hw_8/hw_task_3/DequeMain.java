package java_hw_8.hw_task_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<String> dequeForExample = new ArrayDeque<>();
        System.out.println("We add a few items");
        dequeForExample.offer("The second example");
        dequeForExample.offer("The third example");
        dequeForExample.offer("The fourth example");
        dequeForExample.offer("The fifth example");
        dequeForExample.offer("The sixth example");
        dequeForExample.offer("The seventh example");
        System.out.println(dequeForExample);

        System.out.println("We add an item to deque as the first one");
        dequeForExample.addFirst("The eighth example");
        System.out.println(dequeForExample);

        System.out.println("We add an item to deque as the last one");
        dequeForExample.addLast("The fifth example");
        System.out.println(dequeForExample);

        System.out.println("We are getting the first item of the queue without removing but if a queue is empty we get the error");
        System.out.println(dequeForExample.getFirst());

        System.out.println("We are getting the last item of the queue without removing but if a queue is empty we get the error");;
        System.out.println(dequeForExample.getLast());

        System.out.println("We are getting the first item of the queue without removing but if a queue is empty we get the null");;
        System.out.println(dequeForExample.peekFirst());

        System.out.println("We are getting the last item of the queue without removing but if a queue is empty we get the null");;
        System.out.println(dequeForExample.peekLast());

        System.out.println("We are getting the first item of the queue but remove it. When queue is empty it returns the null");
        System.out.println(dequeForExample.pollFirst());
        System.out.println(dequeForExample);

        System.out.println("We are getting the last item of the queue but remove it. When queue is empty it returns the null");
        System.out.println(dequeForExample.pollLast());
        System.out.println(dequeForExample);

        System.out.println("We are getting the first item of the queue but remove it. When queue is empty it returns the error");
        System.out.println(dequeForExample.pop());
        System.out.println(dequeForExample);

        System.out.println("We are getting the first item of the queue but remove it. When queue is empty it returns the error");
        System.out.println(dequeForExample.removeFirst());
        System.out.println(dequeForExample);

        System.out.println("We are getting the last item of the queue but remove it. When queue is empty it returns the error");
        System.out.println(dequeForExample.removeLast());
        System.out.println(dequeForExample);

        System.out.println("We are getting the boolean that we found the first one item with entered value and if we found then we remove it");
        System.out.println(dequeForExample.removeFirstOccurrence("The fourth example"));
        System.out.println(dequeForExample);

        System.out.println("We are getting the boolean that we found the last one item with entered value and if we found then we remove it");
        System.out.println(dequeForExample.removeLastOccurrence("The sixth example"));
        System.out.println(dequeForExample);
    }
}
