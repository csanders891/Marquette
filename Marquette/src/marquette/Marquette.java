package marquette;

import java.util.ArrayList;

public class Marquette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> teammates=new ArrayList<String>();
		System.out.println("Hello.  I'm Carter and these are my Marquette Park teammates:");
		System.out.println("----------------------------------");
		teammates.add("Lavitta");
		teammates.add("Charles");
		teammates.add("Chris");
		teammates.add("Maria");
		teammates.add("Sylvia");
		teammates.add("Marcus");
		teammates.add("Ellen");
		teammates.add("Brandon");
		teammates.add("Laurie");
		teammates.add("Deanna");
		teammates.add("Paul");
		teammates.add("Byron");
		teammates.add("Tysheika");
		teammates.add("Jason");
		
		for(int i=0; i < teammates.size(); i++)
			System.out.println(teammates.get(i));
		
		
	}

}
