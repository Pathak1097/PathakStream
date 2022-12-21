package Streams;

import java.util.ArrayList;
import java.util.List;

public class Test_1 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		
		long x =names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(x);
		
		names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("===================================================================================");
		
		names.stream().filter(s->s.length()>4).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	}

}
