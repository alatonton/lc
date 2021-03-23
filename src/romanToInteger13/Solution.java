package romanToInteger13;

class Solution {
    public static int romanToInt(String s) {

    int thou= 0;
    int hund= 0;
    int ten = 0;
    int one = 0;
    char c;
    for(int i = 0; i<s.length();i++){

        switch(c = s.charAt(i)){

        case 'M': thou +=1000;
                    if(i!=0 && s.charAt(i-1)=='C')
                    {thou -= 1000;
                    hund = 900;}
                    break;
        case 'D': hund +=500;
                    if(i!=0 && s.charAt(i-1)=='C')
                    hund = 400;
                    break;
        case 'C': hund +=100;
                    if(i!=0 && s.charAt(i-1)=='X')
                    {hund -= 100;
                    ten = 90;}
                    break;
        case 'L': ten +=50;
                    if(i!=0 && s.charAt(i-1)=='X')
                    ten = 40;
                    break;
        case 'X': ten +=10;
                    if(i!=0 && s.charAt(i-1)=='I')
                    {ten -= 10;
                    one = 9;}
                    break;
        case 'V': one +=5;
                    if(i!=0 && s.charAt(i-1)=='I')
                    one = 4;
                    break;
        case 'I': one +=1;
                    break;
        }
    }
     return thou + hund +ten + one;
    }
    public static void main(String[] args) {
    	System.out.println(romanToInt("MCMXCIV"));
	}
}
