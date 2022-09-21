import java.util.Scanner;

interface food{
	public String getType();
}
class Cake implements food{
	public String getType() {
		return "Someone ordered Dessert!!!";
	}
}
class Pizza implements food{
	public String getType() {
		return"Someone ordered fast food!!!";	}
}
class foodFactory{
	public food getFood(String order) {
		if(order.equals("Cake")) {return new Cake();}
		else {return new Pizza();}
	}
}


public class Factory_Pattern_Demo {

	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			foodFactory f=new foodFactory();
			food f1=f.getFood(sc.nextLine());
			System.out.println("The factory return "+f1.getClass());
			System.out.println(f1.getType());
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");}
	}
	
}
