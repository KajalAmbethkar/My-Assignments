package week6.day1;


	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadLeaf {
		

		public static String[][] readData(String fileName,int sheetIndex) throws IOException {
			XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
			
			
			// Get into the respective sheet
		XSSFSheet ws = wb.getSheetAt(sheetIndex);
		// to get the number of rows with data
				int rowCount=ws.getLastRowNum();
				// to get the number of columns with data
				int cellCount=ws.getRow(0).getLastCellNum();
				String[][] data=new String[rowCount][cellCount];
				
				for(int i=1;i<=rowCount;i++)
				{
					for(int j=0;j<cellCount;j++)
					{
						XSSFRow row=ws.getRow(i);
						XSSFCell cell=row.getCell(j);
						String cellValue = cell.getStringCellValue();
						data[i-1][j]=cellValue;
						
					}
				}
				XSSFRow row = ws.getRow(1);
				// Close the Workbook
				wb.close();
				return data;

}}
