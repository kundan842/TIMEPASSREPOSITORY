
// new comment added

public class Main {
//edited by ashwini
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.play  \n2.exit");
			System.out.println("enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				                     Game g1=new Game();

				                     for(int i=1;i<=g1.getChance();i++)
				                     {
					                     System.out.println("guess the no");
					                     int guess=sc.nextInt();
				                    	 int count=i;
				                    
				                     int val=g1.isMatching(guess);
				                     if(val==1)
				                     {
				                    	 System.out.println("number is greater");
				                     }
				                     else if(val==-1)
				                     {
				                    	 System.out.println("number is lesser");
				                     }
				                     else
				                     {
				                    	 System.out.println("Bingo! You Won");
				                    	    break;
				                     }
				                     if(count==4)
				                     {
				                    	 System.out.println("last chance");
				                     }
				                 
				                     }
				                     break;
			case 2:
										return;
			default :
				                       System.out.println("wrong choice");
				                       break;
				  
			}
		}
	

	}

}
//just added comment ....shreyas
//hello comment is added by ashwini
//hello this is atharva.
