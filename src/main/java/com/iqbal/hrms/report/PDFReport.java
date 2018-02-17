package com.iqbal.hrms.report;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;

import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.itextpdf.text.Font;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itextpdf.text.pdf.BaseFont;
import com.iqbal.hrms.controller.ReportController;
import com.iqbal.hrms.Model.ReportData;
import com.iqbal.hrms.Model.ReportRequestVO;
import com.itextpdf.awt.geom.misc.RenderingHints;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.Image;

public class PDFReport {

	private static final Logger logger = LoggerFactory
			.getLogger(PDFReport.class);

	public String createPDF(ReportRequestVO reportRequestVO,
			List<ReportData> dataList) {

		String pdfLocation = "PDFReport.pdf";
		Document document = new Document();
		document.setPageSize(PageSize.A4);
		document.setMargins(40, 40, 15, 15);
		document.setMarginMirroring(true);

		try {
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream(pdfLocation));

			writer.setBoxSize("art", new Rectangle(1, 54, 559, 650));

			HeaderFooter headerFooter = new HeaderFooter();

			writer.setPageEvent(headerFooter);

			document.open();

			document.add(createTable(dataList, pdfLocation));

			document.close();

			writer.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return pdfLocation;

	}

	private PdfPTable createTable(List<ReportData> reports, String pdfImageDir)
			throws DocumentException, BadElementException,
			MalformedURLException, IOException {
		PdfPTable table = new PdfPTable(3);

		logger.info("creating pdf .. core data : " + reports);

		table.addCell(createCell("ব্যাটেলিয়ানের নাম", 12, Element.ALIGN_LEFT,
				PdfPCell.BOTTOM, null));
		table.addCell(createCell("আইন", 12, Element.ALIGN_LEFT,
				PdfPCell.BOTTOM, null));
		table.addCell(createCell("মামলার সংখ্যা", 12, Element.ALIGN_LEFT,
				PdfPCell.BOTTOM, null));

		for (ReportData report : reports) {

			table.setSpacingAfter(2);
			table.setWidths(new int[] { 100, 100, 100 });
			table.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.setWidthPercentage(100f);
			table.getDefaultCell().setFixedHeight(8);
			table.addCell(createCell(report.getBattalionName(), 12,
					Element.ALIGN_LEFT, PdfPCell.BOTTOM, null));
			table.addCell(createCell(report.getLawName(), 12,
					Element.ALIGN_LEFT, PdfPCell.BOTTOM, null));
			table.addCell(createCell(Integer.toString(report.getTotalCount()),
					12, Element.ALIGN_LEFT, PdfPCell.BOTTOM, null));

		}
		return table;
	}

	private PdfPCell createCell(String contents, int fontSize, int element,
			int border, BaseColor color) throws DocumentException, IOException {

		PdfPCell cell = new PdfPCell();
		cell.setBorderColor(BaseColor.LIGHT_GRAY);
		cell.addElement(createParagraph(contents, fontSize, Element.ALIGN_LEFT));
		cell.setBorder(border);
		cell.setPadding(5);
		if (color != null) {
			cell.setBackgroundColor(color);
		}
		return cell;
	}

	private PdfPCell createBoldCell(String contents, int fontSize, int element,
			int border, BaseColor color, boolean isUnderlined)
			throws DocumentException {

		PdfPCell cell = new PdfPCell();
		cell.setBorderColor(BaseColor.LIGHT_GRAY);
		if (isUnderlined) {
			cell.addElement(createBoldUnderlinedParagraph(contents, fontSize,
					element));
		} else {
			cell.setFixedHeight(23f);
			cell.addElement(createBoldParagraph(contents, fontSize, element));
		}

		cell.setBorder(border);
		cell.setBackgroundColor(color);
		return cell;
	}

	/*
	 * private Paragraph createParagraph(String contents, int fontSize, int
	 * element) throws DocumentException, IOException { //String encoding =
	 * "Identity-H";
	 * 
	 * Image img=Image.getInstance(imgb); BaseFont bf =
	 * BaseFont.createFont("resource/VRINDAB.TTF", BaseFont.IDENTITY_H,
	 * BaseFont.EMBEDDED); //Font fontNormal =
	 * FontFactory.getFont(("resource/kalpurush.ttf"),
	 * encoding,BaseFont.EMBEDDED, 12, Font.NORMAL); Paragraph p = new
	 * Paragraph(contents, new Font(bf, 12)); p.setAlignment(element); return p;
	 * }
	 */

	// now
	private Paragraph createParagraph(String contents, int fontSize, int element)
			throws DocumentException, IOException {
		// String encoding = "Identity-H";
		BaseFont bf = BaseFont.createFont("resource/VRINDAB.TTF",
				BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		// Font fontNormal = FontFactory.getFont(("resource/kalpurush.ttf"),
		// encoding,BaseFont.EMBEDDED, 12, Font.NORMAL);
		Paragraph p = new Paragraph(contents, new Font(bf, 12));
		p.setAlignment(element);
		return p;
	}

	/*
	 * private Paragraph createParagraph(String contents, int fontSize, int
	 * element) throws DocumentException { String encoding = "Identity-H";
	 * //String encoding = "UTF-8"; Font fontNormal =
	 * FontFactory.getFont(("resource/VRINDAB.TTF"), encoding,BaseFont.EMBEDDED,
	 * 12, Font.NORMAL); Paragraph p = new Paragraph(contents, fontNormal);
	 * p.setAlignment(element); return p; }
	 */

	private Paragraph createBoldParagraph(String contents, int fontSize,
			int element) throws DocumentException {
		Paragraph p = new Paragraph(contents, new Font(FontFamily.HELVETICA,
				fontSize, Font.BOLD));
		p.setAlignment(element);
		return p;
	}

	private Paragraph createBoldUnderlinedParagraph(String contents,
			int fontSize, int element) throws DocumentException {
		Paragraph p = new Paragraph(contents, new Font(FontFamily.HELVETICA,
				fontSize, Font.BOLD | Font.UNDERLINE));
		p.setAlignment(element);
		return p;
	}

}
