package siit.java4.metricdistancecalc;


import org.junit.Assert;
import org.junit.Test;

public class MetricDistanceCalculatorIntegrationTest {
	
	@Test
	public void distancetCalculatorWorksWithCorrectInput() throws UnknownDistanceFormatException {
		// given
		String s = "21km+50000cm+1000m";
		MetricDistanceCalculator calc = new MetricDistanceCalculator();
		// when
		Distance result = calc.computeDistance(s, Distance.KILO_METERS);
		// then
		Distance expected = new Distance(Distance.KILO_METERS, 22.50000);
		Assert.assertEquals(expected, result);		
	}

}

