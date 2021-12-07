package methodExplanation;

import java.awt.desktop.AboutHandler;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class arrayListMethods {

	@Test
	void methods() {

		ArrayList al = new ArrayList();
		String bl = al.toString();
		ArrayList cl = new ArrayList();
		ArrayList dl = new ArrayList();
		ArrayList fl = new ArrayList();
		ArrayList gl = new ArrayList();
		ArrayList il = new ArrayList();
		ArrayList<String> ll = new ArrayList<String>(5); // limiting to a specific number of elements
		ArrayList<String> ml = new ArrayList<String>(3);
		ArrayList<Integer> nl = new ArrayList<Integer>(3);
		
		System.out.println("Printing a new empty Array al = " + al);
		System.out.println("Printing a new Array List after converting an empty Array al to String  = " + bl);

		al.add("Oneeee");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		al.add("Six");
		al.add("Seven");

		System.out.println("Printing the Array After adding new elements al =" + al);

		al.add("Three");
		al.add("Four");
		al.add("Five");

		System.out.println("Priting the array after including duplicate values al =" + al);
		String CL = al.toString();

		System.out.println("Printing the array after an arrayList al has converted to String = " + cl);
		
		
		
		al.addAll(dl); // ** Very Important This is used just to Append at the ArrayList, you cannot simply Addall directly to an empty ArrayList - there shoud be some elements before you use it 

		System.out.println(
				"Printing the new array after an ADDING ALL the elements from one ArrayList to another empty ArrayList dl via AddAll ="
						+ dl);
		
		dl.add("Automation1");
		dl.add("Automation2");
		dl.add("Automation3");
		dl.add("Automation4");
		dl.add("Automation5");
		
		System.out.println(
				"Printing the new array after an ADDING ALL the elements from one ArrayList to another ArrayList dl(Appending) via AddAll ="
						+ dl);
		
		fl = (ArrayList) al.clone();
		System.out.println("Printing an clone Arraylist fl not an Exact match =" + fl);

		al.add("Selenium Automation");
		System.out.println("Expected Boolen Value to be false (five)=" + al.contains("five"));
		System.out.println("Expected Boolen Value to be True (Five) =" + al.contains("Five"));
		System.out.println("Expected Boolen Value to be flase (Selenium) coz the complete element is Selenium Automation =" + al.contains("Selenium"));
		System.out.println("Expected Boolen Value to be false (Automation) =" + al.contains("Automation"));

		System.out.println("Expected Boolen Value to be True - al.containsAll(fl) =" + al.containsAll(fl));
		System.out.println("al=" + al);
		System.out.println("fl=" + fl);
		System.out.println("Expected Boolean Value to be True = " + al.containsAll(dl));
		System.out.println("al=" + al);
		System.out.println("dl=" + dl);
	
		System.out.println("Expected Boolean Value to be False (five) - coz al ArrayList has more elements init ="
				+ al.equals("five"));
		System.out.println("Expected Boolean Value to be False (Five) - coz al ArrayList has more elements init ="
				+ al.equals("Five"));
		gl = (ArrayList) al.clone();
		System.out.println(
				"Expected Boolean Value will be true as the gl is exact mactch of al ArrayList = " + al.equals(gl));
		System.out.println("al=" + al);
		System.out.println("gl=" + gl);
		System.out.println("Printing the element at index 3 using get() =" + al.get(3));
		System.out.println("Printing the element at index 3 using indexof() ="+al.indexOf(3));  //String does not work for indexof() - this will get us an -ve Value
		// al.forEach(); need to learn

		ArrayList hl = new ArrayList(al); // *** very Important ****

		System.out.println("Adding all the elements of one ArrayList to Another while creating new array hl =" + hl);
		System.out.println("al=" + al);
		System.out.println("hl=" + hl);
		System.out.println("Printing hashcode of ArrayList al =" + al.hashCode()); // ** Very Important here since the al and gl ArrayList are exact Match - hence the hashcode are same 
		System.out.println("Printing hashcode of ArrayList gl =" + gl.hashCode());

		if (al.hashCode() == gl.hashCode()) {

			System.out.println("The Objects are equal ");

		} else {
			System.out.println("The Objects are not equal ");
		}

		System.out.println("Expected Boolean Value to be fasle = " + al.isEmpty());
		System.out.println("Expected Boolean Value to be True = " + il.isEmpty());

		System.out.println("Printing the index of whole ArrayList al =" + al.indexOf(al));
		
		System.out.println("Print the index value for a specific element of an ArrayList al (1) =" + al.indexOf(1));
		System.out.println("Printing the index of whole ArrayList bl =" + al.indexOf(bl));  // no use, this will give you an -ve value, coz the we are mentioning the indexof(3)- element instead we are trying to find index of whole ArrayList 
		System.out.println("Printing the index of whole ArrayList cl =" + al.indexOf(cl)); // this will work only for the integer Type
		System.out.println("Printing the index of whole ArrayList dl =" + al.indexOf(dl));
		System.out.println("Printing the index of whole ArrayList gl =" + al.indexOf(fl));
		System.out.println("Printing the index of whole ArrayList fl =" + al.indexOf(gl));
		System.out.println("Printing the index of whole ArrayList hl =" + al.indexOf(hl));
		
	ll=(ArrayList) al.clone();
	
	System.out.println("Printing an Limited ArrayList ll by cloning the al, ll = "+ll); //we are able to clone more elements than the limited - this is happening coz ArrayList is dynamic in nature
	
	ml.add("Selenium1");
	ml.add("Selenium2");
	ml.add("Selenium3");
	ml.add("Selenium4");
	System.out.println("Printing an ArrayList ml which is limited to 3 elements but adding more than that ="+ml);  //we are able to add more elements than the limited - this is happening coz ArrayList is dynamic in nature
	
	
	nl.add(1);
	nl.add(2);
	nl.add(3);
	nl.add(4);
	
	System.out.println("Printing the element at index 3 using indexof() ="+nl.indexOf(3));
	
	fl.clear();
	
	System.out.println("Printing an ArrayList once it is been cleared fl = "+fl);
System.out.println("Printing an index at 0 ="+gl.get(0));
System.out.println("Printing an index at 0 ="+gl.get(4));
	gl.remove(0);
	gl.remove(4);
	System.out.println("Printing the ArrayList once few elements are being removed from gl ="+ gl);
	gl.remove("Five");
	System.out.println("Printing the ArrayList one element are being removed from gl ="+ gl);
	
	System.out.println("Before removing the common elements al = "+ al);
	System.out.println("Before removing the common elements gl = "+ gl);
	System.out.println("Removing the common Elements betweeen al and gl , and printing al = "+al.removeAll(gl)); // ** Very Important to remove the common elements betweeb 2 ArrayList
	System.out.println("After removing the common elements al = "+ al);
	System.out.println("After removing the common elements gl = "+ gl);	
		
	
	
	}

}
