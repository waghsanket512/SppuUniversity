
public class Test1 {

	int a;
	int b;
	int res;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {

		System.out.println("Singleton Class");
		Test1 t1 = new Test1();
		t1.setA(30);
		t1.setB(60);

		System.out.println(" " + t1.getA());
		System.out.println(" " + t1.getB());

	}

}
