import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class VatTest {

    Vat VatObject1;
    Vat VatObject2;

    @Before
    public void before() {
        VatObject1 = new Vat();
        VatObject1.vat_percentage = "20%";
    }

    @Test
    public void vatObject2HasVatPercentage() {
        assertEquals("20%", VatObject2.vat_percentage);
    }
}
