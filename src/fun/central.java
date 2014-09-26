/**
 * 
 */
package fun;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * @author gidakash
 *
 */
public class central {

	public static void main(String[] args) {


		//Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		//Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("bestData");

		int rownum = 0;
		XSSFRow row = null;
		
		row = sheet.createRow(++rownum);
		int cellnum = 0;
		XSSFCell cell = row.createCell(cellnum++);
		cell.setCellValue("hi i am akash");
		cell = row.createCell(cellnum++);
		cell.setCellValue(0.00);
		cell = row.createCell(cellnum++);
		cell.setCellValue("goodboy");
		cell = row.createCell(cellnum++);
		cell.setCellValue("done");
		cell = row.createCell(cellnum++);
		cell.setCellValue("roddu");
		try
		{
			//Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
			workbook.write(out);
			out.flush();
			out.close();
			System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
