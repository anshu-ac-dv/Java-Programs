import java.io.*;
public class Arraymulti
{
    public static void main(String[] args) throws Exception 
	{
        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];
        int matrix3[][] = new int[2][2];
		
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(a);
		
        System.out.println("Enter the values of Matrix1:");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                matrix1[i][j]=Integer.parseInt(br.readLine());
            }
        }
		
        System.out.println("Enter the values of Matrix2:");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                matrix2[i][j]=Integer.parseInt(br.readLine());
            }
        }
		
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                matrix3[i][j]=0;
            }
        }
		
        System.out.println("Multiplication=");
        for (int i=0;i<2;i++)
		{
            for (int j=0;j<2;j++)
			{
                for (int k=0;k<2;k++)
				{
                    matrix3[i][j]= matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for (int i=0;i<2;i++)
		{
            for (int j=0;j<2;j++)
			{
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}