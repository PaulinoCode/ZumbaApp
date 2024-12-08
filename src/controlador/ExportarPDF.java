package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class ExportarPDF {

    public static void exportarTablasPDF(JTable tablaVentas, JTable tablaCompras, String rutaDestino, String costos, String ingresos, String ganancias, String fechaInicio, String fechaFin) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(rutaDestino));
            document.open();

            // Estilos
            Font tituloFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24, BaseColor.BLACK);
            Font subtituloFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.DARK_GRAY);
            Font contenidoFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
            Font smallBoldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.DARK_GRAY);
            Font smallItalicFont = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 12, BaseColor.DARK_GRAY);

            // Título principal
            Paragraph titulo = new Paragraph("Estados de Resultados de Micelanea Zumba", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            // Período
            Paragraph periodo = new Paragraph("Período: " + fechaInicio + " a " + fechaFin, smallItalicFont);
            periodo.setAlignment(Element.ALIGN_CENTER);
            document.add(periodo);

            document.add(new Paragraph(" ", contenidoFont)); // Espacio en blanco

            // Tabla de resultados
            PdfPTable pdfTableReporte = new PdfPTable(2);
            pdfTableReporte.setWidthPercentage(100);
            pdfTableReporte.setSpacingBefore(10f);

            PdfPCell cell;

            cell = new PdfPCell(new Phrase("Ingresos:", smallBoldFont));
            cell.setBorder(PdfPCell.NO_BORDER);
            pdfTableReporte.addCell(cell);

            cell = new PdfPCell(new Phrase(costos, contenidoFont));
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell.setBorder(PdfPCell.NO_BORDER);
            pdfTableReporte.addCell(cell);

            cell = new PdfPCell(new Phrase("Costos:", smallBoldFont));
            cell.setBorder(PdfPCell.NO_BORDER);
            pdfTableReporte.addCell(cell);

            cell = new PdfPCell(new Phrase(ingresos, contenidoFont));
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell.setBorder(PdfPCell.NO_BORDER);
            pdfTableReporte.addCell(cell);

            cell = new PdfPCell(new Phrase("Ganancias:", smallBoldFont));
            cell.setBorder(PdfPCell.NO_BORDER);
            pdfTableReporte.addCell(cell);

            cell = new PdfPCell(new Phrase(ganancias, contenidoFont));
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell.setBorder(PdfPCell.NO_BORDER);
            pdfTableReporte.addCell(cell);

            document.add(pdfTableReporte);

            document.add(new Paragraph(" ", contenidoFont)); // Espacio en blanco

            // Subtítulo y tabla de Ventas
            Paragraph subtituloVentas = new Paragraph("Ingresos Detallados", subtituloFont);
            subtituloVentas.setAlignment(Element.ALIGN_LEFT);
            document.add(subtituloVentas);

            document.add(new Paragraph(" ", contenidoFont)); // Espacio en blanco

            PdfPTable pdfTableVentas = crearTablaPDF(tablaVentas);
            document.add(pdfTableVentas);

            document.add(new Paragraph(" ", contenidoFont)); // Espacio en blanco

            // Subtítulo y tabla de Compras
            Paragraph subtituloCompras = new Paragraph("Costos Detallados", subtituloFont);
            subtituloCompras.setAlignment(Element.ALIGN_LEFT);
            document.add(subtituloCompras);

            document.add(new Paragraph(" ", contenidoFont)); // Espacio en blanco

            PdfPTable pdfTableCompras = crearTablaPDF(tablaCompras);
            document.add(pdfTableCompras);

            document.close();
            JOptionPane.showMessageDialog(null, "PDF creado con Exito en " + rutaDestino);
            System.out.println("PDF creado con Exito en " + rutaDestino);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static PdfPTable crearTablaPDF(JTable tabla) {
        PdfPTable pdfTable = new PdfPTable(tabla.getColumnCount());
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();

        // Estilo para las celdas de la tabla
        Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.WHITE);
        Font cellFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);

        // Agregar encabezados de la tabla con estilo
        for (int i = 0; i < modeloTabla.getColumnCount(); i++) {
            PdfPCell cell = new PdfPCell(new Paragraph(modeloTabla.getColumnName(i), headerFont));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setPadding(5);
            pdfTable.addCell(cell);
        }

        // Agregar filas de datos con bordes y rellenos
        for (int rows = 0; rows < modeloTabla.getRowCount(); rows++) {
            for (int cols = 0; cols < modeloTabla.getColumnCount(); cols++) {
                PdfPCell cell = new PdfPCell(new Paragraph(modeloTabla.getValueAt(rows, cols).toString(), cellFont));
                cell.setBorderColor(BaseColor.GRAY);
                cell.setPadding(5);
                pdfTable.addCell(cell);
            }
        }

        pdfTable.setWidthPercentage(100); // Ancho de tabla al 100%
        pdfTable.setSpacingBefore(10f); // Espacio antes de la tabla
        pdfTable.setSpacingAfter(10f);  // Espacio después de la tabla
        return pdfTable;
    }
}
