
public class LargestandSmallest {

	public static void main(String[] args) {
		
		int a[]= {-10,-24,-45,-76,-88,0,-57574};
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		
		System.out.println("Largest number is:"+largest);
		System.out.println("Smallest number is:"+smallest);
		
		

	}

}
