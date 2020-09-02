package Ddlogintestcases;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public class ExcelDP {


    public void readexel() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("D:\\Internship\\Dp.xlsx");
        Workbook workbook= new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Iterator<Row> row= sheet.iterator();
        while (row.hasNext());
        Row rowvalue=row.next();
        Iterator<Cell> column=rowvalue.iterator();
        while (column.hasNext());
        Cell cellvalue=column.next();
        System.out.println(cellvalue);


            }
        }


