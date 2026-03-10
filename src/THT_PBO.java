import java.util.Scanner;

public class THT_PBO {
    public static void main(String[] args) {
        
        // Memulai input scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SISTEM LOGICALC FASTSEND ===");
        
        System.out.print("Masukkan Nama Klien : ");
        String namaPelanggan = sc.nextLine(); // [cite: 13]
        
        System.out.print("Masukkan Berat (Kg) : ");
        double beratBarang = sc.nextDouble(); // [cite: 14]
        
        System.out.print("Masukkan Jarak (Km) : ");
        int jarakTempuh = sc.nextInt(); // [cite: 15]
        
        System.out.print("Masukkan Jumlah Box : ");
        int totalBox = sc.nextInt(); // [cite: 16]
        
        // Proses perhitungan logistik
        int muatanTruk = 150; // Kapasitas maksimal per truk [cite: 19]
        int jmlTruk = totalBox / muatanTruk; // Menghitung truk penuh [cite: 20]
        int sisaPaket = totalBox % muatanTruk; // Sisa box menggunakan modulus [cite: 21]
        
        // Kalkulasi rincian biaya
        double biayaJarak = jarakTempuh * 15000.0; // Tarif Rp 15.000/Km [cite: 23]
        double biayaBerat = beratBarang * 5500.0; // Tarif Rp 5.500/Kg [cite: 24]
        double totalDasar = biayaJarak + biayaBerat; // Dasar Biaya 
        double biayaAsuransi = totalDasar * 0.035; // Asuransi 3.5% [cite: 26]
        double tagihanAkhir = totalDasar + biayaAsuransi; // Total Tagihan [cite: 27]
        
        // Konversi waktu perjalanan (60 km/jam)
        int estimasiJam = jarakTempuh / 60; // [cite: 32]
        int estimasiMenit = jarakTempuh % 60; // [cite: 32]
        
        // Menampilkan Output sesuai template
        System.out.println("\n--- RESI PENGIRIMAN ---");
        System.out.println("Klien            : " + namaPelanggan);
        System.out.println("Total Box        : " + totalBox + " box");
        System.out.println("Kebutuhan Armada : " + jmlTruk + " Truk Penuh dan sisa " + sisaPaket + " box via Pikap");
        
        System.out.println("\nEstimasi Waktu   : " + estimasiJam + " Jam " + estimasiMenit + " Menit (Asumsi 60km/jam)");
        
        System.out.println("\n--- RINCIAN BIAYA ---");
        System.out.println("Dasar Biaya      : Rp " + totalDasar);
        System.out.println("Asuransi (3.5%)  : Rp " + biayaAsuransi);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR      : Rp " + tagihanAkhir);
        System.out.println("====================================");
        sc.close();
    }
}