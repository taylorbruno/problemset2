package base;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;


public class MyInteger_Test {
	//Testing the methods. 
		@Test
		public void testIsEven() {
			int IntegerTestValue = 4;
			MyInteger test = new MyInteger(IntegerTestValue);
			boolean ExpectedResult = true;
			boolean ActualResult = test.isEven();
			assertEquals("testIsEven() should return true", ExpectedResult, ActualResult);
		}
		
		@Test
		public void testIsOdd() {
			int IntegerTestValue = 3;
			MyInteger test = new MyInteger(IntegerTestValue);
			boolean ExpectedResult = true;
			boolean ActualResult = test.isOdd();
			assertEquals("testIsOdd() should return true", ExpectedResult, ActualResult);
		}
		
		@Test 
		public void testIsPrime() {
			int IntegerTestValue = 5;
			MyInteger test = new MyInteger(IntegerTestValue);
			boolean ExpectedResult = true;
			boolean ActualResult = test.isPrime();
			assertEquals("testIsPrime() should return true", ExpectedResult, ActualResult);
		}
		
		//testing static methods - (int)
		@Test
		public void isEvenInt() {
			assertTrue(MyInteger.isEven(6));
			assertFalse(MyInteger.isEven(7));
			
		}
		@Test
		public void isOddInt() {
			assertTrue(MyInteger.isOdd(9));
			assertFalse(MyInteger.isOdd(10));
		}
		
		@Test
		public void isPrimeInt() {
			assertTrue(MyInteger.isPrime(7));
			assertFalse(MyInteger.isPrime(22));
		}
		
		//testing static methods(MyInteger)
		@Test
		public void isEvenMyInteger() {
			MyInteger val = new MyInteger(56);
			MyInteger val2 = new MyInteger(55);
			assertTrue(MyInteger.isEven(val));
			assertFalse(MyInteger.isEven(val2));
		}
		
		@Test
		public void isOddMyInteger() {
			MyInteger val = new MyInteger(78);
			MyInteger val2 = new MyInteger(79);
			assertTrue(MyInteger.isOdd(val2));
			assertFalse(MyInteger.isOdd(val));
		}
		
		@Test
		public void isPrimeMyInteger() {
			MyInteger val = new MyInteger(11);
			MyInteger val2 = new MyInteger(12);
			assertTrue(MyInteger.isPrime(val));
			assertFalse(MyInteger.isPrime(val2));
		}
		
		//testing the equals
		@Test
		public void EqualsInt() {
			MyInteger val = new MyInteger(50);
			MyInteger val2 = new MyInteger(55);
			MyInteger val3 = new MyInteger(50);
			assertTrue(val.equals(val3));
			assertFalse(val.equals(val2));
		}
		
		@Test
		public void EqualsMyInteger() {
			MyInteger val4 = new MyInteger(30);
			MyInteger val5 = new MyInteger(31);
			MyInteger val6 = new MyInteger(31);
			assertTrue(val5.equals(val6));
			assertFalse(val5.equals(val4));
		}

}
