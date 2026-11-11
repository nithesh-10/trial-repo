class FirstNPrime{
	public static void main(String[] args){
		int n=10,i=2,count=0;
		Boolean res=true;
		System.out.print("First "+n+" Prime numbers are: ");
		while(count<n){
			res=true;
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					res=false;
					break;
				}else
					res=true;
			}
			if(res==true){
				System.out.print(i+" ");
				count++;
				
			}
		 	i++;	
		}
	}
}
