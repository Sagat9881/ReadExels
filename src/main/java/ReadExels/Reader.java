package ReadExels;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Reader {

    public static Map<String, String> read(Workbook wb) {
        Map<String, String> container = new HashMap<>();
        try  {
            Sheet sheet = wb.getSheetAt(0);

            int rowStart = sheet.getFirstRowNum();
            int rowEnd = sheet.getLastRowNum();
            String[] buf1 = new String[rowEnd];
            String[] buf2 = new String[rowEnd];

            for (int i = rowStart; i < rowEnd; i++) {
                Row row = sheet.getRow(i);

                Cell cell = row.getCell(0);
                Cell cell2 = row.getCell(1);

                buf1[i] = cell.getStringCellValue();
                buf2[i] = cell2.getStringCellValue();

                container.put(buf2[i], buf1[i]);
                System.out.println(container.get(buf2[i]));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return container;
    }
}
