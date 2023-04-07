import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeConvertFileParserTest {
    EdgeConvertFileParser testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EdgeConvertFileParser(null);
    }

    @Test
    public void testGetEdgeTables() {
        testObj.parseFile("testFile.txt");
        assertNotNull("EdgeTables should not be null",testObj.getEdgeTables());
    }
    
    @Test
    public void testGetEdgeFields() {
        testObj.parseFile("testFile.txt");
        assertNotNull("EdgeFields should not be null",testObj.getEdgeFields());
    }

    @Test
    public void testGetEdgeRelationships() {
        testObj.parseFile("testFile.txt");
        assertNotNull("EdgeRelationships should not be null",testObj.getEdgeRelationships());
    }
}
