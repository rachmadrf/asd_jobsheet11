import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueMahasiswa queue = new QueueMahasiswa();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Belakang");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Lihat Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM        : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama       : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan  : ");
                    String keperluan = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, keperluan);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    queue.clear();
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa yang masih mengantri: " + queue.getSize());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilih != 0);

        sc.close();
    }
}