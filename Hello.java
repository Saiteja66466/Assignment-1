class Hello
{
    public static void main(String[] args)
   {
      int n = 14;
		for(int i=0; i<n; i++)
         {
            for(int j=0; j<n; j++)
            {
                if(j==0 && i>=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i-j>=6 && j<=(n-1)/2 || j+i>=19 && j>=(n-1)/2 || i==n-1) 
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
         }
   }     
}