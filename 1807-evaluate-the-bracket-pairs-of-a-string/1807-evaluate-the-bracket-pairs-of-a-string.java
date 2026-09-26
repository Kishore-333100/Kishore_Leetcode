class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();
        int n =s.length();
        Map<String,String> map = new HashMap<>();
        for(List<String> pairs:knowledge) map.put(pairs.get(0),pairs.get(1));
        int i=0;
        while(i<n){
            char ch = s.charAt(i);
            if(ch=='('){
                int start=i+1;
                while(i<n && s.charAt(i)!=')')i++;
                String key = s.substring(start,i);
                ans.append(map.getOrDefault(key,"?"));
            }else{
                ans.append(ch);
            }
            i++;
        }
        return ans.toString();
    }
}