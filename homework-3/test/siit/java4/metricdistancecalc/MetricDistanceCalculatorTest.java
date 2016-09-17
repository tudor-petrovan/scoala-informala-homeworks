package siit.java4.metricdistancecalc;


import org.junit.Test;
import static org.junit.Assert.*;

public class MetricDistanceCalculatorTest {
	
	@Test
	public void simpleExpressionIsCalculated() throws UnknownDistanceFormatException{
		// given
		MetricDistanceExpressionParser mockParser = new MetricDistanceExpressionParser(){
			@Override
			public Distance[] parse(String expression) throws UnknownDistanceFormatException {
				return new Distance[]{new Distance(Distance.KILO_METERS, 1), new Distance(Distance.METER, 1)};
			}	
		};
		MetricDistanceConverter mockConverter = new MetricDistanceConverter(){
			@Override
			public Distance convert(Distance distance, String toFormat) throws UnknownDistanceFormatException {
				if(distance.getFormatName().equals(Distance.KILO_METERS)){
					return new Distance(Distance.METER, 1000);
				} else {
					return distance;
				}
			}
		};
		MetricDistanceCalculator calc = new MetricDistanceCalculator(mockParser, mockConverter);
		
		// when
		Distance actual = calc.computeDistance("1km+1m", Distance.METER);
		
		// then
		Distance expected = new Distance(Distance.METER, 1001);
		assertEquals(expected, actual);
	}

}
