/*Java program to demonstrate the interface method visibility*/

public interface MethodVisibility {
	void visibility();  
	}   
class example implements MethodVisibility{  
	public void visibility(){
		System.out.println("method visibility of inherited method should be public");
		}  
	}  
