import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
 
public class App {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook(); // Crear un nuevo libro de trabajo
        // Crear una hoja en el libro de trabajo
        Sheet sheet = workbook.createSheet("Hoja1");
        // Crear una fila en la hoja
        Row row = sheet.createRow(0);
        // Crear una celda en la fila
        Cell cell = row.createCell(0);
        cell.setCellValue("Hola Mundo"); // Establecer el valor de la celda
        try {
            // Guardar el libro de trabajo en un archivo
            FileOutputStream fos = new FileOutputStream("archivo.xlsx");
            workbook.write(fos);
            fos.close();
            System.out.println("Archivo Excel creado correctamente.");
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}