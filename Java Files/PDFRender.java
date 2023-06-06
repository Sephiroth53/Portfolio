import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.pdmodel.PDPageTree;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PDFRender {
    public static void renderPDF(String filePath) throws IOException {
        // Load the PDF document
        PDDocument document = PDDocument.load(new File(filePath));
        PDFRenderer pdfRenderer = new PDFRenderer(document); // Instantiate PDFRenderer

        // Create a JFrame to display the PDF
        JFrame pdfFrame = new JFrame("CV");
        pdfFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pdfFrame.setSize(800, 600);

        pdfFrame.setLayout(new BorderLayout());

        JPanel pdfPanel = new JPanel();
        pdfPanel.setLayout(new BorderLayout());
        pdfFrame.add(pdfPanel);

        // Get the pages of the PDF document
        PDPageTree pages = document.getPages();
        for (int i = 0; i < pages.getCount(); i++) {
            // Render each page as an image
            BufferedImage image = pdfRenderer.renderImageWithDPI(i, 1000); // Set DPI to 72 for default scaling

            // Scale and display the image in a JLabel
            ImageIcon scaledIcon = new ImageIcon(image.getScaledInstance(600, -1, Image.SCALE_SMOOTH)); // Adjust the width as needed
            JLabel label = new JLabel(scaledIcon);
            pdfPanel.add(label, BorderLayout.CENTER);
        }

        // Close the document
        document.close();

        // Make the JFrame visible
        pdfFrame.setVisible(true);
        pdfFrame.pack();
    }
}
