public class Mahasiswa21 {
  String nim;
  String nama;
  String kelas;
  double ipk;

  public Mahasiswa21() {
  }

  public Mahasiswa21(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  public void tampilInformasi() {
    System.out.println(nama + " \t " + nim + " \t " + kelas + " \t " + ipk);
  }
}