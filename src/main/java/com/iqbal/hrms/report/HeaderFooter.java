package com.iqbal.hrms.report;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Timestamp;

public class HeaderFooter extends PdfPageEventHelper{

	 public void onStartPage(PdfWriter writer,Document document) {
	    	Rectangle rect = writer.getBoxSize("art");
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Top Left"), rect.getLeft(), rect.getTop(), 0);
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Top Right"), rect.getRight(), rect.getTop(), 0);
	    }
	    public void onEndPage(PdfWriter writer,Document document) {
	    	Rectangle rect = writer.getBoxSize("art");
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Bottom Left"), rect.getLeft(), rect.getBottom(), 0);
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Bottom Right"), rect.getRight(), rect.getBottom(), 0);
	    }
}
