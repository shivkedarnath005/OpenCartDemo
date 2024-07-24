package baseLayer;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	public ExcelDataProvider()
	{
		File src=new File("./InputData/testdata.xlsx");//EXCEL FILE PATH GIVEN IN CONSTRUCTOR
		try
		{
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("Unable to read File"+e);
		}
	}
	public String getStringData(int sheetindex, int row,int column)
	{
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
	}
	public String getStringData(String sheetname, int row,int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	public Double getNumericdata(int sheetindex, int row,int column)
	{
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getNumericCellValue();
	}
	

}
