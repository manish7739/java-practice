class Arraylargest
{
	public static void main(String[] args)
	 {
		 int t;
	 	int a[]={12,34,5,6,7};
	 	int largest=a[0];
	 	for (int num:a )
	 	 {
	 	if (largest<num)
	 	 {
	 		largest=num;
	 			
	 		}	
	 	}
	 System.out.println("largest number = "+largest);	
	}
}