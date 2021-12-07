package methodExplanation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class stringMethods {
	@Test
	void reverseStringArray() {

		String strWords = "Selenium Automation";
		String str = "Selenium";
		System.out.println("This is orginal String " + str);

		char[] strArray = str.toCharArray();
		System.out.println("case 1**********************************************************");
// Case 1 - printing each character after using toCharArray() method 
		System.out.println("******************************************************************");
		System.out.println("printing each character after using toCharArray() method ");
		for (int i = 0; i < strArray.length; i++) {

			System.out.println(strArray[i]);

		}

		System.out.println(str.endsWith("m"));
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
		System.out.println("Case 2************************************************************");
// Case -2 Printing the toCharArray() directly using string method - return type will be string
		
		System.out.println(
				" Printing the toCharArray() directly using string method - and this is off no use jsut to print the output array output with the boxes"
						+ Arrays.toString(strArray));
		String strUpdated = Arrays.toString(strArray);

		System.out.println(strUpdated.endsWith("m"));

		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
		
// Case 3 - directly converting the character Array to List of array - return type will be List
		System.out.println("Case 3*************************************************************");
		List<char[]> List = Arrays.asList(strArray);

		System.out.println("directly converting the character Array to List of array " + List); // here output will be
																								// empty array
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// Case 4 - Just printing the each index via iterator method = this should also give me an empty array as the previous array gave us an empty string
		System.out.println("Case 4************************************************************");
		System.out.println(" Just printing the each index via iterator method ");

		Iterator<char[]> Lit = List.iterator();

		while (Lit.hasNext()) {

			System.out.println(Lit.next());

		}
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// Case 5 - Pushing the each character index to an arrayList index - type is object - return type will be ArrayList
		System.out.println("Case 5********************************************************");
		ArrayList<Object> al = new ArrayList<Object>();
		List<Object> bl = new ArrayList<Object>();
		// System.out.println(al); // this will just give you an empty Array

		for (int i = 0; i < strArray.length; i++) {

			al.add(strArray[i]);
		}

		System.out.println("Pushing the each character index to an arrayList index" + al);
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// Case 6 - Reversing an empty Arraylist with a reference as List just to get the collection methods

		System.out.println("Case 6***********************************************************");
		System.out.println(
				"Reversing an empty Arraylist with a reference as List just to get the collection methods  - before reverse"
						+ bl);
		Collections.reverse(bl);
		System.out.println(
				"Reversing an empty Arraylist with a reference as List just to get the collection methods - after reversing"

						+ bl);

		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// Case 7 - reversing an array list with an reference as also ArrayList by calling out reverse method via collection
		System.out.println("Case 7*************************************************************");
		System.out.println(
				"Reversing an arraylist with reference as ArrayList and implementing directly an reverse method via collection method - Before reversing "
						+ al);
		Collections.reverse(al);
		System.out.println(
				"Reversing an arraylist with reference as ArrayList and implementing directly an reverse method via collection method - Afte reversing "
						+ al);
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// case 8 comparing a string word with sequence of string using contains method		
		System.out.println("Case 8 **************************************************************");
		System.out.println(
				"comparing a string word with sequence of string using contains method = " + str.contains(strWords));
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");

//Case 9 Reversing an string using string method chatAt()
		System.out.println("Case 9 ***** *******************************************************");
		System.out.println("Reversing an string using string method chatAt() -THis will print in christmas tree type ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i)); // Here we cannot push each char in to new empty char string, coz we
												// cannot create an empty char hence everyone uses empty string
		}

		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// Case 10 reversing an string and storing it in a new string and comparing both the strings
		System.out.println("Case 10*************************************************************");
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i); // adding each char to empty string coz i need a return data type as string not
										// char
		}
		System.out.println("reversing an string and storing it in a new string and comparing both the strings"+rev);

		if (str.equals(rev)) {

			System.out.println("Both the strings are same");
		} else {

			System.out.println("the str and rev are 2 differnet strings");
		}
		System.out.println("                                                                       ");
		System.out.println("                                                                       ");
// case 11 Printing the pallendrom
		System.out.println("Case 11*******************************************************");

	String pal = "madam";

// string -> charArray -> Arraylist -> ListIterator()

	char[] palChaArray = pal.toCharArray();

	
	ArrayList<Object> pal1 = new ArrayList<Object>();
	ArrayList<Object> pal2= new ArrayList<Object> ();
	
	 
	for(int i = 0;i<palChaArray.length;i++)
	{

		pal1.add(palChaArray[i]);
	}

	System.out.println("This orginal Array List palAl"+pal1);

	ListIterator<Object> palLI = pal1.listIterator(pal1.size());

	
	while(palLI.hasPrevious())
	{

		pal2.add(palLI.previous());

	}
	System.out.println("                                                                       ");
	System.out.println("                                                                       ");

