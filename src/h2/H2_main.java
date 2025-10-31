package h2;

public class H2_main {
	public static void main(String[] args) {
		int i,j,k,min,max;
		i = 10;
		j = 20;
		k = 30;
		min =0;
		max =0;
		if(i < j && i < k) {
			min = i;
		}
		if(j < k && j < i) {
			min = j;
		}
		if(k < i && k < j) {
			min = k;
		}
		if(i > j && i > k) {
			max = i;
		}
		if(j > k && j > i) {
			max = j;
		}
		if(k > i && k > j) {
			max = k;
		}
		//System.out.println("Das Minimum ist: " + min);
		//System.out.println("Das Maximum ist: " + max);
		
		
	}
}
