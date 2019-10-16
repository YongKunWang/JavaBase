public class testBreak{
	public static void main(String[] args){
		int i = 10;
		while(true)
		{
			System.out.print("i的值为：" + i);
			while(true)
			{
				i ++;
				if(i == 20)
				{
					break;
				}
			}
			
		}
	} 
}