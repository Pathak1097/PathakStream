package Streams;

import java.util.Arrays;
import java.util.List;

public class Unique_Stream {
	
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(5,6,2,6,5,9,8,9,2,8,1,4,7,4,7,3,3);
		
		ls.stream().distinct().forEach(s->System.out.print(s+" "));
		
		System.out.println();
		System.out.println("===================================================");
		// now sort the stream
		
		ls.stream().distinct().sorted().forEach(s->System.out.print(s+" "));
	}

}
