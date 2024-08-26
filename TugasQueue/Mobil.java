package TugasQueue;

class Mobil {
    private int nomorAntrian;
    private String nama;
    private String platMobil;

    public Mobil(String nama, String platMobil) {
        this.platMobil = platMobil;
        this.nama = nama;
    }
    public Mobil(String nama, String platMobil, int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
        this.platMobil = platMobil;
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    } 
    public String getPlatMobil() {
        return platMobil;
    }
    public int getNomorAntrian() {
        return nomorAntrian;
    }
    public void setNomorAntrian(int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }
    @Override
    public String toString() {
        return nama + " " + platMobil;
    }
}