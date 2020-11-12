public class Lat6{
	
	void myOverload(Lat6_1 a){
		System.out.println("Overload.myOverload(A a)");
	}

	void myOverload(Lat6_2 b){
		System.out.println("Overload.myOverload(B b)");
	}

	public static void main(String[] args){
		Lat6 o = new Lat6();
		Lat6_3 c = new Lat6_3();
		o.myOverload(c);
		
		/*
		*statement di atas akan menjalankan myOverload(B b), karena
		*method tersebut lebih "dekat" dengan method yang dicari
		*bila dibandingkan dengan myOverload(A a)
		*/
	}
}
