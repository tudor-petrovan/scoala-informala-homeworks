package siit.java4.metricdistancecalc;


import org.junit.Test;
import org.junit.Assert;

public class MetricDistanceConverterTest {
	
	@Test
	public void meterToKilometersConvertion() throws UnknownDistanceFormatException{
		Distance m1000 = new Distance(Distance.METER, 1000);
		MetricDistanceConverter distanceConverter = new MetricDistanceConverter();
		
		Distance result = distanceConverter.convert(m1000, Distance.KILO_METERS);
		Distance expected = new Distance(Distance.KILO_METERS, 1);
		
		Assert.assertEquals("Convertion from meters to km is incorrect.", expected,  result);
	}
	
	@Test
	public void meterToCentiMetersConvertion() throws UnknownDistanceFormatException{
		Distance m1 = new Distance(Distance.CENTI_METERS, 100);
		MetricDistanceConverter distanceConverter = new MetricDistanceConverter();
		
		Distance result = distanceConverter.convert(m1, Distance.METER);
		Distance expected = new Distance(Distance.METER, 1);
		
		Assert.assertEquals("Convertion from meters to centimeters is incorrect.", expected,  result);
	}
	
	@Test(expected=UnknownDistanceFormatException.class)
	public void convertionFailsWhenUnknownFormatIsPassed() throws UnknownDistanceFormatException{
		Distance km1 = new Distance(Distance.KILO_METERS, 1);
		MetricDistanceConverter weightConverter = new MetricDistanceConverter();
		weightConverter.convert(km1, "dkg");
	}
	

}