// case 12- one more way to compare the 2 arrayList using Equals method

	System.out.println("Case 12 *************************************************************");
System.out.println("This is reverse Array List pal2" +pal2);

if (pal1.equals(pal2)){
	
	System.out.println("one more way to compare the 2 arrayList using Equals method = This is palledrom ");
	
}
else {
	
	System.out.println("This is not pallendrom");
}
System.out.println("                                                                       ");
System.out.println("                                                                       ");
// Case 13 - checking the pallandrom condition by comparing the ArrayIndex
System.out.println("Case 13 *************************************************************");
for (int i=0; i<pal1.size(); i++) {
	
	Object indexPal1 = pal1.get(i);
	Object indexPal2 = pal2.get(i);
	
/*	if (indexPal1.equals(indexPal2)) {
		
		System.out.println(indexPal1);
	} */
	
	if(indexPal1==indexPal2) {
		
		System.out.println(indexPal1+"  Equals  "+indexPal2);
		System.out.println("checking the pallandrom condition by comparing the ArrayIndex = This is pallendrom");
	}
	else {
		
		System.out.println("This is not pallendrom");
	}
	
}
System.out.println("                                                                       ");
System.out.println("                                                                       ");
//case 14 - converting ArrayList to String 
System.out.println("Case 14*************************************************************");
String seqStr= "Selenium Automation Java";

System.out.println("Checking the char()   "+seqStr.chars()); // no use dont use

ArrayList cal= new ArrayList(); // empty Array Symbol will be printed
System.out.println("Initializing an empty Array List  " + cal);
ArrayList dal= new ArrayList();
String[] strAr2 = null;
System.out.println("Initializing empty String of Array  " + strAr2); //null will be printed

String [] strAr3 = new String [ seqStr.length()];
System.out.println("Initializing empty String of Array with a length equal to the string  " + strAr3); // some internal values will be printed


String [] strAr1= {"TestNG","BDD","Cucumber"};
System.out.println("directly Adding the items into an String of Array v" + strAr1); // some internal value will be printed 

String[] seqSP = seqStr.split(" ");
System.out.println("Printing the split items " + seqSP); // some internal values will be printed 
System.out.println("                                                                       ");
System.out.println("                                                                       ");
// case 15  adding Adding each character of sequenced array to a empty ArrayList


System.out.println("Case 15*************************************************************");
for (int i=0; i<seqStr.length(); i++) {
	
	// System.out.println("Just printing directly the arrayList when the whole array is addded directly  " + cal.add(seqStr));
	

	cal.add(seqStr.charAt(i));

}
System.out.println("Adding each character of sequenced array to a empty ArrayLisr  " + cal);
System.out.println("                                                                       ");
System.out.println("                                                                       ");
//case 16  Adding each word from sequence of string to empty ArrayList
System.out.println("Case 16*************************************************************");
for (int i=0; i<seqSP.length; i++) {
	
	dal.add(seqSP[i]);
}

System.out.println("Adding each word from sequence of string to empty ArrayList  " + dal );
System.out.println("                                                                       ");
System.out.println("                                                                       ");

// case 17 converting ArrayList to String usind direct Method .toString()
System.out.println("Case 17*************************************************************");

String dalStr = dal.toString();
System.out.println(dalStr);


System.out.println(" converting ArrayList to String usind direct Method .toString() = " + dal );
/*
dalStr.split("[");  //Error as the the split will convert the array into string of Array
System.out.println("Trying different split methods" + dalStr);
dalStr.split("]");//Error as the the split will convert the array into string of Array
System.out.println("Trying different split methods" + dalStr);
dalStr.split(" ");//Error as the the split will convert the array into string of Array
System.out.println("Trying different split methods" + dalStr);
dalStr.split(",");//Error as the the split will convert the array into string of Array
System.out.println("Trying different split methods" + dalStr);
*/
System.out.println("                                                                       ");
System.out.println("                                                                       ");
// case 18 - Converting String word directly to an single Array index  
System.out.println("Case 18*************************************************************");
ArrayList fal= new ArrayList(Arrays.asList(str));

System.out.println(" Converting String word directly to an single Array index  =" +fal);
Iterator falIL = fal.iterator();

while (falIL.hasNext()) {
	
System.out.println(	falIL.next());
	
}
System.out.println("Checking the array index = "+ fal.get(0)); // one word will be stored in an single index
/* System.out.println(fal.get(1)); // error
System.out.println(fal.get(2)); // error
System.out.println(fal.get(3)); // error
*/
System.out.println("                                                                       ");
System.out.println("                                                                       ");
}

}
