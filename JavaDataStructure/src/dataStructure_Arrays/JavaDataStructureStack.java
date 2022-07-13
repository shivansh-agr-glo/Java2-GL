package dataStructure_Arrays;

import java.util.Stack;

public class JavaDataStructureStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(34);
		stack.push(66);
		stack.push(24);
		stack.push(97);
		
		System.out.println("Total size of stack :" +stack.size());
		System.out.println("Elements of stack "+stack);
		
		for(int i =0;i<stack.size();i++) {
			System.out.println(stack);
			
		}

	}

}
