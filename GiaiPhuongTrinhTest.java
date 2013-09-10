import static org.junit.Assert.*;

import org.junit.Test;


public class GiaiPhuongTrinhTest {

	@Test
	public void testPhuongTrinhBac1_1() {
		GiaiPhuongTrinh pt = new GiaiPhuongTrinh();
		int result = pt. PhuongTrinhBac1(1, 1);
		assertEquals(result, -1);
	}
	
	@Test
	public void testPhuongTrinhBac1_2() {
		GiaiPhuongTrinh pt = new GiaiPhuongTrinh();
		int result = pt. PhuongTrinhBac1(10, -90);
		assertEquals(result, 9);
	}
}
