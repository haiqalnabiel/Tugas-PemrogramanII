package scoreentry;

import java.util.Scanner;

public class ScoreEntry {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Objek mahasiswa
        System.out.print("Masukkan nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = input.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

        System.out.print("Masukkan nilai Mahasiswa: ");
        double nilai = input.nextDouble();

        mahasiswa.setNilai(nilai);

        // Display
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNIM());
        System.out.println("Nilai: " + mahasiswa.getNilai());
        System.out.println("Status: " + mahasiswa.getStatus());

        input.close();
    }
}