import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void printerHas100Sheets() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void printerHas100Toner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void printSuccess() {
        assertEquals("Print Successful", printer.print(5, 5));
    }

    @Test
    public void printUnsuccessful() {
        assertEquals("Print Unsuccessful", printer.print(10, 13));
    }

    @Test
    public void printReducesSheetsBy25() {
        printer.print(5, 5);
        assertEquals(75, printer.getSheets());
    }

    @Test
    public void printReducesTonerBy25() {
        printer.print(5, 5);
        assertEquals(75, printer.getToner());
    }
}
