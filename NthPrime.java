class NthPrime{
	public static void main(String[] args){
		int n=10,i=2,count=1;
		Boolean res=true;
		System.out.print("the "+n+"th Prime number is: ");
		while(count<=n){
			
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					res=false;
					break;
				}else{
					res=true;
					count++;
				}
			}
			i++;
		}
		if(res==true&&count==n)
			System.out.print(i);
			
	}
}

