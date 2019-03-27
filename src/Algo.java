import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class Algo {
	
	
	public static void main(String as[]){
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stackMinHold = new Stack<Integer>();	
		Random random = new java.util.Random();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<15;i++){
		//	System.out.println("Enter Some Value:"+sc.next());
			int rand = random.nextInt(100);
			rand = rand-50;
			if(stackMinHold.empty()){
				stackMinHold.push(rand);
			}
			else if(rand<=stackMinHold.lastElement()){
				stackMinHold.push(rand);
			}
			stack.push(rand);
			
			if(random.nextBoolean() && !stack.isEmpty()){
				int poped = stack.pop();
				System.out.println("Poped: "+poped);
				if(poped==stackMinHold.lastElement()){
					stackMinHold.pop();
				}
			}
			System.out.println("Stack Value: ");
			if(!stack.isEmpty()){				
				printStack(stack);
				System.out.println("Min Value: "+stackMinHold.lastElement());
			}
			
		}
	}
	
	public static void printStack(Stack<Integer> stack){
		
		for(int i=0;i<stack.size();i++){
			System.out.print(stack.elementAt(i)+" ");
		}
		System.out.println();
	}
}
