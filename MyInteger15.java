package abstractionAndEncapsulation15;

public class MyInteger15 {
	private int value;
	
	public MyInteger15 (int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public boolean isOdd() {
		return MyInteger15.isOdd(this.value);
	}
	
	public boolean isEven() {
		return MyInteger15.isEven(this.value);
	}
	
	public boolean isPrime() {
		return MyInteger15.isPrime(this.value);
	}
	
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	public static boolean isEven(int value) {
		return !MyInteger15.isOdd(value);
	}
	public static boolean isPrime(int value) {
		int maxDivider = (int)Math.sqrt(value);
		for(int i = 2; i <= maxDivider; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean equals(MyInteger15 value) {
		return value.getValue() == this.value;
	}
	
	public static boolean isOdd(MyInteger15 value) {
		return MyInteger15.isOdd(value.getValue());
	}
	public static boolean isEven(MyInteger15 value) {
		return MyInteger15.isEven(value.getValue());
	}
	public static boolean isPrime(MyInteger15 value) {
		return MyInteger15.isPrime(value.getValue());
	}
	
	
	static int parseInt(char[] array) {
		return MyInteger15.parseInt(new String (array));
	}
	
	static int parseInt(String array) {
		return Integer.parseInt(array);
	}
	
	
	
	}
	


