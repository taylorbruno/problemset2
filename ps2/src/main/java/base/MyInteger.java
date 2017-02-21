package base;
public class MyInteger {

		private int iValue;
		
		
		//Constructor
		public MyInteger(int iValue) { 
			this.iValue = iValue;
		}

		//Get
		public int getValue() {
			return iValue;
		}	
		
		//Odd, even, and prime
		public boolean isEven() {
			if (iValue % 2 == 0) {
				return true;
			}
				return false;
		}
		public boolean isOdd() {
			if (iValue % 2 != 0) {
				return true;
			}
				return false;
		}
		public boolean isPrime() {
			for(int i = 2; i < iValue; i++) {
				if(iValue % i == 0)
					return false;
			}
			return true;
		}
		
		//Static methods (int)
		public static boolean isEven(int val) {
			return (val % 2 == 0);
		}

		public static boolean isOdd(int val) {
			if (val % 2 != 0)
				return true;
			else
				return false;
		}
			
		public static boolean isPrime(int val) {
			for (int i = 2; i < Math.sqrt(val); i++) {
				if (val % i == 0)
					return false;
			}
			return true;
		}
		
		//Static methods (MyInteger)
		public static boolean isEven(MyInteger val) {
			return val.isEven();
		}

		public static boolean isOdd(MyInteger val) {
			return val.isOdd();
		}
			
		public static boolean isPrime(MyInteger val) {
			return val.isPrime();
		}
		
		
		//Equal methods
		public boolean equals(int val) {
			if (val == iValue) {
				return true;
			}
				return false;
			
		}
			
			
		public boolean equals(MyInteger iValue) {
			return equals(iValue.getValue());
			
		}

			
		}
