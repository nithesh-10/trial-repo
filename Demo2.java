//write a java program to print each and every digit of given number from last
class Demo2{
	public static void main(String[] args){
		int i=102;
		boolean res= true;
		for(int a=2;a<=i/2;a++){
		if(i%a==0){
			res=false;
			break;
			}
		}		
		if(res==false)
		System.out.println("it is not a prime number");		
		else
		System.out.println("it is not a prime number");		

	}
} 