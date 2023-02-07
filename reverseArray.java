import java.util.*;
public class ReverseArray 
{
		static void reverseArray(int arr[],int start,int end)
		{
		    int temp;
			while(start<=end)
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
			static void print(int arr[],int size)
			{
				for(int i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
		public static void main(String[] args)
		{
			int arr[]=new int[5];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				arr[i]=sc.nextInt();
			}
			print(arr,5);
			reverseArray(arr,0,4);
			print(arr,5);
		}
}
