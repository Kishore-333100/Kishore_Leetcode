class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res= new char[s.length()];
        int i=0;
        for(int n:indices) res[n]=s.charAt(i++);
        return new String(res);
    }
}