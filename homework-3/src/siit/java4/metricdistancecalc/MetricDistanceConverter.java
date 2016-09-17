package siit.java4.metricdistancecalc;

public class MetricDistanceConverter {
	
	private static final Convertion [] CONVERTIONS = new Convertion[]{
		new Convertion(Distance.KILO_METERS, Distance.METER, 1000),
		new Convertion(Distance.METER, Distance.KILO_METERS, 0.001),
		new Convertion(Distance.CENTI_METERS, Distance.KILO_METERS, 0.00001),
		new Convertion(Distance.KILO_METERS, Distance.CENTI_METERS, 100000),
		new Convertion(Distance.METER, Distance.CENTI_METERS, 100),
		new Convertion(Distance.CENTI_METERS, Distance.METER, 0.01),
		
		
	};

	
	public Distance convert(Distance distance, String toFormat) throws UnknownDistanceFormatException{
		if(distance.getFormatName().equals(toFormat)){
			return distance;
		}
		Convertion convertion = null;
		for(Convertion c : CONVERTIONS){
			if(c.fromFormat.equals(distance.getFormatName()) && c.toFormat.equals(toFormat)){
				convertion = c;
				break;
			}
		}
		if(convertion==null){
			throw new UnknownDistanceFormatException("No rate found for "+distance.getFormatName()+" - "+toFormat);
		}
		return new Distance(toFormat, distance.getValue()*convertion.rate);
	}
	
	private static class Convertion {
		double rate;
		String fromFormat;
		String toFormat;
		
		public Convertion(String fromFormat, String toFormat, double rate) {
			super();
			this.rate = rate;
			this.fromFormat = fromFormat;
			this.toFormat = toFormat;
		}
		
		
		
	}

}
