package kr.tpc;
public class Dog extends Animal{ // eat() { ? }
	// 이름, 나이, 종 : 상태정보---- 상속은 행위정보측면에서 바라봐야한다.
	// 재정의(override)
	public void eat() {
		System.out.println("개처럼 먹다.");
	}
	public Dog() {
		super(); // Animal의 생성자를 호출 --> new Animal();
	}
}
