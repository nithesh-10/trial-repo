//twisted prime
class TwistedPrimeNumber{
		public static void main(String[] args){
			int num=23,temp, rev=0;
			boolean res1=false, res2=false;
			temp=num;
			while(num!=0){
				rev=(rev*10)+(num%10);
				num=num/10;
			}
		for(int i=2;i<=(temp/2);i++){
			if(temp%i==0){
				res1=true;
				break;
			}else
				res1=false;
			}
		for(int i=2;i<=(rev/2);i++){
			if(rev%i==0){
				res2=true;
				break;
			}
			else 
				res2=false;
			}
		if(res1==false&&res2==false)
			System.out.println("Twisted prime");
		else
			System.out.println("Not Twisted prime");
		}
}
				
		