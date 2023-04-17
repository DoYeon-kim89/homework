
public class Test0417_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a;
		a = new int[6];
		
		a[0] = 2;
		a[1] = 10;
		a[2] = 8;
		a[3] = 5;
		a[4] = 3;
		a[5] = 9;
		
		int sum = 0;
		
		for(int i=0; i<6; i++) {
			sum = sum + a[i];
			//2+10+8+5+3+9
			
		}
		System.out.println(sum);
		
		int o;
		sum = 0;
		for(o=1; o<=100; o++) {
			sum= sum+o;
				
		}
		
		System.out.println(sum);
		
		int[] k;
		k= new int[100];
		sum = 0;
		for(int j=0; j<100; j++) {
			k[j]=j+1;
			sum=sum+k[j];
		
		}
		
		System.out.println(sum);

	}

}
