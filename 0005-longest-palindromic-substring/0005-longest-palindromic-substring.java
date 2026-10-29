class Solution {
    static int maxl=1;
    static int sp=0;
    static int ep=0;

    static void pc(char[]a, int j, int k,int n){
        while(j>=0 && k<=n-1){
            if(a[j]==a[k] && maxl<k-j+1){
                    maxl=k-j+1;
                    sp=j;ep=k;}
            if(a[j]==a[k]){
                j--;k++;
                continue;
            }
            else{break;}
            }
    }
    public String longestPalindrome(String s) {
        char []a=s.toCharArray();
        int n=s.length();
        int j=0,k=0;
        for(int i=0;i<n;i++){
            pc(a,i,i,n);
            pc(a,i,i+1,n);
        }
        String ans=s.substring(sp,ep+1);
        maxl=1;sp=0;ep=0;
        return ans;
    }
}