package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
	
	public static void main(String[] args) {
		
		List<String> ls = Stream.of("Prashant","Rahul","Ankush","Damini","Ritu").sorted().map(s->s.toLowerCase()).collect(Collectors.toList());
		
		Set<String> st =Stream.of("Adam","Abhijit","Ankita","Akshay").filter(s->s.length()>3).sorted().collect(Collectors.toSet());
		
		
		
		
	}

}
