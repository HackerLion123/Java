
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PdfReadExample {

    private static final String FILE_NAME = "/root/Documents/mongodb_tutorial.pdf";

    public static void main(String[] args) {

        PdfReader reader;

        try {

            reader = new PdfReader("/root/Documents/mongodb_tutorial.pdf");

            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 3);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
