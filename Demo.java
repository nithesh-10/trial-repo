class Demo{
	public static void main(String[] args){
		System.out.println(chotu());
		System.out.println(motu(2));
	}
	public static int chotu(){
		int num=1,num1=2;
		return num+num1;
	}
	public static String motu(int n){
		return n%2==0?"even":"odd";
	}
}