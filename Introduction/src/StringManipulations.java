
public class StringManipulations {

	public static void main(String[] args) {
		
		String str="I love coding";
		String str1="I love Coding";
		
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf('o'));//1st occurence of o
		
		System.out.println(str.indexOf('o',str.indexOf('o')+1));//2nd occurence of o
		
		System.out.println(str.indexOf("love"));
		
		System.out.println(str.indexOf("test"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		String s=" Hello world ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String s1="01-01-2019";
		System.out.println(s1.replace("-", "/"));
		
		String s2="Hello_world_java";
		String a[]=s2.split("_");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(s2.concat(str1));
		
		
		
		
		

	}

}
