class Solution {
public:
    int fib(int n) {
    if(n==0 or n==1) return n;
    int pre=0;
    int now=1;
    int last;
      for(int i=2;i<=n;i++){
        last=pre + now;
        pre=now;
        now=last;
      }  
      return last;
    }
};