
public class Array {
	
	static int sum=0;
public static void main(String[] args) {
	//Array as = new Array();
	int [] a= {1,2,3,4,5};
	for(int i=0;i<a.length;i++) {
		sum=sum + a[i];
		}
	System.out.println(sum-a[2]);
	Array ab = new Array();
	ab.reverse_array(a);
	ab.average_array(a);
	
}
//reverse of array
void reverse_array(int a[]) {
	
	for(int i=a.length;i>0;i--) {
		System.out.println(a[i-1]);
	}
	
}
//average of array of numbers
void average_array(int a[]) {
	int avg=0;
	avg=sum/a.length;
	System.out.println(avg);
}
}

