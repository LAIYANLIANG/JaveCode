import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入名子");
        String name=scanner.nextLine();
        System.out.println("請輸入愛好");
        String favor = scanner.nextLine();
        System.out.println("請輸入年紀");
        int age=scanner.nextInt();
        System.out.println("#########");
        System.out.println(name);
        System.out.println(favor);
        System.out.println(age);
	}
}
