
import java.util.Scanner;

public class LogiCalc {
    public static void main(String[] args) {
        
        //input dari user
        Scanner input = new Scanner(System.in);
        System.out.println("--- SISTEM LOGICALC FASTSEND ---");
        
        System.out.print("Masukkan Nama Klien : ");
        String namaKlien = input.nextLine();
        
        System.out.print("Masukkan Berat (Kg) : ");
        double berat = input.nextDouble();
        
        System.out.print("Masukkan Jarak (Km) : ");
        int jarak = input.nextInt();
        
        System.out.print("Masukkan Jumlah Box : ");
        int jumlahBox = input.nextInt();
        
        //data yang harus diolah program
        int kapasitasTruk = 150, trukPenuh = jumlahBox / kapasitasTruk, sisaBox = jumlahBox % kapasitasTruk;
        int tarifJarak = 15000;
        double tarifBerat = 5500, dasarBiaya = (tarifJarak * jarak) + (tarifBerat * berat),
                asuransi = dasarBiaya * 0.035, totalBayar = dasarBiaya + asuransi;
        int jam = jarak / 60, menit = jarak % 60;
        
        // Output
        System.out.println("\n--- RESI PENGIRIMAN ---");
        System.out.println("Klien            : " + namaKlien);
        System.out.println("Total Box        : " + jumlahBox + " box");
        System.out.println("Kebutuhan Armada : " + trukPenuh + " Truk Penuh dan sisa " + sisaBox + " box via Pikap");
        
        System.out.println("\nEstimasi Waktu   : " + jam + " Jam " + menit + " Menit (Asumsi 60km/jam)");
        
        System.out.println("\n--- RINCIAN BIAYA ---");
        System.out.println("Dasar Biaya      : Rp " + dasarBiaya);
        System.out.println("Asuransi (3.5%)  : Rp " + asuransi);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR      : Rp " + totalBayar);
        System.out.println("====================================");
    }
}