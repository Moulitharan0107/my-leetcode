class Solution {
    public int thirdMax(int[] nums) {
        int count=0;
		LinkedHashSet <Integer> lhs=new LinkedHashSet<>();
		int k=0;
		for(int i:nums)
		{
		    lhs.add(i);
		}
		int arr[]=new int[lhs.size()];
		for(int i:lhs)
		{
		    arr[k]=i;
		    k++;
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>max1)
		    {
		        max1=arr[i];
		    }
	    }
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]<max1 && arr[i]>max2)
		    {
		        max2=arr[i];
		    }
		       
		    } 
		    for(int i=0;i<arr.length;i++)
		    {
		       if(arr[i]<max1 && arr[i]<max2 && arr[i]>max3)
		        {
		            max3=arr[i];
		        }  
		    }
		    
		    if(arr.length<3)
		    {
		        return max1;
		    }
		    else
		    {
		        return max3;
		    }
    }
}
		
		   
		   