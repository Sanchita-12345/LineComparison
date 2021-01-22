class LineComparison
{
   int LENGTH_OF_1ST_LINE,LENGTH_OF_2ND_LINE;
   public void compareTo(int x1,int x2,int y1,int y2,int a1,int a2,int b1,int b2)
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
      System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
      LineComparison obj1=new LineComparison();
      obj1.compareTo(6,9,2,6,6,9,2,1);
   }
}
