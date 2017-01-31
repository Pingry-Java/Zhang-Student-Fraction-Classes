public class FractionRunner
{
	public static void main(String args[])
	{
		Fraction f1 = new Fraction(1,4);
		Fraction f2 = new Fraction(1,3);

		System.out.println(f1.times(1,3));
		System.out.println(f1.dividedBy(1,3));
		System.out.println(f1.toDouble());
		System.out.println(f1.toString());
		System.out.println(f1.plus(f2));
		System.out.println(f1.minus(f2));
		System.out.println(f1.compareTo(f2));


	}
}