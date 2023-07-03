public class ReverseInteger {
     public int reverse(int x) {
        int r;
        long res=0;
        while(x!=0){
            r=x%10;
            res=res*10+r;
            x=x/10;
        }
        if(res>2147483647||res<-2147483648){
            return 0;
        }
        return (int)res;
    }
}
