package Package200Sessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class9JavaStreamsMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		map();
		limit();
		sort();
		Unique();
		count();
		foreach();

	}

	public static void map() {
		// this method is used when and when you want to perfrom any other operation
		// after intermediate opration
		String[] city = { "Ferance", "Germany", "Itally", "IraN", "Isreal", "Syrial" };
		List<String> Al = Arrays.asList(city);

 Al.stream().filter(s -> s.endsWith("l")).map(s -> s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

	public static void limit() {
		// This is a terminal operation
		// this limit method is used when you want to print the specific index value
		// after using streams
		ArrayList<String> city1 = new ArrayList<String>();

		city1.add("India");
		city1.add("Hyderabadh");
		city1.add("Tamilnadu");
		city1.add("Bangalore");
		city1.add("Bangalore1");

		Stream<String> out2 = city1.stream().filter(s -> s.startsWith("Ban")).limit(2);
		System.out.println(out2);

	}

	public static void sort() {
		// This is termial operation
		// This method is used to sort the , un osorterd array elements in an assending
		// order
		String[] city = { "Abble", "Accle", "Addle", "AEEle", "Abcde", "Baaccdd" };
		List<String> Al = Arrays.asList(city);
		System.out.println("This is before sorting = " + Al);
		Al.stream().filter(s->s.startsWith("A")).sorted().forEach(s -> System.out.println("This is after sorting"+s));

	}

	public static void Unique() {
		// dont know java is throwing incorrec uput here
		
		// This method is used to remove the duplicates from the array
	 List<String> Alpet = Arrays.asList("Apple", "Ball", "Apple", "cat", "Dog", "cat");
		
	 
	/*  Stream<Integer> values = Stream.of(5, 6, 3, 2, 7, 4, 1, 6, 7, 3); */ // java was giving us an unknow error when i use stream.of () concept "java.util.stream.ReferencePipeline$Head@31b7dea0"
	/*	so had to change to array lsit */
		
		//pets
		List<Integer> Alvalues = Arrays.asList(5, 6, 3, 2, 7, 4, 1, 6, 7, 3);
		System.out.println("This is before unique Pets  = " + Alpet);
		Alpet.stream().distinct().sorted().forEach(s->System.out.println("This is after unique and sorting for Pets ="+ s));
		List<String> Collected = Alpet.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(Collected);
	
		//values
		
		System.out.println("This is before unique Values  = " + Alpet);
		Alvalues.stream().sorted().distinct().forEach(s->System.out.println("This is after unique and sorting for values = "+ s));

	}

	public static void count() {
		// This method is used just to store the total count after performing the
		// intermediate operation

		List<String> places = Arrays.asList("Place1", "Place2", "Place3", "Place4");
		long count = places.stream().count();

		System.out.println("This is the total count of places = " + count);

	}

	public static void foreach() {
		// This methods are used when we need to print the output at all the indexes,
		// after performing the intermediate operations
		List<String> Alphabet = Arrays.asList("Abc", "Def", "Ghi", "Lmn", "Opq");

		Alphabet.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("This is after filtering the alphabet and Upper case"+s));

	}
}
