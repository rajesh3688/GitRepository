package JavaBasics;

public class TwoDimenArray {

	public static void main(String[] args) {
		
		String s[][]=new String[1][2];
		
		System.out.println(s.length);//no of rows
		System.out.println(s[0].length);//no of columns
		
		s[0][0] = "a";
		s[0][1] = "b";
		
		System.out.println(s[0][1]);
		
		for(int i=0;i<s.length;i++)
			for(int j=0;j<s[0].length;j++)
			{
				System.out.println(s[i][j]);
			}
		
		

	}

}
