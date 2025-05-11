import java.util.Scanner;
public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilih;

        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Layani mahasiswa");
            System.out.println("3. lihat mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah mahasiswa dalam antrian");
            System.out.println("6. Lihat data terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu:"); 
            pilih = sc.nextInt(); sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM  :");
                    String nim = sc.nextLine();
                    System.out.print("Nama :");
                    String nama = sc.nextLine();
                    System.out.print("Prodi:");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas:");
                    String kelas = sc.nextLine();
                    System.out.print("NIM :");
                    Mahasiswa mhs  = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if (dilayani!=null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam latihan: "+antrian.getJmlAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }while(pilih != 0);
        sc.close();
    }
}
