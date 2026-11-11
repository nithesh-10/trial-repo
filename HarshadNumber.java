//Harshad number 
class HarshadNumber{
		public static void main(String[] args){
			int num=108, temp, sum=0;
			temp=num;
			while(num!=0){
				sum=sum+(num%10);
				num=num/10;
			}	
			if(temp%sum==0)
				System.out.println("Harshad number");
			else
				System.out.println("not Harshad number");
	}
}
		
		