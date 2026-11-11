class Numbers{
	public static void main(String[] args){
		int n=153;
		System.out.println(isAmstrong(n));
	}
	public static int isAmstrong(int num){
		int count=0,temp=num,dig=1,sum=0;
		while(num!=0){
			count++;
			num/=10;
		}
		num=temp;
		while(num!=0){
			int j=num%10;
			for(int i=1;i<=count;i++)
				dig*=j;
			num/=10;
			sum+=dig;
		}
		if(temp==sum)
			return sum;
		return sum;
	}
}
		