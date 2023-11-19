import java.io.File;
import java.io.FileInputStream;
 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class LeerExcel {
 
    public static void main(String[] args) {
        try {
            // Ruta del archivo Excel
            String filePath = "archivo.xlsx";
 
            // Crear un FileInputStream para leer el archivo
            FileInputStream fis = new FileInputStream(new File(filePath));
 
            // Crear un libro de trabajo (Workbook) a partir del FileInputStream
            Workbook workbook = new XSSFWorkbook(fis);
 
            // Obtener la primera hoja del libro
            Sheet sheet = workbook.getSheetAt(0);
 
            // Iterar sobre las filas de la hoja
            for (Row row : sheet) {
                // Iterar sobre las celdas de la fila
                for (Cell cell : row) {
                    // Dependiendo del tipo de contenido de la celda, puedes hacer cosas diferentes
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("Otro tipo de celda\t");
                    }
                }
                System.out.println(); // Salto de línea al final de cada fila
            }
 
            // Cerrar el FileInputStream y liberar recursos
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}