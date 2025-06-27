class Solution {
    public boolean isHappy(int n) {
         int num=n;
        do{
            int sum=0;
            while(num>0)
            {
              int q=num%10;
                sum+=q*q;
                num/=10;
            }
            if(sum==1||sum==7)return true;
            num=sum;
        }while(num>9);
        return false;
    }
}