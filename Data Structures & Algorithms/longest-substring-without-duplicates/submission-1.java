class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        int maxL=Integer.MIN_VALUE;

        for(int right=0;right<s.length();right++){

            char c=s.charAt(right);

            while(hs.contains(c)){

                char ch=s.charAt(left);
                hs.remove(ch);
                left++;
            }
            hs.add(c);
            maxL=Math.max(maxL,right-left+1);
        }

        return (maxL==Integer.MIN_VALUE) ? 0 : maxL;
    }
}
