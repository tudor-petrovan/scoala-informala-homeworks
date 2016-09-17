package siit.java4.metricdistancecalc;

public class Main {

	public static void main(String[] args) throws UnknownDistanceFormatException {
		String s = "20km+1500m-3miles";
		MetricDistanceCalculator calc = new MetricDistanceCalculator();
		System.out.println(calc.computeDistance(s, Distance.KILO_METERS));
	}

}
