import java.math.BigDecimal;

/**
 * 測試方法的使用
 */
public class TestMethod {
	public static void main(String[] args) {
		// 通過對像調用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt(5);
		//int c = tm.add(30, 40, 50,111) + 1000;
		//System.out.println("反回後在加100後:" + c);
		int c=add(20.0, 30, 40,50);
		System.out.println("反回後在加100後:"+ c);
	}

	void printSxt(int i) {
		System.out.println("第一行" + i);
		System.out.println("第二行" + ++i);
		System.out.println("第三行" + ++i);
	}

	public static int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("返回數建構三：" + sum);
		return sum;// return二個作用：1：結束方法的運行 2、反回值
	}

	public static int add(int a, int b, int c, int d) {
		int sum = a + b + c;
		System.out.println("返回數建構四_int：" + sum);
		return sum;// return二個作用：1：結束方法的運行 2、反回值
	}
	
	public static int add(double a, int b, int c, int d) {
		int sum = (int) (a + b + c);
		System.out.println("返回數建構四_double：" + sum);
		return sum;// return二個作用：1：結束方法的運行 2、反回值
	}

}
