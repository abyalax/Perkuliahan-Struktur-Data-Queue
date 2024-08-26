//deklarasi
public class Queue {
    private String data[];
    private int size;
    private int kapasitas;
    private int rear;
    private int front;

    // inisialisasi
    public Queue(int kapasitas) {
        front = -1;
        rear = -1;
        kapasitas = this.kapasitas;
        data = new String[size];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear >= size - 1;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            String temp = data[front];
            for (int i = 0; i < rear; i++) {
                data[i] = data[i + 1];
            }
            rear--;
            System.out.println("data " + temp + " telah dihapus dari penyimpanan");
        }
    }

    public void enqueue(String item) {
        if (isEmpty()) {
            data[++front] = item;
            rear++;
            System.out.println(item);
        } else {
            if (isFull()) {
                System.out.println("Kuota Penuh");
            } else {
                // data[++rear] = item;
                // System.out.println(item);
                rear = (rear + 1) % kapasitas;
                data[rear] = item;
                size++;
                System.out.println(item + "enqueued to queue");
            }
        }
    }

public void infoQueue() {
    for (int i = 0; i <= rear; i++) {
        System.out.println(data[i]);
    }
}

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        System.out.println(queue.rear);
        System.out.println(queue.front);
    }
}