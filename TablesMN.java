class TablesMN{
	public static void main(String[] args){
		int m=5,n=18;
		for(int i=1;i<=10;i++){
			for(int j=m;j<=n;j++)
				System.out.print(j+"x"+i+"="+(j*i)+" | ");
			System.out.println();
		}
	}
}