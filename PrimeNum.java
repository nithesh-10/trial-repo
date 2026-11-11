class PrimeNum{
	public static void main(String[] args){
		int m=1,n=50;
		Boolean res=true;
		System.out.print("Prime number from "+m+" to "+n+": ");
		for(int i=m;i<=n;i++){
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					res=false;
					break;
				}else
				res=true;
			}
				if(res==true&&i!=1)
					System.out.print(i+" ");
		}
	}
}