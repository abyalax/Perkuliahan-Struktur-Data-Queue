package TugasQueue;

public class Main {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel(5);

        Mobil mobil1 = new Mobil("Yaris", "AG 1933 HG");
        Mobil mobil2 = new Mobil("Avanza", "AG 1976 HF");
        Mobil mobil3 = new Mobil("Fortuner", "AG 1988 E");
        Mobil mobil4 = new Mobil("Sigra", "AG 1988 PW");
        Mobil mobil5 = new Mobil("Agya", "W 1988 RP");
        Mobil mobil6 = new Mobil("Vios", "S 579 TU");

        bengkel.enqueue(mobil1);
        bengkel.enqueue(mobil2);
        bengkel.enqueue(mobil3);
        bengkel.enqueue(mobil4);
        bengkel.enqueue(mobil5);

        bengkel.tampilkanAntrian();

        bengkel.enqueue(mobil6);
        bengkel.dequeue(mobil1); 
        bengkel.dequeue(mobil2);    
        bengkel.tampilkanAntrian();
    }
}