package h3;

public class H3_main {

	public static void main(String[] args) {
		int i,j,k;
		i = 2;
		j = 3;
		
		k=-10;
		
		if(i>j && !(i>200) && !(j>100)) {
			k=1;
		}
		if(i>j && (i>200) && !(j>100)) {
			k=2;
		}
		if(i>j && (i>200) && (j>100)) {
			k=3;
		}
		if(!(i>j) && !(i>200) && !(j>100)) {
			k=4;
			
			
		}
		//System.out.println(k);
	}

}
