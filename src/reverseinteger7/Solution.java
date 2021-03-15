package reverseinteger7;


class Solution {
    public static int reverse(int x) {


        // 逆にした数が入る予定
        int revnum = 0;
        // 桁数
        int keta=0;
        //  revarray[] 逆にした数が桁ごとに要素として入る
        long[] revarray = new long[32];
        // x<0かどうか 0以下ならマイナス掛けて絶対値にする
        boolean isminus = false;

        // xを10で割るごとの結果が入ることになる変数 dx
        long dx = x;

        // オーバーフロー対策
        long longnum = 0;

    	//引数のint値がマイナスの場合は整数に戻す
    	if(dx < 0) {
    		dx = dx * -1;
    		isminus = true;}

        //xの値を10で割り、余りを配列要素に加える
        do {
        	revarray[keta] = dx%10;
        	keta++;
        	}
        	while((dx = dx/10) > 0);


        //配列の要素を一つの変数に桁を合わせて入れる
        for(int i = 0;i<keta;i++) {
        longnum = longnum*10;
        longnum += revarray[i];
        }

        if(isminus)
            longnum = -longnum;


        //-2^31 ~ 2^31 -1 ←32bit integer
        if(longnum<=-2147483648 || longnum>=2147483647) {
        	return 0;
        }
        revnum = (int)longnum;
        return revnum;


    }
    public static void main(String[] args) {
		System.out.println(reverse(-2147483648));
	}
}