import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String str[]= {"sgf","fgr","efd","sgf","efd","erd"};
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}

	     }
		//hashset does not allow duplicate elements
		System.out.println("***Hastset****");
        Set<String> s=new HashSet<String>();
        for(String e:str) {
        	if(s.add(e) == false) {
        		System.out.println(e);
        	}
        }
	}
}