class Inc_Dec{

	public static void main(String[] args){
		int n1=10;
		int n2=15;
		int n3=n1++ + n2++ - ++n1 + n2-- + --n1 - --n1 + n1 + n2;
		int n4= n3++ - --n3 + n3 - n2++ - ++n2 + n3;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}