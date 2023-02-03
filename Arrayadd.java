import java.io.*;
class Arrayadd
{
	public static void main(String args[]) throws Exception
	{
		int matrix1[][]=new int[3][3];
		int matrix2[][]=new int[3][3];
		int matrix3[][]=new int[3][3];
		int i,j;
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter Numbers in the first matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				matrix1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter Numbers in the Second matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				matrix2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Sum of Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(matrix3[i][j]);
			}
		}
	}
}