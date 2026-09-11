class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k=0;
        int l=0;
        int count=0;
        int ncount=0;
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count=count+1;
                }
            }
        }
        int arr3[]=new int[count];
         for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    arr3[k]=nums1[i];
                    k++;
                }
            }
        }
        for(int i:arr3)
        {
            lhs.add(i);
        }
        int arr4[]=new int[lhs.size()];
        for(int m:lhs)
        {
            arr4[l]=m;
            l++;
        }
        return arr4;
    }
}