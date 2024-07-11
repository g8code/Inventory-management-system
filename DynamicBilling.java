import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class DynamicBilling {

    public static void generatePDF(String comp, String model, String ram, String pro, String cust, String mobno, String email, String issue, String charges, String savePath) {
        try {
            PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageContentStream cs = new PDPageContentStream(document, page);

            // Invoice Title
            cs.beginText();
            cs.setFont(PDType1Font.COURIER_BOLD, 26);  // Different font for the title
            cs.newLineAtOffset(220, 700);
            cs.showText("Invoice");
            cs.endText();

            // Company Name
            cs.beginText();
            cs.setFont(PDType1Font.HELVETICA_BOLD, 20); // Bold for emphasis
            cs.newLineAtOffset(180, 670);
            cs.showText("!! YASH COMPUTERS !!");
            cs.endText();

            // Customer Info Section
            cs.beginText();
            cs.setFont(PDType1Font.HELVETICA_BOLD, 16); // Headings in bold
            cs.newLineAtOffset(50, 620);
            cs.showText("Customer Information:");
            cs.endText();

            cs.beginText();
            cs.setFont(PDType1Font.HELVETICA, 14);
            cs.setLeading(22f);  // Increased line spacing
            cs.newLineAtOffset(60, 600);
            cs.showText("Customer Name: " + cust);
            cs.newLine();
            cs.showText("Phone Number: " + mobno);
            cs.newLine();
            cs.showText("Email: " + email);
            cs.endText();

            // Computer Info Section
            cs.beginText();
            cs.setFont(PDType1Font.HELVETICA_BOLD, 16);
            cs.newLineAtOffset(50, 540);
            cs.showText("Computer Information:");
            cs.endText();

            cs.beginText();
            cs.setFont(PDType1Font.HELVETICA, 14);
            cs.setLeading(22f);  // Consistent increased line spacing for details
            cs.newLineAtOffset(60, 520);
            cs.showText("Company: " + comp);
            cs.newLine();
            cs.showText("Model: " + model);
            cs.newLine();
            cs.showText("RAM: " + ram);
            cs.newLine();
            cs.showText("Processor: " + pro);
            cs.newLine();
            cs.showText("Issue: " + issue);
            cs.newLine();
            cs.showText("Charges: " + charges);
            cs.endText();

            // Closing content stream and saving document
            cs.close();
            document.save(savePath);
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
