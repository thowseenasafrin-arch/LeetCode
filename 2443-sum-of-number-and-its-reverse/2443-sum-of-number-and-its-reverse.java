class Solution {
    static int reverse(int n){
        int rev=0,digit;
        while(n!=0){
          digit=n%10;
          rev=rev*10+digit;
          n=n/10;
        }
        return rev;
    }
    public boolean sumOfNumberAndReverse(int num) {
        for(int n=num/2;n<=num;n++){
            if(n+reverse(n)==num)            
              return true ; 
        }            
            return false; 
    }
}     
        
    
