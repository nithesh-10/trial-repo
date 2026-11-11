//spy number 1124 1+1+2+4=8, 1*1*2*4=8

class SpyNumber{
	public static void main(String[] args){
		int n=114, sum=0, pro=1;
		while(n!=0){
			sum=sum+(n%10);
			pro=pro*(n%10);
			n=n/10;
		}
		if(sum==pro)
			System.out.println("Spy number");
		else
			System.out.println("not a Spy number");
	}			
}