/*Java Program to demonstrate the Java Inheritance with all Inheritance Types and Super Keyword*/

class Animal{  
	String color = "white";
	void eat(){System.out.println("eating...");}  
	}  
class Dog extends Animal{  //Simple Inheritance
	String color = "black";
	void bark(){System.out.println("barking...");} 
	void printColor(){
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class //super keyword example
	}
	}  
class BabyDog extends Dog{  //Multilevel Inheritance
	void weep(){System.out.println("weeping...");}  
	}  
class Cat extends Animal{  
	void meow(){System.out.println("meowing...");}  //Hierarchical Inheritance
}  

public class InheritanceExample {  
		public static void main(String args[]){  
	
		BabyDog d=new BabyDog();
		d.weep();
		d.bark();  
		d.eat();  
		d.printColor();
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		}
}
