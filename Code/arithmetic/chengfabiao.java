public class chengfabiao {
	public static void main(String[] args){
		for(int i = 1; i < 10; i ++){
			for(int j = 1; j <= i; j++)
				System.out.printf("  %d * %d = %d", i, j, i * j);
			System.out.println();
		}
	}
}