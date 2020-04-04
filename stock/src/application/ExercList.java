package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Leonardo");
		list.add("Urbano");
		list.add("Sousa");
		list.add("Elieth");
		list.add("Severo");
		list.add("Amorim");

		System.out.println("List: " + list.toString());
		System.out.println("--------------------------------------------------------");
		
		list.remove(1);
		System.out.println("List: " + list.toString());
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("Encontrar id \"Elieth\": " + list.indexOf("Elieth"));
		System.out.println("--------------------------------------------------------");
		
		
		list.removeIf(x -> x.charAt(0) == 'A');
		System.out.println("List: " + list.toString());
		System.out.println("--------------------------------------------------------");
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
		System.out.println("New List: " + result.toString());
		System.out.println("--------------------------------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		System.out.println("Filter character \"E\": " + name);
		System.out.println("--------------------------------------------------------");
		
		
	}
}
