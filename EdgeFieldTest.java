import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
	EdgeField testObj;

	@Before
	public void setUp() throws Exception {
		testObj = new EdgeField("1|testname");
	}

	@Test
	public void testGetNumFigure() {
		assertEquals("numFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName() {
		assertEquals("name was intialized to testname","testname",testObj.getName());
	}

	@Test
	public void testGetTableID() {
		assertEquals("tableID was intialized to 0 so it should be 0",0,testObj.getTableID());
	}

	@Test
	public void testSetTableID() {
		testObj.setTableID(1);
		assertEquals("setTableID should be what you set it to",1,testObj.getTableID());
	}

	@Test
	public void testGetTableBound() {
		assertEquals("tableBound was intialized to 0 so it should be 0",0,testObj.getTableBound());
	}

	@Test
	public void testSetTableBound() {
		testObj.setTableBound(1);
		assertEquals("setTableBound should be what you set it to",1,testObj.getTableBound());
	}


	@Test
	public void testGetFieldBound() {
		assertEquals("FieldBound was intialized to 0 so it should be 0",0,testObj.getFieldBound());
	}

	@Test
	public void testSetFieldBound() {
		testObj.setFieldBound(1);
		assertEquals("setFieldBound should be what you set it to",1,testObj.getFieldBound());
	}

	@Test
	public void testGetDisallowNull() {
		assertEquals("getDisallowNull was intialized to false so it should be false",false,testObj.getDisallowNull());
	}

	@Test
	public void testSetDisallowNull() {
		testObj.setDisallowNull(true);
		assertEquals("setDisallowNull should be what you set it to",true,testObj.getDisallowNull());
	}
	
	@Test
	public void testGetIsPrimaryKey() {
		assertEquals("getIsPrimaryKey was intialized to false so it should be false",false,testObj.getIsPrimaryKey());
	}

	@Test
	public void testSetIsPrimaryKey() {
		testObj.setIsPrimaryKey(true);
		assertEquals("setIsPrimaryKey should be what you set it to",true,testObj.getIsPrimaryKey());
	}

	@Test
	public void testGetDefaultValue() {
		assertEquals("getDefaultValue was intialized to be empty so it should be empty" , "", testObj.getDefaultValue());
	}

	@Test
	public void testSetDefaultValue() {
		testObj.setDefaultValue("testDefaultValue");
		assertEquals("setDefaultValue should be what you set it to","testDefaultValue",testObj.getDefaultValue());
	}

	@Test
	public void testGetVarcharValue() {
		assertEquals("getVarcharValue intialized to be 1 so it should be 1" , 1, testObj.getVarcharValue());
	}

	@Test
	public void testSetVarcharValue() {
		testObj.setVarcharValue(3);
		assertEquals("setVarcharValue should be what you set it to",3,testObj.getVarcharValue());
	}

	@Test
	public void testGetDataType() {
		assertEquals("getDataType intialized to be 0 so it should be should be 0" , 0, testObj.getDataType());
	}

	@Test
	public void testSetDataType() {
		testObj.setDataType(3);
		assertEquals("setDataType should be what you set it to",3,testObj.getDataType());
	}

	@Test
	public void testSetDataTypeNegative() {
		testObj.setDataType(-1);
		assertEquals("setDataType should not be nagetive, so it should be what we intialized, which is 0",0,testObj.getDataType());
	}

}


