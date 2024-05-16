package coding_test.hand_test;

public class Stack {
    int[] array;
    private int top;
    private int size;

    public Stack(int length){
        this.array = new int[length];
        this.size = length;
        this.top = -1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull(){
        return this.top == size-1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        this.array[++this.top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return this.array[this.top--];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
