import java.util.stream.IntStream;

public class number1 {

	public static void main(String[] args) {
		// Output number from 1 to 100 ., without using while , for,do while loop
		//printNum(1);
		//printNumber(1, 100);//by using range
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNumber(int fnum, int Lnum) {
		if(fnum<=Lnum) {
			System.out.println(fnum);
			fnum++;
			printNumber(fnum, Lnum);
		}
	}

}
