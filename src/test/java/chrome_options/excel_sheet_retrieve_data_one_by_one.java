package chrome_options;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_sheet_retrieve_data_one_by_one {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		// TODO Auto-generated method stub
		
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("login");
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<row_count;i++) {
			for(int j=0;j<col_count;j++) {
			}
		}
		workbook.getSheet("login").getRow(0).toString();
		
	}

}
