import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerPowerPoint {
    public static void main(String[] args) {
        try {
            // Ruta del archivo PowerPoint
            String filePath = "archivo2.pptx";

            FileInputStream fis = new FileInputStream(new File(filePath));

            // Crear una presentación (XMLSlideShow) a partir del FileInputStream
            XMLSlideShow ppt = new XMLSlideShow(fis);

            // Recorrer todas las diapositivas de la presentación
            for (XSLFSlide slide : ppt.getSlides()) {
                System.out.println("Diapositiva:");

                // Recorrer todas las formas de texto en la diapositiva
                for (XSLFTextShape textShape : slide.getPlaceholders()) {
                    System.out.println(textShape.getText());
                }

                System.out.println();
            }

            // Cerrar el FileInputStream y liberar recursos
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
