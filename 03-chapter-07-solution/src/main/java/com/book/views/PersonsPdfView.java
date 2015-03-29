package com.book.views;

import com.book.Person;
import com.book.util.DateFormatter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by iuliana.cosmina on 3/21/15.
 */
@Component("persons/list.pdf")
public class PersonsPdfView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        List<Person> persons = (List<Person>) model.get("persons");

        document.add(new Chunk("Persons: "));
        // Create table with 3 columns.
        PdfPTable table = new PdfPTable(3);
        table.addCell(new Paragraph("First Name"));
        table.addCell(new Paragraph("Last Number"));
        table.addCell(new Paragraph("Date Of Birth"));
        for (Person person : persons) {
            table.addCell(person.getFirstName());
            table.addCell(person.getLastName());
            table.addCell(new DateFormatter().print(person.getDateOfBirth(), null));
            document.add(Chunk.NEWLINE);
        }
        document.add(table);
        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);
    }
}