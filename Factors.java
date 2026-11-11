 class Factors{
	public static void main(String[] args){
		int m=5, n=80,count=0;
		for(;m<=n;m++){
			System.out.print("Factors of "+m+": ");
			count=0;
			for(int i=2;i<=(m/2);i++){
				if(m%i==0){
					System.out.print(i+" ");
					count++	;
				}
			}
			if(count==0)
				System.out.print("Prime number");
			System.out.println();
		}
	}
}