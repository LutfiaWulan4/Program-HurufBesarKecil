
package latihan_pertemuan_6;

import java.util.Scanner;
/**
 * NAMA              : Lutfia Wulandari
 * KELAS             : PBO2
 * NIM               : 23176008
 * PRODI             : Sistem Informasi
 * SEMESTER          : 3
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program           : Huruf besar kecil
 */
public class Latihan_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        System.out.println("BUILD SUCCESSFUL (total time: 2 minutes)");
    }
}
    

