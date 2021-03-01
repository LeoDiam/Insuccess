package Insuccess.app.main;

import Insuccess.app.data.DaoImpl;
import Insuccess.app.manager.DBConnectionManager;
import Insuccess.app.model.Questions;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelDemo {
  static int counter = 0;
    static int count = 0;
    public static void main(String[] args) throws IOException, InterruptedException {

        FileInputStream fis = new FileInputStream("C:\\Users\\leoni\\OneDrive\\Υπολογιστής\\practice.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();

        for (Row row : sheet)
        {


            for (Cell cell : row)
            {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:

                        break;
                    case Cell.CELL_TYPE_STRING:


                        if(counter <= 2996) {
                            ++count;
                            System.out.println(wb.getSheetAt(0).getRow(counter).getCell(0));
                            Questions q = new Questions(count,
                                    wb.getSheetAt(0).getRow(counter).getCell(3),
                                    wb.getSheetAt(0).getRow(counter+1).getCell(3),
                                    wb.getSheetAt(0).getRow(counter+2).getCell(3),
                                    wb.getSheetAt(0).getRow(counter+3).getCell(3),
                                    wb.getSheetAt(0).getRow(counter+4).getCell(3),
                                    wb.getSheetAt(0).getRow(counter).getCell(1));
                            DBConnectionManager manager = new DBConnectionManager();
                            DaoImpl impl = new DaoImpl(manager);
                              impl.insertQuestions(q);
                              Thread.sleep(2);
                        }

                        counter +=5;
                        break;
                }

            }

        }
    }
}

