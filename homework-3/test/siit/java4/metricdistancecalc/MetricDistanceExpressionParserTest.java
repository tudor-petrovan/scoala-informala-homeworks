package siit.java4.metricdistancecalc;


import org.junit.Test;
import static org.junit.Assert.*;

public class MetricDistanceExpressionParserTest {

	@Test
	public void nextOperatorTest1() {
		// given
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "123-";
		
		// when
		int opPos = parser.nextOperatorPos(s);
		
		//then
		assertEquals(3, opPos);
	}

	@Test
	public void nextOpPosNotFound() {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "123";
		assertEquals(-1, parser.nextOperatorPos(s));
	}

	@Test
	public void nextOperatorTestCorrectWithMultipleOps() {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "123-+-";
		assertEquals(3, parser.nextOperatorPos(s));
	}

	@Test
	public void nextOperatorTestWithJustOp() {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "+";
		assertEquals(0, parser.nextOperatorPos(s));
	}

	@Test
	public void correctFormatIsParsed() throws UnknownDistanceFormatException {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "1km+1km";
		Distance[] expected = new Distance[] { new Distance(Distance.KILO_METERS, 1), new Distance(Distance.KILO_METERS, 1) };
		Distance[] actual = parser.parse(s);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void correctFormatWithMinusIsParsed() throws UnknownDistanceFormatException {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "-1km-2km";
		Distance[] expected = new Distance[] { new Distance(Distance.KILO_METERS, -1), new Distance(Distance.KILO_METERS, -2) };
		Distance[] actual = parser.parse(s);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void correctFormatIsParsed2() throws UnknownDistanceFormatException {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "1km-13km";
		Distance[] expected = new Distance[] { new Distance(Distance.KILO_METERS, 1), new Distance(Distance.KILO_METERS, -13) };
		Distance[] actual = parser.parse(s);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void correctFormatWithMultipleOpsAndNegativeSignAtStartIsParsed() throws UnknownDistanceFormatException {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "-1km+5km-3m";
		Distance[] expected = new Distance[] { new Distance(Distance.KILO_METERS, -1), new Distance(Distance.KILO_METERS, 5),
				new Distance(Distance.METER, -3) };
		Distance[] actual = parser.parse(s);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void correctFormatWithMultipleOpsIsParsed() throws UnknownDistanceFormatException {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "1km+5km-3cm";
		Distance[] expected = new Distance[] { new Distance(Distance.KILO_METERS, 1), new Distance(Distance.KILO_METERS, 5),
				new Distance(Distance.CENTI_METERS, -3) };
		Distance[] actual = parser.parse(s);
		assertArrayEquals(expected, actual);
	}
	
	@Test(expected=UnknownDistanceFormatException.class)
	public void parsingFailsWithInvalidWeightFormat() throws UnknownDistanceFormatException {
		MetricDistanceExpressionParser parser = new MetricDistanceExpressionParser();
		String s = "-1km+5km-3red";
		parser.parse(s);
	}

}
