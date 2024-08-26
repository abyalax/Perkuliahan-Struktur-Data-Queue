package MethodQueue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //ini adalah bentuk abstraksi untuk model pemrograman berbasis antar muka dengan abstraksi
        //queue hanya antar muka yang didalamnya ada menggunakan struktur data linked list atau dengan PriorityQueue;
        //linkedlist
        Queue<String> dataQueue = new LinkedList<>();
        //priorityqueue
        Queue<Integer> dataQueue2 = new PriorityQueue<>();
        //untuk method nya hampir sama dengan method bawaan java linkedlist

        dataQueue.add("satu");
        dataQueue.add("dua");
        dataQueue.add("tiga");
        dataQueue.poll();   // Mengambil data pertama dan menghapusnya
        dataQueue.remove();  // Menghapus elemen pertama

        System.out.println(dataQueue);
        
        dataQueue2.add(1);
        dataQueue2.add(2);
        int dataPertama = dataQueue2.peek();
        dataQueue2.isEmpty();
        System.out.println("data pertama dataQueue2 = " + dataPertama);

        System.out.println(dataQueue2);



    }
}
