
public class ClassDemo04 {
	private int a;

	// 這裡定義建構子
	public ClassDemo04(int p1) {
		setA(p1);
	}

	private void setA(int p1) {
		a = p1;
	}

	public int getA() {
		return a;
	}

	public int doSomething(int p1) {
		return a + p1;
	}

	public static void main(String[] args) {
		ClassDemo04 d = new ClassDemo04(12);

		System.out.println();
		System.out.println(d.getA());
		System.out.println(d.doSomething(1));
		System.out.println();
	}
}
