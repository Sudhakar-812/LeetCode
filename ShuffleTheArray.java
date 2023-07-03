public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int l = nums.length;
        int a[] = new int[l];
        for(int i=0; i<n; i++){
            a[j]=nums[i];
            j++;
            a[j]=nums[i+n];
            j++;
        }
        return a;
    }
}

