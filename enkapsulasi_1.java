import java.io.*;

public class enkapsulasi_1{
	private double radius;

	public enkapsulasi_1(double radius){
		this.radius = radius;
	}
	
	public void Luas(){
		double luas = 3.14 * radius * radius;
		System.out.println("Luas lingkaran = " +luas);
	}
	
	public void Keliling(){
		double keliling = 2.0 * 3.14 * radius;
		System.out.println("Keliling lingkaran = " +keliling);
	}
	
	public static void main(String[]args)throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Input radius = ");
		String input = dis.readLine();
		double i = Double.parseDouble(input);
		enkapsulasi_1 A = new enkapsulasi_1(i);
		A.Luas();
		A.Keliling();
	}
}