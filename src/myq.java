public class myq {
    int front , rear ,size;
    int capacity;
    int [] array;

    public myq (int capacity){
        this.capacity = capacity;
        front = size = 0;
        rear = capacity -1 ;
        array = new int[capacity];
    }
    boolean isEmpty(){
        return (size == 0);
    }
    boolean isFull(){
        return (size == capacity);
    }

    void enqueue(int value){
        if (isFull())
            return ;
        rear = (rear + 1) % capacity; // to make circular queue
        array[rear] = value;
        size++;
    }
    int dequeue(){
        if (isEmpty())
            return -1;
        int value = array[front];
        front = (front + 1) % capacity;
        size --;
        return value;
    }
    int front(){
        if(isEmpty())
            return -1;
        return array[front];
    }
    int rear(){
        if(isEmpty())
            return -1;
        return array[rear];
    }
    void print(){
        for(int front = 0; front < size; front++){
            System.out.print(array[front] + " ");
        }
        System.out.println();
    }
}
