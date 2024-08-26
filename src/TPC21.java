import kr.tpc.*;

public class TPC21 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		//Dog.class, Cat.calss
		Animal ani = new Dog(); // upcasting(부모쪽으로 객체를 만듬)
		ani.eat();
		
		ani = new Cat(); // upcasting
		ani.eat();
		// ani.night();
		//Cat cc = (Cat)ani;
		//cc.night();
		((Cat)ani).night(); // downcating
		
	}

}
