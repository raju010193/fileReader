/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readExel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author sidhu munagala
 */
public class ReadExelSheet {

    public boolean readExelData(String FILE_PATH) throws FileNotFoundException, IOException {
        boolean isReadSuccess = false;
        File xlFile = new File(FILE_PATH);
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(xlFile));

        // Get first sheet from the workbook
        XSSFSheet sheet = wb.getSheetAt(0);


        // Iterate through each rows from first sheet
        Iterator<Row> rowIterator = sheet.iterator();
        ArrayList<FileProperties> fileData = new ArrayList<>();
        while (rowIterator.hasNext()) {
            isReadSuccess = true;
            //  row = rowIterator.next();
            FileProperties beans = new FileProperties();
            // For each row, iterate through each columns

            Row row = rowIterator.next();
            //boolean b=row.getLastCellNum();

            System.out.println(row.getCell(1));
            



        }
        return isReadSuccess;
    }
}
