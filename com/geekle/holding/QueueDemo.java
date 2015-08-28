package com.geekle.holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	public static void printQ(@SuppressWarnings("rawtypes") Queue queue) {
		while (queue.peek() != null) {
			System.out.println(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i+1));
		}
		System.out.println(queue);
		printQ(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		
		for (char c : "Brontosaurus".toCharArray()) {
			qc.offer(c);
		}
		
		System.out.println(qc);
		
		printQ(qc);
	}
}
