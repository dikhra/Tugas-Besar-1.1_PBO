public class Mahasiswa {
    String nama;
    String mk;
    String indeks;
    int nilai;

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public String getMK() {
        return mk;
    }

    public String getIndeks() {
        if (getNilai() >= 80) {
            indeks = "A";
        } else if (getNilai() > 75) {
            indeks = "B+";
        } else if (getNilai() > 70) {
            indeks = "B";
        } else if (getNilai() > 65) {
            indeks = "B-";
        } else if (getNilai() > 60) {
            indeks = "C+";
        } else if (getNilai() > 55) {
            indeks = "C";
        } else if (getNilai() > 50) {
            indeks = "C-";
        } else if (getNilai() > 30) {
            indeks = "D";
        } else if (getNilai() <= 30) {
            indeks = "E";
        }
        ;
        return indeks;
    }
}