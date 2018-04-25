package linkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
public static void main(String[] args) {
	//First in first out
	Queue<String> q = new PriorityQueue<>();
	q.add("Delta");
	q.add("American");
	q.add("Qatar");
	q.add("Turkish");
	
	System.out.println(q);
	
	System.out.println(q.peek());



}
}
