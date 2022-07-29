package ex08.ch06_queue_stack_test;

import ex07.ch05_stack_generic.GenericStack;
import ex08.ch05_queue_generic.GenericQueue;

public class Basic {

	public static void main(String[] args) {
		
		System.out.println("회문(Palindrom)이 맞는지 체크!");
		String str1 = "우영우영우";   // 테스트 문자열
		
		GenericStack stack1 = new GenericStack();
		GenericQueue queue1 = new GenericQueue();
		
		for(int i=0; i < str1.length(); i++) {
			stack1.push(str1.charAt(i));   // 문자열 A의 i번째 문자
			queue1.enqueue(str1.charAt(i));
		}
		
		while(!stack1.isEmpty() && stack1.pop().equals(queue1.dequeue())){}
		
		if(stack1.isEmpty()) 
			System.out.println(str1 + "는 회문이 맞습니다!");
		else 
			System.out.println(str1 + "는 회문이 아닙니다!");		
	}

}
