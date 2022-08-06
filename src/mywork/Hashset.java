package mywork;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> data = new HashSet<>();
		data.add(1);
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(2);
		System.out.println(data.contains(1));
	
		

	}

}
