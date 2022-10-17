import javax.swing.*;

public class Main {
        public static void main(String args[]) {
                Mahasiswa mhs1 = new Mahasiswa();

                // INPUT NAMA
                mhs1.nama = JOptionPane.showInputDialog(null, "Masukkan Nama Anda : ", "NAMA ANDA",
                                JOptionPane.QUESTION_MESSAGE);

                // INPUT NILAI
                while (true) {
                        mhs1.nilai = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Masukkan Nilai Anda : ", "NILAI ANDA",
                                                        JOptionPane.QUESTION_MESSAGE));
                        if (mhs1.getNilai() <= 100) {
                                break;
                        }
                        JOptionPane.showMessageDialog(null, "Inputkan Data Dengan Benar!!!", "KETERANGAN",
                                        1);
                }

                // INPUT MK
                mhs1.mk = JOptionPane.showInputDialog(null, "Masukkan MataKuliah Anda : ",
                                "MATAKULIAH ANDA",
                                JOptionPane.QUESTION_MESSAGE);

                // OUTPUT LULUS
                if (mhs1.getNilai() >= 50) {
                        // WINDOW LULUS
                        JOptionPane.showMessageDialog(null,
                                        mhs1.getNama() + "...\nNilai Angka Anda : " + mhs1.getNilai()
                                                        + "\nNilai Huruf Anda : "
                                                        + mhs1.getIndeks() + "\nAnda Lulus pada MK : " + mhs1.getMK(),
                                        "KETERANGAN", 1);

                } else {
                        // WINDOW TIDAK LULUS
                        JOptionPane.showMessageDialog(null,
                                        mhs1.getNama() + "...\nNilai Angka Anda : " + mhs1.getNilai()
                                                        + "\nAnda tidak lulus ! pada MK : " + mhs1.getMK(),
                                        "KETERANGAN", 1);

                }
        }
}