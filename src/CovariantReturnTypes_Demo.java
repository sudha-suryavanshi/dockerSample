import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
	public String whatsYourName() {
		return "I have many names and types.";
	}
}

class Jasmine extends Flower {
	@Override
	public String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	@Override
	public String whatsYourName() {
		return "Lily";
	}
}

class Region {
	public Flower yourNationalFlower() {
		return new Flower();
	}
}

class westBangal extends Region {
	public Jasmine yourNationalFlower() {
		return new Jasmine();
	}
}

class AndhraPradesh extends Region {
	public Lily yourNationalFlower() {
		return new Lily();
	}
}

public class CovariantReturnTypes_Demo {

	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String s=br.readLine().trim();
	Region region=null;
	switch(s) {
		case"westBangal":
			region= new westBangal();
			  break;
			  
		case"AndhraPradesh":
			region=new AndhraPradesh();
			break;
			
	}
	Flower flower=region.yourNationalFlower();
	System.out.println(flower.whatsYourName());

	}

}
