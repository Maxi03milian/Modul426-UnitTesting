package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class SaveCalculator {


	public int summe(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}


	public int subtraktion(int value1, int value2) throws ArithmeticException
	{
		long value = (long) value1 - (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return value1 - value2;
	}


	public double division(int value1, int value2) {
		long value = (long) value1 / (long) value2;
		if((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		else if (value2 == 0){
			throw new ArithmeticException();
		}
		else{
			return value1 / value2;
		}
	}

	public double multiplication(int value1, int value2) {
		long value = (long) value1 *  (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return value1 * value2;
	}



	//region ACCESS MODIFIER TESTS

	/*
	* Tests von Sichtbarkeiten von Methoden für Tests
	*
	* Werden in "SaveCalculatorTest" in der "Access modifier tests" Region
	*/


	//Public Methoden funktionieren -> Bis jetzt alle Methoden mit Public

	//Private Test Methode
	private int summePrivate(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	//Protected Test Methode
	protected int summeProtected(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	//Package-Protected Test Methode
	 int summePackageProtected(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	//endregion





}