import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
    EdgeTable testObj;
    private int[] emptyArray;

    @Before
	public void setUp() throws Exception {
		testObj = new EdgeTable("1|testText");
	}

    @Test
	public void testGetNumFigure() {
		assertEquals("Number Figure was intialized to 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName() {
		assertEquals("Name was intialized as testText","testText",testObj.getName());
	}

    @Test
	public void testGetRelatedTablesArray() {
		assertArrayEquals("Related table array was intialized as empty",emptyArray,testObj.getRelatedTablesArray());
	}

    @Test
	public void testGetRelatedFieldsArray() {
		assertArrayEquals("Relative Fileds array was intialized as empty",emptyArray,testObj.getRelatedFieldsArray());
	}

    @Test
	public void testGetNativeFieldsArray() {
		assertArrayEquals("Native Fields array was intialized as empty",emptyArray,testObj.getNativeFieldsArray());
	}

    @Test
	public void testSetRelatedField() {
        testObj.addNativeField(3);
        testObj.makeArrays();
		testObj.setRelatedField(0,1);
        assertThat("Related field should countain 1 in index 0", testObj.getRelatedFieldsArray()[0], is(1));
	}

    @Test
	public void addRelatedTable_with_negative() throws Exception {
		testObj.addRelatedTable(-1);
        testObj.makeArrays();
		assertNotNull("Related Table array should countain -1",testObj.getRelatedTablesArray());
	}

    @Test
	public void addNativeField_with_negative() throws Exception {
		testObj.addNativeField(-3);
        testObj.makeArrays();
		assertNotNull("Native Filed array should countain -3",testObj.getNativeFieldsArray());
	}

    @Test
	public void testMoveFieldUp_withIndexZero() throws Exception {
        testObj.addNativeField(10);
        testObj.addNativeField(12);
        testObj.makeArrays();
		testObj.moveFieldUp(0);
        assertThat("Related field should countain 10 in index 0", testObj.getNativeFieldsArray()[0], is(10));
	}

	@Test
	public void testMoveFieldUp() throws Exception {
        testObj.addNativeField(10);
        testObj.addNativeField(12);
        testObj.makeArrays();
		testObj.moveFieldUp(1);
        assertThat("Related field should countain 10 in index 0", testObj.getNativeFieldsArray()[0], is(12));
	}

    @Test
	public void testMoveFieldDown() throws Exception {
        testObj.addNativeField(10);
        testObj.addNativeField(12);
        testObj.makeArrays();
		testObj.moveFieldDown(0);
        assertThat("Related field should countain 10 in index 1", testObj.getNativeFieldsArray()[1], is(10));
	}


    @Test
	public void testMakeArray() throws Exception {
        testObj.makeArrays();
		assertNotNull("Related Table array should be empty array not null",testObj.getRelatedTablesArray());
	}
    
}