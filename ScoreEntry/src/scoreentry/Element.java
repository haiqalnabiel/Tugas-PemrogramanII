package scoreentry;

import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private double nilai;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    public String getStatus() {
        if (nilai >= 70.0) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}