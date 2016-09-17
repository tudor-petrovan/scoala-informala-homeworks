package siit.java4.metricdistancecalc;

public class MetricDistanceExpressionParser {
	
	private static final String MINUS = "-";
	private static final String PLUS = "\\+";

	public Distance [] parse(String expression) throws UnknownDistanceFormatException{
		// count the operands
		int operandCount = countSubStringOccurrences(expression, PLUS)+countSubStringOccurrences(expression, MINUS)+1;
		if(expression.startsWith("-")){
			operandCount--;
		}
		Distance distances[] = new Distance[operandCount];
		int index = 0;
		expression = expression.trim().replaceAll(" ", "").replaceAll("\t", "").replaceAll("\n", ""); // loose the whitespaces 
		while(expression.length()>0){
			int sign = 1;
			if(expression.startsWith(MINUS)){
				expression = expression.replaceFirst(MINUS, "");
				sign = -1;
			} else if (expression.startsWith("+")){
				expression = expression.replaceFirst(PLUS, "");
			}
			int nextOpPos = nextOperatorPos(expression);
			String operand = null;
			if(nextOpPos==-1){// last operand
				operand = expression;
			} else {
				operand = expression.substring(0, nextOpPos);
			}
			expression = expression.replaceFirst(operand, "");
			distances[index++] = convertToDistance(operand, sign);
		}
		return distances;
	}
	
	int nextOperatorPos(String expression) {
		int plusPos = expression.indexOf("+");
		int minusPos = expression.indexOf("-");
		if(plusPos==-1){
			return minusPos;
		}
		if(minusPos==-1){
			return plusPos;
		}
		return plusPos<minusPos?plusPos:minusPos;
	}

	private Distance convertToDistance(String e, int sign) throws UnknownDistanceFormatException {
		if(e.endsWith(Distance.CENTI_METERS)){
			return convertToDistance(e, sign, Distance.CENTI_METERS);
		} else if (e.endsWith(Distance.KILO_METERS)){
			return convertToDistance(e, sign, Distance.KILO_METERS);
		} else if(e.endsWith(Distance.METER)){
			return convertToDistance(e, sign, Distance.METER);
		}
		throw new UnknownDistanceFormatException("Can not parse ["+e+"] as a valid weight.");
	}
	
	private Distance convertToDistance(String e, int sign, String distanceFormat){
		return new Distance(distanceFormat, sign * Integer.parseInt(e.replace(distanceFormat, "")));
	}

	private int countSubStringOccurrences(String s, String sub){
		return s.length() - s.replaceAll(sub, "").length();
	}

}
