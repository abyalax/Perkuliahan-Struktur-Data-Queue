package TugasQueue;

import java.util.Queue;
import java.util.LinkedList;
 
public class Bengkel {
    private Queue<Mobil> antrian;
    private Queue<Mobil> onBoarding;
    private int Kuota;
    private int nomorAntrianTerakhir;

    public Bengkel(int Kuota) {
        this.Kuota = Kuota;
        antrian = new LinkedList<>();
        onBoarding = new LinkedList<>();
    }
    public void enqueue(Mobil namaMobil) {
        nomorAntrianTerakhir++;
        Mobil mobil = new Mobil(namaMobil.getNama(), namaMobil.getPlatMobil(), nomorAntrianTerakhir);
        if (antrian.size() < Kuota) {
            antrian.add(mobil);
        } else {
            onBoarding.add(mobil);
            System.out.println("\nKuota penuh");
        }
    }
    public void dequeue(Mobil namaMobil) {
        if (!antrian.isEmpty()) {
            Mobil selesaiMobil = antrian.poll();
            System.out.println("\ndata Antrian "+ selesaiMobil.getNomorAntrian() +" "+ selesaiMobil + " --> diperbaiki ---> OK \n");

            if (!onBoarding.isEmpty()) {
                Mobil nextMobil = onBoarding.poll();
                antrian.add(nextMobil);
            }
        } else {
            System.out.println("Tidak ada mobil dalam antrian untuk diperbaiki.");
        }
    }
    public void tampilkanAntrian() {
        for (Mobil mobil : antrian) {
            System.out.println("Antrian " + mobil.getNomorAntrian() + ". " + mobil + "--> diperbaiki");
        }
    }
}