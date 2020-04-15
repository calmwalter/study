package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import test.WordDeilUtil;

public class WordDeilUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void wordFormat4DBNormal() {
		String target = "employeeInfo";
		String result = WordDeilUtil.wordFormat4DB(target);
		assertEquals(result, "employee_info");
	}

	@Test
	public void wordFormat4DBNull() {
		String target = null;
		String result = WordDeilUtil.wordFormat4DB(target);
		assertNull(result);
	}

	@Test
	public void wordFormat4DBEmpty() {
		String target = "";
		String result = WordDeilUtil.wordFormat4DB(target);
		assertEquals(result, "");
	}

	@Test
	public void wordFormat4DBBegin() {
		String target = "EmployeeInfo";
		String result = WordDeilUtil.wordFormat4DB(target);
		assertEquals(result, "employee_info");
	}

	@Test
	public void wordFormat4DBEnd() {
		String target = "employeeInfoA";
		String result = WordDeilUtil.wordFormat4DB(target);
		assertEquals(result, "employee_info_a");
	}

	@Test
	public void wordFormat4DBTogether() {
		String target = "employeeAInfo";
		String result = WordDeilUtil.wordFormat4DB(target);
		assertEquals(result, "employee_a_info");
	}
}