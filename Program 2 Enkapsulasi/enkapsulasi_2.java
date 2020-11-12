import java.util.Scanner;

public class enkapsulasi_2{
	public static void main(String args[]){
		String NIK, Nama, JenisKelamin;
		int Umur;
		String NIM, Fakultas, Jurusan;
		double Tugas1, Tugas2, Tugas3;
		double UTS, UAS;
		double hasil;
		
		Mahasiswa MHS = new Mahasiswa();
		Scanner SC = new Scanner(System.in);
		System.out.print("Masukkan NIK = ");
		NIK = SC.nextLine();
		System.out.print("Masukkan Nama Anda = ");
		Nama = SC.nextLine();
		System.out.print("Masukkan Jenis Kelamin = ");
		JenisKelamin = SC.nextLine();
		System.out.print("Masukkan Umur = ");
		Umur = SC.nextInt();
		SC.nextLine();
		System.out.print("Masukkan NIM = ");
		NIM = SC.nextLine();
		System.out.print("Masukkan Fakultas = ");
		Fakultas = SC.nextLine();
		System.out.print("Masukkan Jurusan = ");
		Jurusan = SC.nextLine();
		
		System.out.print("Masukkan Tugas 1 = ");
		Tugas1 = SC.nextDouble();
		System.out.print("Masukkan Tugas 2 = ");
		Tugas2 = SC.nextDouble();
		System.out.print("Masukkan Tugas 3 = ");
		Tugas3 = SC.nextDouble();
		System.out.print("Masukkan Nilai UTS = ");
		UTS = SC.nextDouble();
		System.out.print("Masukkan Nilai UAS = ");
		UAS = SC.nextDouble();
		
		System.out.println("\n========================\n");
		MHS.identitas(NIK, Nama, JenisKelamin, Umur);
		MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
		MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3, UTS, UAS);
	}
}