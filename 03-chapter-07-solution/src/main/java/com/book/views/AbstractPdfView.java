package com.book.views;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/**
 * Created by iuliana.cosmina on 3/21/15.
 * Description: This class should be extended when creating PDF view instead of
 * org.springframework.web.servlet.view.document.AbstractPdfView asn the spring class works with
 * old version of iText “Bruno Lowagie’s iText“.
 * this implementation works with http://http://itextpdf.com/
 */
public abstract class AbstractPdfView extends AbstractView {
    public AbstractPdfView() {
        setContentType("application/pdf");
    }

    @Override
    protected boolean generatesDownloadContent() {
        return true;
    }

    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
        HttpServletResponse response) throws Exception {
        ByteArrayOutputStream baos = createTemporaryOutputStream();
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, baos);
        writer.setViewerPreferences(PdfWriter.ALLOW_PRINTING | PdfWriter.PageLayoutSinglePage);
        // Build PDF document.
        writer.setInitialLeading(2);
        document.open();
        buildPdfDocument(model, document, writer, request, response);
        document.close();
        // Flush to HTTP response.
        writeToResponse(response, baos);
    }


    protected abstract void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
                                             HttpServletRequest request, HttpServletResponse response) throws Exception;
}