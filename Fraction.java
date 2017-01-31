public class Fraction
{
	private int numerator;
	private int denominator;

	public Fraction()
	{
		this.numerator = 1;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator()
	{
		return this.numerator;
	}

	public int getDenominator()
	{
		return this.denominator;
	}

	public void inverse()
	{
		int placeholder = 0;
		placeholder = this.denominator;
		this.denominator = numerator;
		this.numerator = placeholder;
	}

	public double times(int numerator, int denominator)
	{
		return ((double)this.numerator*numerator)/((double)this.denominator*denominator);
	}

	public double dividedBy(int numerator, int denominator)
	{
		return ((double)this.numerator*denominator)/((double)this.denominator*numerator);
	}

	public double toDouble()
	{
		return (double)numerator/(double)denominator;
	}

	public String toString()
	{
		return Double.toString((double)numerator/(double)denominator);
	}

	public double plus(Fraction f)
	{
		double lcd = f.getDenominator()*denominator; 
		double numerator1 = numerator * ((double)lcd/denominator);
		double numerator2 = f.getNumerator() * ((double)lcd/f.getDenominator());
		return (double)(numerator1+numerator2)/lcd;
	}

	public double minus(Fraction f)
	{
		double lcd = f.getDenominator()*denominator; 
		double numerator1 = numerator * ((double)lcd/denominator);
		double numerator2 = f.getNumerator() * ((double)lcd/f.getDenominator());
		return (double)(numerator1-numerator2)/lcd;
	}

	public boolean compareTo(Fraction f)
	{
		double firstFrac = (double)numerator/(double)denominator;
		double secondFrac = f.toDouble();
		return (firstFrac>secondFrac);
	}
}