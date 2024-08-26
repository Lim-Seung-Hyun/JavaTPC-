import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal 부모클래스를 사용하지 않음
		Dog d = new Dog();
		d.eat(); // ? -> 개처럼 먹다.
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class 이것만 있으면 안에 어떤 기능이 있는지 모름
		Animal ani = new Dog(); // upcasting(자동형변환)
		ani.eat(); // ? -> 개처럼 먹다

		ani = new Cat();
		ani.eat(); // ? -> 고양이처럼 먹다
		//ani.night();
		((Cat)ani).night(); // 밥에 눈에서 빛이난다. --> downcasting(강제형변환)
		
	}
}
