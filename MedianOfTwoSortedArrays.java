import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int a[]=new int[m+n];
        for(int i=0; i<m; i++){
            a[i] = nums1[i];  
        }
        for(int i=0; i<n; i++){
            a[m+i] = nums2[i];  
        }
        Arrays.sort(a);
        int l=a.length;
        if(l%2==0){
            int Median = l/2;           
            int d = (a[Median]+a[Median-1]);
            return (float)d/2;
        } else {
            int Median = (l/2);
            return a[Median];
        }
        
    }
}
