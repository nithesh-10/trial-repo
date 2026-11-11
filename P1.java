class P1{
	public static void main(String[] args){
		add(1,2);
		add(1,2.64);
		add(1.1245,2);
		add(1,20,1214,45);
		add(1,2,124);
		
	}
	public static int add(double n1, int n2){
		System.out.println(n1+n2);
		return 1;
	}
	public static boolean add(int n1, int n2){
		System.out.println(n1+n2);
		return true;
	}
	public static double add(int n1, int n2, int n3){
		System.out.println(n1+n2+n3);
		return 3.12;
	}
	public static char add(int n1,int n2,int n3,int n4){
		System.out.println(n1+n2+n3+n4);
		return 'a';
	}
	public static void add(int n1, double n2){
		System.out.println(n1+n2);
	}
	
	
}