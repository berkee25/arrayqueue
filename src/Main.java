public class Main {
    public static void main(String[] args) {
        myq myq = new myq(4);
        myq.enqueue(2);
        myq.enqueue(3);
        myq.enqueue(4);
        myq.enqueue(5);
        myq.print();
        myq.dequeue();
        myq.print();
        myq.dequeue();
        myq.print();
    }
}
