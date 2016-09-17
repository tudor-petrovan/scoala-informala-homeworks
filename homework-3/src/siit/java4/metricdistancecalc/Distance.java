package siit.java4.metricdistancecalc;

public class Distance {
	
	public static final String METER = "m";
	public static final String KILO_METERS = "km";
	public static final String MILI_METERS = "mm";
	public static final String CENTI_METERS = "cm";
	public static final String DECI_METERS = "dm";
	public static final String INCH = "in";
	public static final String FOOT = "ft";
	public static final String MILES = "miles";

	
	private String formatName;
	private double value;
	
	public Distance(String formatName, double value) {
		this.formatName = formatName;
		this.value = value;
	}

	public String getFormatName() {
		return formatName;
	}

	public double getValue() {
		return value;
	}

	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formatName == null) ? 0 : formatName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distance other = (Distance) obj;
		if (formatName == null) {
			if (other.formatName != null)
				return false;
		} else if (!formatName.equals(other.formatName))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Weight [formatName=" + formatName + ", value=" + value + "]";
	}

	public void add(double value) {
		this.value += value;
	}
	
	

}
