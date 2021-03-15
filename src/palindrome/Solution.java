package palindrome;

class Solution {
	int reverse = 0;

    public boolean isPalindrome(int x) {
    	boolean result = true;
    	int xt = x;

    	if(x<0)return false;

    	while(xt>0) {
    		reverse = reverse*10 + xt%10;
    		xt /= 10;
    	}
    	System.out.println(reverse);

    	result = (reverse == x);
    	return result;
    }

    public static void main(String[] args) {

    	Solution s = new Solution();
    	s.isPalindrome(12345);
	}


}