package coding_test.hand_test;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> array;

    public Queue(){
        this.array = new LinkedList<>();
    }

    public void append(Integer value){
        this.array.add(value);
    }

    public Integer popLeft(){
        if(this.array.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return this.array.removeLast();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.append(1);
        queue.append(2);

        System.out.println(queue.popLeft());
        System.out.println(queue.popLeft());
        System.out.println(queue.popLeft());
    }
}
