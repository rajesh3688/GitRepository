import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
		String names[]= {"java","rugb","etd","java","etd"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
		
		//using hashset-stores only unique values
		Set<String> s=new HashSet<String>();
		for(String str:names) {
			if(s.add(str) == false) {
				System.out.println("Duplicate element is:"+str);
			}
		}

	}

}
