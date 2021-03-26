package longestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 ) return "" ;

        String shortest = strs[0];
        String fragment = "";
        String prefix = "";
        int counter = 0;

        for(String str : strs){
            if(shortest.length() > str.length()){
                shortest = str;
            }
        }

                for(int e = 0 ; e< shortest.length() ; e++){
                    fragment = shortest.substring(0,e+1);

                    for(String tempstr : strs){
                        if(fragment.equals(tempstr.substring( 0, fragment.length())))
                        counter++;
                        }
                        if(counter == strs.length && prefix.length() < fragment.length()){
                        prefix = fragment;
                        }
                        counter = 0;
                        }
    return prefix;


    }

    public static void main(String[] args){
    	String[] arg = {"flower","flow","flight"};
    	Solution solution = new Solution();
    	System.out.println(
    			solution.longestCommonPrefix(arg));
    }
}