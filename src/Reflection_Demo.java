
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
class Student{
	
	private int id;
	private String name;
	private String Email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}

public class Reflection_Demo {
	public static void main(String args[]) {
	   Class student=new Student().getClass();	
	   Method[]methods=student.getDeclaredMethods();
	   
	   ArrayList<String> methodlist=new ArrayList<>();
	   for(Method method:methods)
	   {
		   methodlist.add(method.getName());
	   }
	   Collections.sort(methodlist);
	   for(String name:methodlist) {
		   System.out.println(name);
	   }
	}

}
