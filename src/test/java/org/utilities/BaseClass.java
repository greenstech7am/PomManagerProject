package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void winMax() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		System.out.println(driver.getTitle());
	}

	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());

	}

	// sendKeys
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	// click
	public static void btnClick(WebElement ele) {
		// Webelement ref.click();

		ele.click();

	}

	// driver.close();
	public static void closeChrome() {
		driver.close();

	}

	public static void rightClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();

	}

	public static String getData(int rowNumber, int cellNumber) throws IOException {

		// 1. Mention the location of the excel sheet

		File f = new File("D:\\KannanTestingPractice\\12PMProjectClass13Dec\\testData\\studentData12pm.xlsx");

		// 2. Read the data from Excel

		FileInputStream fin = new FileInputStream(f);

		// 3. Type of workbook

		Workbook w = new XSSFWorkbook(fin);

		// 4. get the sheet

		Sheet s = w.getSheet("greens");

		// 5. get the row

		Row row = s.getRow(rowNumber);

		Cell cell = row.getCell(cellNumber);

		int cellType = cell.getCellType();

		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(cell)) {

				Date d = cell.getDateCellValue();

				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
				value = sim.format(d);
			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
			}

		}
		
		return value;

	}
	
	
	private void kannan() {
		System.out.println("Testing GIT Day1");
		System.out.println("Kannan Updating the code on dec11");
		System.out.println("Kannan 2nd Update");
		System.out.println("Ismail updating");
		System.out.println("Kannan 3rd update");
		


	}
	
	public static void screenshot(String name) throws IOException {
		
		//Takescreenshot
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		// it will take screenshot and it will store in temp location
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		// it will store in your desired location
		File des = new File("D:\\KannanTestingPractice\\12PMProjectClass13Dec\\target\\screenshots\\"+name+".jpg");
		
		// copy file from source (src) to desired location (des)
		FileUtils.copyFile(src, des);	

	}

}
