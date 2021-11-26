
public class Characteroccurences {

	public static void main(String[] args) {
		
		String str="I love tetsting";
		
		/*int count=0;
	
		for(char ch:str.toCharArray()) {
			if(ch == 't') {
				count++;
			}
		}
		System.out.println(count);*/
		getoccurences(str,' ');
		getcharcount(str,'t');
	}	
	
	public static void getcharcount(String str,char val) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val+":"+count);
	}
	public static void getoccurences(String str,char val) {
	
	int count=0;
	for(char ch:str.toCharArray()) {
		if(ch == val) {
			count++;
		}
	}
      System.out.println(val+":"+count);
	}	

}
