public class LinearSearch
{
  static int search(int arr[],int n,int x)
  {
	  for(int i=0;i<n;i++)
	  {
		 
			  if(arr[i]==x)
			  {
				return i;
			  }
	 }
	  return -1;
  }
  public static void main(String[] args)
  {
	  int arr[]={10,20,30,40};
	  int n=4;
	  int x=40;
 System.out.printf("%d present at index %d",x,search(arr,n,x));
	  
  }  
}