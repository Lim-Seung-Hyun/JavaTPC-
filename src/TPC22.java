import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {
		
		// upcasting
		//Cat ani = new Cat();
		// Object ani = new Cat();
		Animal ani = new Cat(); // upcasting
		ani.eat(); // 컴파일시점-> Animal, 실행시점에서는 Cat의 eat
		
		//	ani.night();
		//Cat c = (Cat)ani; // downcasting
		//c.night();
		((Cat)ani).night(); // 괄호 우선순위 주의
		
		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위 클래스가 하위 클래스에게 동일한 메세지로
		// 서로 다르게 동작시키는 객체지향 원리다.
		
		Object o = new Dog();
		//o.eat();
		((Dog)o).eat();
	}

}
