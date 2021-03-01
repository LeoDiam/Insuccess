package Insuccess.app.main;

import Insuccess.app.data.DaoImpl;
import Insuccess.app.manager.DBConnectionManager;
import Insuccess.app.model.Questions;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelDemo {
  static int counter = 0;
    static int count = 0;
    public static void main(String[] args) throws IOException, InterruptedException {
//obtaining input bytes from a file
        FileInputStream fis = new FileInputStream("C:\\Users\\leoni\\OneDrive\\Υπολογιστής\\practice.xlsx");
//creating workbook instance that refers to .xls file
        XSSFWorkbook wb = new XSSFWorkbook(fis);
//creating a Sheet object to retrieve the object
        XSSFSheet sheet = wb.getSheetAt(0);
//evaluating cell type
        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();

        for (Row row : sheet)     //iteration over row using for each loop
        {


            for (Cell cell : row)    //iteration over cell using for each loop
            {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number

                       // System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//getting the value of the cell as a string

                        if(counter <= 2996) {
                            ++count;
                            System.out.println(wb.getSheetAt(0).getRow(counter).getCell(0)); //id
//                            System.out.println(wb.getSheetAt(0).getRow(counter).getCell(3)); //ekfonisi
//                            System.out.print("  "+wb.getSheetAt(0).getRow(counter).getCell(1)); //svsth apantisi
//                            System.out.print("  "+wb.getSheetAt(0).getRow(counter+1).getCell(3));//apant1
//                            System.out.print("  "+wb.getSheetAt(0).getRow(counter+2).getCell(3));//apant2
//                            System.out.print("  "+wb.getSheetAt(0).getRow(counter+3).getCell(3));//apant3
//                            System.out.print("  "+wb.getSheetAt(0).getRow(counter+4).getCell(3));//apant4
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

