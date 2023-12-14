package C_java;

/*
 * - 기본형은 실제 데이터의 값을 보관하고, 참조형은 데이터의 메모리주소를 보관한다.
 * - 참조형 타입은 메모리 주소가 매개변수에 복사되기 때문에 같은 주소를 공유하여(같은 참조값을 바라 봄) 동일한 영향을 준다.
 */
public class MethodParamReferenceTypesAndValues {
	public static void main(String[] args) {
		Human human = new Human();
		human.setAge(5);

		updateAge(human);
		System.out.println("result human = " + human.getAge());

		int number = 11;
		updateNumber(number);

		System.out.println("result number = " + number);
	}

	public static void updateAge(Human human) {
		System.out.println("before = " + human.getAge());
		human.setAge(human.getAge() + 5);

		System.out.println("after = " + human.getAge());
	}

	public static void updateNumber(int number) {
		System.out.println("before = " + number);
		number = number + 5;
		System.out.println("after = " + number);
	}
}

class Human {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}