package fileHandling;

import java.io.IOException;

public class TestXlsReader {

	public static void main(String[] args) throws IOException {
		Xls_Reader xl= new Xls_Reader("E:\\Automation2\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		//get row count
		System.out.println(xl.getrowcount("Sheet1"));
		
		//get 
		System.out.println(xl.getColumncount("Sheet1"));
		
		//cell
		System.out.println(xl.getCellData("Sheet1", 1, 2));
		
	}

}
