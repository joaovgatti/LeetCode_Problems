/*Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.*/

/*Minha Solucao:

	De forma bastante similar ao problema inverso,fiz apenas uma modificao
	no metodo do push. Foi criada uma queue auxiliar para que antes de add um 
	elemento na queue original,transferimos todos lementos para a queue 
	assistente e entao add o elemento na queue original que se encontra vazia.
	Depois transferimos todos elementos da queue assistante para queue original 
	ja com o ultimo elemento adicionado.

*/


	class MyStack {
    
    Queue<Integer> stack;
    Queue<Integer> stackAuxiliar;

    /** Initialize your data structure here. */
    public MyStack() {
        stack = new LinkedList<>();
        stackAuxiliar = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(stack.isEmpty()){
            stack.add(x);
        }else{
            while(!stack.isEmpty()){
                stackAuxiliar.add(stack.remove());
            }
            stack.add(x);
            while(!stackAuxiliar.isEmpty()){
                stack.add(stackAuxiliar.remove());
            }
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return stack.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return stack.element();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */