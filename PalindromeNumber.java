public class PalindromeNumber{
    public boolean isPalindrome(int x) {
        int r=0;
        int y;
        int res=0;
        y=x;
        if(x<0){
            return false;
        }else{
            while(x!=0){
            r=x%10;
            res=res*10+r;
            x=x/10;
            }
        }
        if(y!=res){
            return false;
        } else
        {
            return true;
        }
    }
}