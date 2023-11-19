import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeerWord{
    public static void main(String[] args) {
        XWPFDocument doc = new XWPFDocument();

        // Crear un párrafo
        XWPFParagraph paragraph = doc.createParagraph();

        // Crear un objeto XWPFRun para agregar texto al párrafo
        XWPFRun run = paragraph.createRun();
        run.setText("Este es un documento de Word creado con Apache POI.");
        run.setFontSize(14);

        try {
            // Guardar el documento en un archivo
            FileOutputStream out = new FileOutputStream("archivo1.docx");
            doc.write(out);
            out.close();
            System.out.println("Documento de Word creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}