import java.util.Arrays;

public class number2 {

	public static void main(String[] args) {
		// Output number from 1 to 100 ., without using while , for,do while loops 
		//and without recursion
		Object num []= new Object[100];
		
		Arrays.fill(num, new Object() {
			int count=0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
	}

}
