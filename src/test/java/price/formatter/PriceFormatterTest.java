package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

PriceFormatter form = new PriceFormatter();

    @Test 
    void testPriceFormatterThousandSeparator() {
        assertEquals("1 000 €", form.formatPrice(1000));
    }

    @Test 
    void testPriceFormatterCommaSeparator() {
        assertEquals("1 000,34 €", form.formatPrice(1000.34));
    }

    @Test 
    void testPriceFormatterDecimalRounding(){
        assertEquals("1 234,57 €", form.formatPrice(1234.5677));
    }

    @Test 
    void testDecimAsZero(){
        assertEquals("1 234 €", form.formatPrice(1234.0));
    }
}
