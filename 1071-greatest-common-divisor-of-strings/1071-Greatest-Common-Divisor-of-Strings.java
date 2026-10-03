class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int a = Math.max(str1.length(), str2.length());
        int b = Math.min(str1.length(), str2.length());
        int mx = Math.max(str1.length(), str2.length());

        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }

        int gcd = a;
        String candidate = str1.substring(0,gcd);

        for(int i =0; i<mx; i+=gcd){
            if((i < str1.length()) && !str1.substring(i, i+gcd).equals(candidate)){
                return "";
            }

            if((i < str2.length()) && !str2.substring(i, i+gcd).equals(candidate)){
                return "";
            }
        }

        return candidate;

    }
}