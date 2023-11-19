import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppWord {
    public static void main(String[] args) {
        XWPFDocument document = new XWPFDocument();

        // Crear un párrafo
        XWPFParagraph paragraph = document.createParagraph();

        // Crear un run (fragmento de texto) en el párrafo
        XWPFRun run = paragraph.createRun();
        run.setText("Hola Mundo");

        try {
            // Guardar el documento en un archivo
            FileOutputStream fos = new FileOutputStream("archivo1.docx");
            document.write(fos);
            fos.close();
            System.out.println("Archivo de Word creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
