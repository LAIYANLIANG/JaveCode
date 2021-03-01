
public class TestIfElseIfElse {
	public static void main(String[] args) {
		int age = (int) (100 * Math.random());
		System.out.println("year is" + age + "behind");
		if(age<15) {
			System.out.println("chile,like play toy");
		}else if(age<25) {
			System.out.println("young ,should learn");
		}else if(age<45) {
			System.out.println("man,shold work");
		}else {
			System.out.println("old people , go to die");
		}
		
	}
}
