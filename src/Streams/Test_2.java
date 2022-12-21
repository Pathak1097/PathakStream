package Streams;

import java.util.stream.Stream;

public class Test_2 {
	
	public static void main(String[] args) {
		
		Stream.of("Prashant","Rahul","Akshay","Kale","Ankush").sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
