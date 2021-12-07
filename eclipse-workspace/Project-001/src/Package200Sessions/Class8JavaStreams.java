package Package200Sessions;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Class8JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> names = new ArrayList <String> ();
names.add("Atlanta");
names.add("London");
names.add("Africa");
names.add("Mexico");

names.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s)); // to print all the names starting with A
long counting = names.stream().filter(s->s.startsWith("A")).count(); // to print the count the names starting with A
System.out.println(counting);
	}

}
