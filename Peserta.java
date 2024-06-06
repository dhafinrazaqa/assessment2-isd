public class Peserta implements Comparable<Peserta>{
    String RT;
    String nama;
    int nilai;

    public Peserta(String RT, String nama, int nilai) {
        this.RT = RT;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Asal RT = " + RT + ", nama = " + nama + ", nilai = " + nilai;
    }

    @Override
    public int compareTo(Peserta other) {
        int peserta = this.getNilai();
        int otherPeserta = other.getNilai();

        if (peserta < otherPeserta) {
            return -1;
        } else if (peserta > otherPeserta) {
            return 1;
        } else {
            return 0;
        }
    }
}
