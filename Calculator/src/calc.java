//
//public class calc {
//	public static void main(String[] args) {
//		calc myCalculator = new calc();
//		System.out.println(myCalculator.add(4,2));
//		System.out.println(myCalculator.subtract(8,2));
//		System.out.println(myCalculator.multi(2,2));
////		System.out.println(calc.add(4,2));
//	}
//	
//	public int add(int a, int b){
//		return a + b;
//	}
//	
//	public int subtract(int a, int b) {
//		return a - b;
//	}
//	
//	public int multi(int a, int b) {
//		return (a * b);
//	}
//	
//
//}	




public class Public {


   public int add(int a, int b) {
       return a + b;
   }
   public int subract(int a, int b) {
       return a - b;


   }
   public int multiply(int a, int b) {
       return a * b;


   }
   public int divide(int a, int b) {
       return a / b;

   }
   public double sadd(double d, double e) {
       return d + e;
   }

   public static void main(String args[]) {
       Public myCalculator = new Public();
//       System.out.println(myCalculator.add(8,4));
//       System.out.println(myCalculator.subract(8,4));
//       System.out.println(myCalculator.multiply(8,4));
//       System.out.println(myCalculator.divide(8,4));
       float x = (float) myCalculator.sadd(2.07, 1.07);
       System.out.println(x);
   }
}

//float x = (float) myCalculator.sadd(2.07, 1.07);



