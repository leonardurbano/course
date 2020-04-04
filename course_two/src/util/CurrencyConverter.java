package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double converteDollarReal(double amountDollar, double dollarValue) {
		return amountDollar * dollarValue * (IOF + 1);
	}
}
