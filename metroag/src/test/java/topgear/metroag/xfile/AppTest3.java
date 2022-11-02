package topgear.metroag.xfile;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest3 {
	
	private static App app;
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app=new App();
	}

	@Test
	public void testGetFileList() {
		assertNotNull("File read successfully", app.getFileList());
	}

	@Test
	public void testApp() {
		App app=new App();
		assertNotNull("File read successfully", app.getFileList());
	}

	@Test
	public void testDisplayFiles() {
		System.out.println("***LIST OF FILES***");
		app.displayFiles();
		assertTrue(true);
	}

	@Test
	public void testSortByPriority() {
		app.sortByPriority();
		System.out.println("***FILES SORTED BY PRIORITY***");
		app.displayFiles();
		assertTrue(true);
	}

	@Test
	public void testListAllFilesIncludesCurrentTimeStamp() {
		System.out.println("***LIST OF ALL FILES INCLUDES CURRENT TIME***");
		app.listAllFilesIncludesCurrentTimeStamp();
	}

	@Test
	public void testCheckTransfer() {
		System.out.println("***VALIDATE CHECK TRANSFER***");
		app.checkTransfer(4, "13:00", "15:00");
	}

}
