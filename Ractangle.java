class Rectangle
{
	double lenght;  //Instance variable
	double breadth;	//Instance variable
	public static void main(String[] args)
	{
		Rectangle myrect=new Rectangle();
		double area;
		myrect.lenght=10;  //Using dot operator we can aacess Instance operator
		myrect.breadth=20; //Using dot operator we can aacess Instance operator
		area=myrect.lenght*myrect.breadth;  //Appay Formula to fin area of Rectangle
		System.out.println("Area="+area);   //Print the area of Rectangle
	}
}