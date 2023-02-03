import java.io.*;
class Array{
	public static void main(String args[]) throws Exception
	{
		int num[]=new int [10];
		int i;
		int sum=0;
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(a);
		System.out.println("Enter 10 integer");
		for(i=0;i<10;i++)
		{
		num[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Sum of Array");
		for(i=0;i<10;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
}