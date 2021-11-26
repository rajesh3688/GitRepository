
public class RemoveJunkSpecialchars {

	public static void main(String[] args) {
		
		String s="sdgf ^$$878 56868 fgete #!@";
		
		//RegularExpression :[^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
