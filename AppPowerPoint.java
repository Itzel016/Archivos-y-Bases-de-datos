import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppPowerPoint {
    public static void main(String[] args) {
        XMLSlideShow ppt = new XMLSlideShow();

        // Crear una nueva diapositiva
        XSLFSlide slide = ppt.createSlide();

        // Crear un cuadro de texto en la diapositiva
        XSLFTextShape text = slide.createTextBox();
        text.setText("Hola Mundo");
        text.setAnchor(new java.awt.Rectangle(100, 100, 400, 200));

        try {
            // Guardar la presentación en un archivo
            FileOutputStream fos = new FileOutputStream("achivo2.pptx");
            ppt.write(fos);
            fos.close();
            System.out.println("Archivo de PowerPoint creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
