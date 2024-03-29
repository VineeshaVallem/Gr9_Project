package Group9.Maven_9;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {
	@Test
    public void addTwoThree() throws Exception {
        final int result = new Calculator().add(2, 3);
        assertThat(result, is(5));
    }
    
    @Test
    public void subThreeThree() throws Exception {
        final int result = new Calculator().subtract(3, 3);
        assertThat(result, is(0));
    }
    
    @Test
    public void mulThreeThree() throws Exception {
        final int result = new Calculator().multiply(3, 3);
        assertThat(result, is(9));
    }
    
    @Test
    public void divThreeMinusThree() throws Exception {
        final Long result = (long) new Calculator().divide(3, -3);
        assertThat(result, is(-1L));
    }
}

