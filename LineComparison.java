class LineComparison
{
   int LENGTH_OF_1ST_LINE,LENGTH_OF_2ND_LINE;
	int x1, x2, y1, y2, a1, a2, b1, b2;
	public LineComparison(int x1,int x2,int y1,int y2,int a1,int a2,int b1,int b2)
	{
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		this.a1=a1;
		this.a2=a2;
		this.b1=b1;
		this.b2=b2;
	}
   public void compareTo()
   {
      LENGTH_OF_1ST_LINE=(int) (Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
      LENGTH_OF_2ND_LINE=(int) (Math.sqrt(((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1))));
      if(LENGTH_OF_1ST_LINE>LENGTH_OF_2ND_LINE)
         System.out.println("The 1st line is greater");
      else if(LENGTH_OF_1ST_LINE<LENGTH_OF_2ND_LINE)
         System.out.println("The second line is greater");
      else
         System.out.println("Two lines are equal");
   }
   public static void main(String args[])
   {
      LineComparison obj1=new LineComparison(6,9,2,6,6,9,2,1);
      obj1.compareTo();
   }
}
