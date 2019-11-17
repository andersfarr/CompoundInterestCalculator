
public class Calculator {
	public static void calculate(double principle, double rate, double variability, int termlength) {
		double random;
		random = principle;
		double randomRange;
		for(int i = 0; i<=termlength; i++) {
			System.out.printf("Term number: %d Low estimate: %.3f High estimate: %.3f Average estimate: %.3f Random estimate %.3f\r\n",i,principle*Math.pow(1+(rate-variability)/100, i),principle*Math.pow(1+(rate+variability)/100, i),principle*Math.pow(1+rate/100, i), random);
			randomRange = randomNumGen(rate, variability);
			random = random*(1+(randomRange)/100);
		}
	}
	
	public static double randomNumGen(double average, double variability) {
		return Math.random()*(2*variability) + (average-variability);
	}
}
