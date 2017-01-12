package com.book.views;

import com.book.Person;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by iuliana.cosmina on 3/20/15.
 */
@Component("persons/list.xls")
public class PersonsExcelView extends AbstractExcelView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

            List<Person> accounts = (List<Person>) model.get("persons");

            HSSFCellStyle dateStyle = workbook.createCellStyle();
            dateStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("yyyy-MM-dd"));

            HSSFSheet sheet = workbook.createSheet();

            for (short i = 0; i < accounts.size(); i++) {
                Person person = accounts.get(i);
                HSSFRow row = sheet.createRow(i);
                addStringCell(row, 0, person.getFirstName());
                addStringCell(row, 1, person.getLastName());
                addDateCell(row, 2, person.getDateOfBirth(), dateStyle);
            }

    }

    private HSSFCell addStringCell(HSSFRow row, int index, String value) {
        HSSFCell cell = row.createCell( index);
        cell.setCellValue(new HSSFRichTextString(value));
        return cell;
    }

    private HSSFCell addDateCell(HSSFRow row, int index, Date date,
                                 HSSFCellStyle dateStyle) {
        HSSFCell cell = row.createCell(index);
        cell.setCellValue(date);
        cell.setCellStyle(dateStyle);
        return cell;
    }
}
