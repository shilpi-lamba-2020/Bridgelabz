/*Java program to demonstrate the Java Encapsulation*/

public class EncapsulationExample {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Shilpi");
		s.setRollNo(20);
		s.setStream("Science");
		
		System.out.println("Name: "+s.getName()+" Roll No: "+s.getRollNo()+ " Stream: "+s.getStream());
	}
}
