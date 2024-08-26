import kr.tpc.*;

public class TPC23 {
	public static void main(String[] args) {
		// 1. 다형성인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
	}	//							upcasting

	private static void display(Animal r) { // 다형성 인수
		r.eat();
		//r.night();
		if( r instanceof Cat) {	// r이 Cat 타입으로 만들어졌으면 true
			((Cat)r).night();	// downcasting
		}
	}
}