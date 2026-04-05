package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disha {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/Disha.xlsx");
				XSSFWorkbook work = new XSSFWorkbook(fis);
				XSSFSheet sheet = work.getSheet("Sheet1");
				for(int i=1;i<=4;i++) {
					XSSFRow row = sheet.getRow(i);
					XSSFCell teststep = row.getCell(3);
					String [] teststeps = teststep.toString().split("[0-9]");
					WebDriver w=null;
					RepoOfDisha r=null;
					for(String ts : teststeps) {
						if ("Launch a chrome browser".equalsIgnoreCase(ts.trim())) {
							w= new ChromeDriver();
							w.manage().window().maximize();
							r= new RepoOfDisha(w);		
						}
					else if ("navigate to Url".equalsIgnoreCase(ts.trim())) {
						
						w.get("http://103.251.94.38:8080/MIDMS/");
					}else if ("Enter Username".equalsIgnoreCase(ts.trim())) {
						r.username();
					}else if ("Enter password".equalsIgnoreCase(ts.trim())) {
						r.password();
						
					}else if ("Enter Captcha".equalsIgnoreCase(ts.trim())) {
						Thread.sleep(15000);
						
					}else if ("Click on Keep me sign in check box".equalsIgnoreCase(ts.trim())) {
						r.keepmesignin();
						
					}else if ("Click on Login button".equalsIgnoreCase(ts.trim())) {
						r.signin();
					}else if ("Click on menu".equalsIgnoreCase(ts.trim())) {
						r.menu();
						Thread.sleep(2000);
					}else if ("Click on registration".equalsIgnoreCase(ts.trim())) {
						r.registration();
						Thread.sleep(2000);
					}else if ("select an prefix".equalsIgnoreCase(ts.trim())) {
						r.prefix();
						Thread.sleep(2000);
						
					}else if ("Enter first name".equalsIgnoreCase(ts.trim())) {
						r.firstname();
						Thread.sleep(2000);
					}else if ("Enter Last name".equalsIgnoreCase(ts.trim())) {
						r.lastname();
						Thread.sleep(2000);
					}else if ("select bto C".equalsIgnoreCase(ts.trim())) {
						r.btoc();
						Thread.sleep(2000);
						
					}else if ("close browser".equalsIgnoreCase(ts.trim())) {
						Thread.sleep(2000);
						
					}
						
					}
						
					
				}
					
		
	}

}
