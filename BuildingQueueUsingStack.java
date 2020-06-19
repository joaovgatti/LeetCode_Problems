/*Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Example:

MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);  
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false*/




//Metodo usado:

/*Nesse problema eu fiz apenas uma alteracao no metodo push,
criei uma nova stack onde antes de add um elemento na stack original
nos jogamos todos elementos ja presentes na nova stack,logo a original
fica vazia,adicionamos o elemento e dps voltamos a jogar os elementos da
stack 2 para a stack original de forma que a ordenacao fique de uma queue.

*/




class MyQueue {

    /** Initialize your data structure here. */
    
    Stack<Integer> stack;
    Stack<Integer> stack2;
    
    public MyQueue() {
         stack = new Stack<>();
         stack2 = new Stack<>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
        }else{
            while(!stack.isEmpty()){
                stack2.push(stack.pop());
            }
            stack.push(x);
            while(!stack2.isEmpty()){
                stack.push(stack2.pop());
            }
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 
