package Phase5;

import java.io.IOException;
import java.util.ArrayList;

public class Class04ExcelDataDrivenCalling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Class03ExcelDataDrivenGeneric Data = new Class03ExcelDataDrivenGeneric(); //  to call any method we need to create an object
	ArrayList<String> Output = Data.getexceldata("RowOne");
	
System.out.println(	Output.get(0));
System.out.println(	Output.get(1));
System.out.println(	Output.get(2));
System.out.println(	Output.get(3));
// System.out.println(	Output.get(4)); we dont have any value in it
 // System.out.println(	Output.get(5));

	}

}
