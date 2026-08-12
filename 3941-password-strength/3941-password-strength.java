class Solution {
    public int passwordStrength(String s) {
        Set<Character>set=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)) continue;
            if(ch>='a'&&ch<='z') res++;
            else if(ch>='A'&&ch<='Z') res+=2;
            else if(ch>='0'&&ch<='9') res+=3;
            else  res+=5;
            set.add(ch);
        }
        return res;
    }
}