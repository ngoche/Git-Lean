package jav.study.to.delete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelTest {
	public static void main(String[] args) throws IOException {
		String inputPath = "E:\\Download\\report2\\feck\\DD3D4620.xlsx";
		File file = new File(inputPath);
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("henv");
			Iterator<Row> rowIt = sheet.iterator();
			
			InputStream ipstream = new FileInputStream(inputPath);
			Date dateCount = new Date();
			int minute1 = dateCount.getSeconds();
			
			List<List<String>> data = getExcelDataEx(ipstream, 7, true);
			dateCount = new Date();
			int minute2 = dateCount.getSeconds();
			System.out.println(minute2);
			System.out.println("total time = " + minute2 + " " + minute1);
			
			while (rowIt.hasNext()) {
				Row row = rowIt.next();
				Cell cell = row.getCell(1);
//				String cellDateValue = cell.getStringCellValue();
//				
//				System.out.println(cellDateValue);
//				
//				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//				Date date2 = sdf.parse("3/02/2012");
//				System.out.println("Date 2: "+ date2);
//				
//				double db = DateUtil.getExcelDate(date2);
//				System.out.println("DateUtil.getJavaDate(db): "+DateUtil.getJavaDate(db));
//				
//
//				DataFormatter formatter = new DataFormatter();
//				String val = formatter.formatCellValue(sheet.getRow(1).getCell(2));
//				System.out.println("val:" +val);
//				
//				
//				Cell cell2 = row.getCell(2);
//				System.out.println("cell2 type" + cell2.getCellType());
//					Date s = cell2.getDateCellValue();
//					System.out.println(s);
//					
//				System.out.println("static test : " + toDateString(cell2.getDateCellValue(), "DATA_FORMAT_MM_DD_YYYY"));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//			catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	public static String toDateString(Date date, String format) {
		String dateString = "";
		if (date == null)
			return dateString;
		Object[] params = new Object[] { date };

		try {
			dateString = MessageFormat
					.format("{0,date," + format + "}", params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateString;
	}
	public static List<List<String>> getExcelDataEx(InputStream is, Integer limitColumn, boolean hasHeader) {
		List<List<String>> resData = new ArrayList<>();
		try {
			Workbook myWorkBook = null;
			if (!is.markSupported()) {
				is = new PushbackInputStream(is, 8);
			}
			if (POIFSFileSystem.hasPOIFSHeader(is)) {
				myWorkBook = new HSSFWorkbook(is);
			} else if (POIXMLDocument.hasOOXMLHeader(is)) {
				myWorkBook = new XSSFWorkbook(OPCPackage.open(is));
			}
			if (myWorkBook != null) {
				Sheet mySheet = myWorkBook.getSheetAt(0);
				if (mySheet != null) {
					Iterator<?> rowIter = mySheet.rowIterator();
					int rownum = -1;
					while (rowIter.hasNext()) {
						Row myRow = (Row) rowIter.next();
						Iterator<Cell> cellIter = myRow.cellIterator();
						List<String> lstRow = new ArrayList<>();
						int currentrow = myRow.getRowNum();
						if ( currentrow != rownum) {
							if (rownum != -1) {
								List<String> lstColum = new ArrayList<>();
								for (int i = 0; i < limitColumn; i++) {
									lstColum.add(""); //$NON-NLS-1$
								}
								int rowNum = myRow.getRowNum() - rownum;
								for (int j = 0; j < rowNum; j++) {
									resData.add(lstColum);
								}
							}
						}
						rownum = myRow.getRowNum() + 1;
						Integer count = 0;
						//boolean hasEmptyRow = true;
						int current, next = 1;
						while (cellIter.hasNext() && ((limitColumn == null) || ((limitColumn != null) && (count < limitColumn)))) {
							Cell myCell = cellIter.next();
							current = myCell.getColumnIndex();
							String value;
							switch (myCell.getCellType()) {
							case Cell.CELL_TYPE_BLANK:
								value = ""; //$NON-NLS-1$
								break;
							case Cell.CELL_TYPE_NUMERIC:
								if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(myCell)) {
									if ((myCell.getCellStyle() != null) && "HSSF_DATE_FORMAT_M_D_YY".equals(myCell.getCellStyle().getDataFormatString())) {
										value = ExcelTest.toDateString(myCell.getDateCellValue(), "DATA_FORMAT_MM_DD_YYYY");
									} else {
										value = ExcelTest.toDateString(myCell.getDateCellValue(), "DATE_FORMAT_DDMMYYYY");
									}
								} else if (BigDecimal.valueOf(Double.valueOf(myCell.getNumericCellValue())).compareTo(BigDecimal.valueOf(Double.valueOf(myCell.getNumericCellValue()).longValue())) == 0) {
									value = String.valueOf(BigDecimal.valueOf(Double.valueOf(myCell.getNumericCellValue())).longValue());
								} else {
									value = String.valueOf(myCell.getNumericCellValue());
								}
								break;
							case Cell.CELL_TYPE_STRING:
								value = myCell.getStringCellValue();
								break;
							default:
								value = myCell.toString();
								break;
							}
							// add null value
							if (current >= next) {
								int loop = current - next;
								for (int k = 0; k < (loop + 1); k++) {
									lstRow.add(""); //$NON-NLS-1$
									next = next + 1;
									count++;
								}
							}
							// add current cell
							lstRow.add(value.trim());
							next = next + 1;
							count++;
							if (isNullOrEmpty(value.trim())) {
								//								hasEmptyRow = false;
							}

							//
							if ((cellIter.hasNext() == false) && ((limitColumn == null) || ((limitColumn != null) && (count < limitColumn)))) {
								for (int i = count; i < limitColumn; ++i) {
									lstRow.add(""); //$NON-NLS-1$
								}
							}
						}
						//                        if(!hasEmptyRow){
						resData.add(lstRow);
						//                        }
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//remove header row
		if ((resData.size() > 0) && !hasHeader) {
			resData.remove(0);
		}
		return resData;
	}

	public static boolean isNullOrEmpty(final String s) {
		return ((s == null) || (s.trim().length() == 0));
	}
}
