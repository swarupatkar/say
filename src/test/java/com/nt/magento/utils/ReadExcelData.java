package com.nt.magento.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] ReadDataCC(String workbook, String sheetname) {
		String[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + workbook);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");

			int totalrows = sh.getPhysicalNumberOfRows();// get rows 3
			int totalcolumns = sh.getRow(0).getPhysicalNumberOfCells(); // get columns

			data = new String[totalrows - 1][totalcolumns];
			for (int r = 1; r < totalrows; r++) {
				for (int c = 0; c < totalcolumns; c++) {
					data[r-1][c] = sh.getRow(r).getCell(c).getStringCellValue();

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;

	}

}
