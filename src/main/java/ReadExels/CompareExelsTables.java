package ReadExels;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;

public class CompareExelsTables {
    public void CompareExel() throws Exception{
        Workbook wb1 = WorkbookFactory.create(new File("C:\\Java\\ExampleExel\\1.xlsx"));
        Workbook wb2 = WorkbookFactory.create(new File("C:\\Java\\ExampleExel\\2.xlsx"));

        Reader reader = new Reader();
        reader.read(wb1);
    }

}
