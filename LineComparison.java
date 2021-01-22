class LineComparison
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		int x1=6,x2=9,y1=2,y2=6;
		int LENGTH_OF_A_LINE;
		LENGTH_OF_A_LINE=(int) (Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
		System.out.println("Length of the line is : " +LENGTH_OF_A_LINE);
	}
}
