package SampleFrameworkpackage;

//import java.io.FileInputStream;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.IAnnotationTransformer;
//import org.testng.annotations.ITestAnnotation;
//import testpackagez.TestCaseClass;
//
//public class mainclass extends TestCaseClass implements IAnnotationTransformer {
//
//	public static XSSFWorkbook wb;
//	public static XSSFSheet sheet;
//
//	public String ExecuteFlag;
//	public String TestCaseToByPass;
//
//	public String ITestannotationMethod;
//	public String AllMethods[];
//	public ArrayList<String> ar;
//
//	public void transform(ITestAnnotation annotation, Class testClass,
//			Constructor testConstructor, Method testMethod) {
//
//		ArrayList<String> ar = new ArrayList<String>();
//		ar.add(testMethod.getName());
//
//		try {
//			// System.out.println("Inside MAIN Try Block");
//			FileInputStream fis = new FileInputStream(
//					"C://Users//Suresh//Desktop//Frame//TestFramework//src//test//java//ExcelUtilityz//TestCases.xlsx");
//
//			//
//
//			wb = new XSSFWorkbook(fis);
//			sheet = wb.getSheet("Sheet1");
//
//			int length = sheet.getLastRowNum();
//			for (int row = 1; row <= length; row++) {
//				ExecuteFlag = sheet.getRow(row).getCell(4).getStringCellValue();
//				// System.out.println("Test Case to Exute=" +ExecuteFlag);
//				if (ExecuteFlag.equals("No")) {
//					String[] BypassedMethods = new String[length];
//					for (int i = 0; i < BypassedMethods.length; i++) {
//						BypassedMethods[i] = sheet.getRow(row).getCell(2)
//								.getStringCellValue();
//
//						for (String j : ar) {
//							if (j.equals(BypassedMethods[i])) {
//								annotation.setEnabled(false);
//							}
//
//						}
//
//					}
//				}
//
//			} // for close brace
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//	}
//
//}
