import java.util.stream.IntStream;

public class Recursive {
	
	//recursive functions
	public static void printnum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printnum(num);
		}
	}	
		
		//recursive functions
		public static void printnumbers(int stnum,int endnum) {
			if(stnum<=endnum) {
				System.out.println(stnum);
				stnum++;
				printnumbers(stnum,endnum);
			}	
	}

	public static void main(String[] args) {
		//printnum(1);
		//printnumbers(20,100);
		//Javastreams
		IntStream.range(50, 301).forEach(e->System.out.println(e));

	}

}
