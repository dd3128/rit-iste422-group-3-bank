import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest {

    CreateDDLMySQL testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new CreateDDLMySQL();
    }

    @Test
    public void testGetCreateTable() {
        testObj.setTableName("testTable");
        testObj.addField("testField", "VARCHAR(255)", false);
        testObj.addField("testField2", "VARCHAR(255)", true);
        testObj.addField("testField3", "VARCHAR(255)", false);
        testObj.addField("testField4", "VARCHAR(255)", true);
        testObj.addField("testField5", "VARCHAR(255)", false);
        testObj.addField("testField6", "VARCHAR(255)", true);
        testObj.addField("testField7", "VARCHAR(255)", false);
        testObj.addField("testField8", "VARCHAR(255)", true);
        testObj.addField("testField9", "VARCHAR(255)", false);
        testObj.addField("testField10", "VARCHAR(255)", true);
        testObj.addField("testField11", "VARCHAR(255)", false);
        testObj.addField("testField12", "VARCHAR(255)", true);
        testObj.addField("testField13", "VARCHAR(255)", false);
        testObj.addField("testField14", "VARCHAR(255)", true);
        testObj.addField("testField15", "VARCHAR(255)", false);
    }
}
