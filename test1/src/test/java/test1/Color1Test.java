package test1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@SuppressWarnings("deprecation")
public class Color1Test {
	
	@Test
	public void testGetColor1() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(1);
		assertThat(t1,is("赤"));	
	}
	@Test
	public void testGetColor2() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(2);
		assertThat(t1,is("青"));	
	}
	@Test
	public void testGetColor3() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(3);
		assertThat(t1,is("1or2を入力して下さい"));	
	}
	
	@Test(expected = NullPointerException.class)
	public void testCheckNullError1() {
		Color1 c1 = new Color1();
		c1.checkNullError(null);
	}
	
	@Test
	public void testCheckNullError2() {
		try {
			Color1 c1 = new Color1();
			c1.checkNullError(null);
		} catch (NullPointerException e) {
			assertThat(e.getMessage(), equalTo("nullです"));
		}
	}
	
	@Rule
	public ExpectedException ee1 = ExpectedException.none();
	@Test
	public void testCheckNullError3() {
			ee1.expect(NullPointerException.class);
			ee1.expectMessage("nullです");
			Color1 c1 = new Color1();
			String t1 = c1.checkNullError(""); //エラーなし
	}
	
	@Rule
	public ExpectedException ee2 = ExpectedException.none();
	@Test
	public void testCheckNullError4() {
			ee1.expect(NullPointerException.class);
			ee1.expectMessage("nullです");
			Color1 c1 = new Color1();
			String t1 = c1.checkNullError(null); 
	}
}
