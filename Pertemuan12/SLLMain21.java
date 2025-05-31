import java.util.Scanner;

public class SLLMain21 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    SingleLinkedList21 sll = new SingleLinkedList21();
    
    System.out.print("Masukkan jumlah data mahasiswa: ");
    int jumlah = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < jumlah; i++) {
      System.out.println("\nData Mahasiswa ke-" + (i+1));
      System.out.print("NIM   : ");
      String nim = sc.nextLine();
      System.out.print("Nama  : ");
      String nama = sc.nextLine();
      System.out.print("Kelas : ");
      String kelas = sc.nextLine();
      System.out.print("IPK   : ");
      double ipk = sc.nextDouble();
      sc.nextLine();

      Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
      sll.addLast(mhs);
    }

    System.out.println("\nHasil Linked List:");
    sll.print();

    System.out.println("data index 1: ");
    sll.getData(1);

    System.out.println("Data mahasiswa an Luthfi berada pada index: " + sll.indexOf("Luthfi"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
  }
}