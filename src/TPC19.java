import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		// Dog, Cat(자식) --> Animal(부모) 상속받는법
		
		Dog d=new Dog();
		d.eat();
		
		Cat c=new Cat();
		c.eat();
		
		// Dog.java(X), Dog,class(o)
		// Dog dd=new Dog();
		
		// Animal, <---- [Dog.class, Cat.class]
	
		// Dog dd = new Dog();
		// dd.eat();
		/*
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		*/
		
	}
}