class Stack<T>
{
	private SList<T> list = new SList<T>(); 

	Stack(){}

	void push(T element){
		list.addFirst(element);
	}

	T pop(){
		return list.removeFirst();
	}

	T peek(){
		//T tmp = list.removeFirst();
		//list.addFirst(tmp);
		return list.first.element;
		}

	void printVertical(){
		SListExtension.printVertical(list);
	}

	boolean isEmpty() {
		return list.isEmpty();
	}

	Stack<T> copyStack() {
		Stack<T> rvStack = reverseStack();
		return rvStack.reverseStack();
	}

	static void binaryConversion(int x) {
		Stack<Integer> answer = new Stack<Integer>();
		if (x == 0){
			answer.push(0);;
		}
		else;
			while( x != 0){
			int result = x%2;
			x = x/2;
			answer.push(result);
			}

		answer.list.printHorizontal();
	}	

	Stack<T> reverseStack() {
		Stack<T> tmp = new Stack<T>();
		Stack<T> answer = new Stack<T>();
		
		while (!this.isEmpty()) {
			T element = this.pop();
            answer.push(element);
			tmp.push(element);
        }
		while (!tmp.isEmpty()) {
			this.push(tmp.pop());
		}
		return answer;
	}
	static boolean isPalindrome(String word) {
		Stack<Character> stack = new Stack<Character>();
		int size = 0;

		for (char c : word.toCharArray()) {
            stack.push(c);
			size++;
        }

		Stack<Character> reversedStack = stack.reverseStack();
		
        for (int i = 0 ; i <= size-1 ; i++ ) {
            Character rs = Character.toLowerCase(reversedStack.pop());
			Character s = Character.toLowerCase(stack.pop());
			rs = Character.toLowerCase(rs);
			if (rs != s) return false;
        }

		return true;
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} 
		catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static Integer evalPostfix(String[] input) {// Exercise 5
		Stack<Integer> S = new Stack<Integer>();
		
		// Write your code here
		for (int i = 0; i < input.length ; i++){
			if (isInteger(input[i])){
				int num = Integer.parseInt(input[i]);
				S.push(num);
			}

			else{
				String temp = input[i];
				int y = S.pop();
				int x = S.pop();
				if (temp.equals("+")){
					
					S.push(x+y);
				}
				else if (temp.equals("-")){
					S.push(x - y);
				}
				else if (temp.equals("*") ){
					S.push(x * y);
				}
				else if (temp.equals("/") ){
					S.push(x / y);
				}
				else if (temp.equals("%"))
					S.push(x % y);
				
			}
		}
		int Ans = S.pop();
		return Ans;
	}
}