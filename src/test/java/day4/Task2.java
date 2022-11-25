package day4;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Task2 {
    
    @Test
    
    public void testData()
    {
        File src=new File("C:\\Users\\yarthanm\\Desktop\\SapientTestData.xlsx");    
        try
        {
            XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\yarthanm\\Desktop\\SapientTestData.xlsx")));
            XSSFSheet sh1=wb.getSheet("sheet1");
//            XSSFRow r1=sh1.getRow(0);
//            XSSFCell c1=r1.getCell(0);
                int row=sh1.getPhysicalNumberOfRows();
                int col=sh1.getRow(0).getPhysicalNumberOfCells();
                for(int i=0;i<row;i++)
                {
                for(int j=0;j<col;j++)
                {
                    String value=sh1.getRow(i).getCell(j).getStringCellValue();
                   // System.out.println(value);
                    System.out.println(value);
                }
            }
                }catch(FileNotFoundException e) {
                    System.out.println("path is incorrect");
                }catch(IOException e) {
                    System.out.println("unexpected error");
                }
    }



}