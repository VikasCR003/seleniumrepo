package Phase5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class03ExcelDataDrivenGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> getexceldata(String Specificword) throws IOException {  // Here we are passing the string argumend  inside this method, - to make it geenric -> Repslace the argument value to which ever your if loops you want and pass those specific words by called it in differnt class , and pass the specific word eg: RowOne or RowTwo or RowThree
		FileInputStream Fis = new FileInputStream("C:\\Users\\HP\\Documents\\ExcelDataDrivenTest.xlsx"); //2nd
		XSSFWorkbook Workbook = new XSSFWorkbook(Fis);  //1st
		int Sheetscount = Workbook.getNumberOfSheets();
		System.out.println("Total Numberk of sheets are available ="+ Sheetscount);//3rd Print the number of sheets count
		
		ArrayList<String> al = new ArrayList<String>(); // just creatign an array lsit to store our final values in array format so that it will be easy to use it in our TestNG test Cases
		
		
		for(int a=0; a<Sheetscount; a++) {
		String Sheetsname = Workbook.getSheetAt(a).getSheetName();	
		System.out.println("Sheet name is as follows =" + Sheetsname); // printing all the sheet name
			if (Sheetsname.equalsIgnoreCase("Vikas")) {
				
				// Rowiterator=Sheetsname.Iterator(); -> This will not work coz , Here the type is string and for iterator methods we need integer type to iterat across each row
				//Rowiterator=Sheetscount.Iterator(); -> This will also not work coz, directly we are using an inbuilt mehtod in Workbook , to know the sheet counts, this will
				//not help , coz we need to specifically need to access all the rows at index leve
			
				XSSFSheet Sheetindex = Workbook.getSheetAt(a); // getting the entire rows at index level - under vikas sheet to use iterator method to , move to next rows line by line
					Iterator<Row> Rowiterator = Sheetindex.iterator(); // To move accross the each rows in vikas sheet - now we are the first row
					Row FirstRow = Rowiterator.next(); 
				System.out.println(FirstRow); // printing thd first row let's see how it comes -> this gives an weired output - inrterms of system backend format
				Iterator<Cell> FRCT = FirstRow.cellIterator(); // now we are at 1st row, lets get the string values in the first row and to compare to exact 1strow 1st coloumn vlaue -ROW/COLOUMN
				int k = 0;
				int Coloumnvalue = 0;
				while(FRCT.hasNext()) // iterating each cell untill it a each cell has the value in i
				{
					
				Cell FRCells = FRCT.next(); // we need to go through all the cells of 1st row
				String Cellvalues = FRCells.getStringCellValue();
				System.out.println(Cellvalues);
				 if(Cellvalues.equalsIgnoreCase("Row/Coloumn")) {
					 Coloumnvalue = k; // this is to just know what is our coloumn value of an row - Row/Coloumn
					 // using this index value we are going to iterartor coloumn cells
					 
				 }
				 k++;
				 
				}
				System.out.println("This is a coloumn value of  Row/Coloumn  ="+ Coloumnvalue);
				
				
				while(Rowiterator.hasNext()) {
					Row FCT = Rowiterator.next();
					if(FCT.getCell(Coloumnvalue).getStringCellValue().equalsIgnoreCase(Specificword)){  // **********// using Genric word here 
					
						System.out.println("This is inside Row2");
						//Iterator<Cell> FCCT = FCT.cellIterator(); // iterate across all the cells og RowTwo  (If this 2 code are not inside the while iterat across the each cell of rfirs coloumn then it ill give you some werid output in back end format )
						//System.out.println("This is First coloumn first cell iterator = " + FCCT);
				
						Iterator<Cell> FCSRT = FCT.cellIterator(); // iterating across all the cells of Row2  (FCSRT= First row specific cell iteratror)
						
						while (FCSRT.hasNext()) { // using whie loop to iterator across each cell
						 Cell FCSpecificrowvalues = FCSRT.next(); // iterating each cell
						al.add( FCSpecificrowvalues.getStringCellValue()); // store all the values into an arraylist
						 System.out.println(al); // Now this will print the output of every cell of RowTwo coz - we are using while loop which  will be iterating aacross each cell
						 // now to get it in a single output format - we need to return the array 
					
					//	CellAddress Getaddresofcell = FCSpecificrowvalues.getAddress(); // just out of curiosity trie3d 
					//	System.out.println("This is the Address = "+ Getaddresofcell); //. just out of curiosity trie3d 
						 
					//return al; // as soon you write the retun al here , the main method is void type so it will give you some error , so take all your code in differnt method which is array lsit type - check class02ExcelDataDriven
					//
						}
					}
				}
			}
		 // break; // if you give this then your next sheet names will not be printed , as if loop of vikas sheet will be engaged ,sop for loop breaks
		
		}
        return al; // it always to capture yout return element at last , now this method outputis holding the array list elements
	 
		
	//	system.out.println(al);// this is not working
		
        // your final return values will be al array list and hence we you call the array list , al.get(0) ot know the exact - values
	}
	
}
