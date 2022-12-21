package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMerge {
	
	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String> ();
		ls.add("Shetty");
		ls.add("Tom");
		ls.add("Rama");
		ls.add("Krishna");
		
		List<String> names2 = Arrays.asList("Deepak","Sagar","Shrikant");
		
		//merge both the List
		
		Stream<String> stre =Stream.concat(ls.stream(), names2.stream());
		
//		stre.forEach(s->System.out.println(s));
//		stre.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//find that Rama is present or not
		
		boolean bl =stre.anyMatch(s->s.equalsIgnoreCase("rma"));
		System.out.println(bl);
		
		
		
		
	}

}
