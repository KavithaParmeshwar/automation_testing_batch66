package mkt.automation;

public class MathMethods11 
{

	public static void main(String [] args)
	{

		int addInt = Math.addExact(01, 16);
		System.out.println(addInt);

		long addLong = Math.addExact(17090000,1997);
		System.out.println(addLong);

		int subInt = Math.subtractExact(20, 03);
		System.out.println(subInt);

		long subLong = Math.subtractExact(20000000,2908003);
		System.out.println(subLong);

		int subMul = Math.multiplyExact(01 ,17);
		System.out.println(subMul);

		long mul1 = Math.multiplyExact(17091997L, 1);
		System.out.println(mul1);   //17091997

		long mul2 = Math.multiplyExact(1031985L, 1L);
		System.out.println(mul2);   //1031985

		int minInt = Math.min(17091997, 20000000);
		System.out.println(minInt); //17091997

		double minDouble = Math.min(1031985.0, 2000000.0);
		System.out.println(minDouble); //1031985

		float minFloat = Math.min(17091997f, 20000000f);
		System.out.println(minFloat); //17091997

		long minLong = Math.min(17091997L, 20000000L);
		System.out.println(minLong); //17091997

		int maxInt = Math.max(17091997, 10000000);
		System.out.println(maxInt); //17091997

		double maxDouble = Math.max(1031985.0, 1000000.0);
		System.out.println(maxDouble); //1031985

		float maxFloat = Math.max(17091997f, 10000000f);
		System.out.println(maxFloat); //17091997

		long maxLong = Math.max(17091997L, 10000000L);
		System.out.println(maxLong); //17091997

		int absInt = Math.abs(-1031985);
		System.out.println(absInt); //1031985

		double absDouble = Math.abs(-17091997.0);
		System.out.println(absDouble); //17091997

		float absFloat = Math.abs(-1031985f);
		System.out.println(absFloat); //1031985

		long absLong = Math.abs(-17091997L);
		System.out.println(absLong); //17091997
	}
}