package net.codejava.ProductOrder;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
	
	public static void main(String args[]) {
		List<Integer> values = new ArrayList<>();
		
		for(int i = 1; i<=100;i++) {
			values.add(i);
		}
		
		values.stream().forEach(System.out::println);
		
		values.stream().filter(i -> {
			
			System.out.println("hi");
			return true;
			
		}).findAny();
		
		
			
		
	}

}
