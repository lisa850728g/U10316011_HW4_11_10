import java.util.*;

public class testMyStack{
  //main method
	public static void main(String[] args) {
	
	  //new an object in MyStack 
		MyStack myStack = new MyStack();
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter five Strings: ");
		//enter five Strings
		for(int i = 1 ; i <=5 ; i++){
			myStack.push(input.next());
		}
		
		//if ArrayList is not empty, this loop will execute
		while(!myStack.isEmpty()){
		  //invoke pop method in MyStack and print these five Strings in reverse order
			System.out.print(myStack.pop() + " ");
		}
	}
}
