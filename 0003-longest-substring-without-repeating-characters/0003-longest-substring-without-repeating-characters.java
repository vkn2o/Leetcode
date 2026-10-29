class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> hm=new HashMap<>();
        int n=s.length();
        int maxl=0;
        int i=0,j=0;
        while(j<n){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            while(hm.get(s.charAt(j))>1){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                i++;
            }
            maxl=Math.max(maxl,j-i+1);
            j++;
        }
        return maxl;
    }
}