/*Java program that demonstrates the final variable*/

public class FinalVariableExample  {
	//Blank final variable
	final int id;
	//parameterized constructor
	FinalVariableExample(int idNum) {
	//Blank final variable must be initialized in constructor
		id = idNum;
	}
	void getDetails() { //final method
		System.out.println("Id of the Employee is: " + id);
	}
	public static void main(String args[]) {
		FinalVariableExample emp = new FinalVariableExample(154);
		emp.getDetails();
	}
}
