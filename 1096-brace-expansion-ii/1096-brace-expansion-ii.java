class Solution {
        TreeSet<String> ans =new TreeSet<>();
        void search(String s){
            int c = s.indexOf('}');
            if(c==-1){
                ans.add(s);
                return;
            }
            int o = s.lastIndexOf('{',c);
            String left = s.substring(0,o);
            String right = s.substring(c+1);
            String middle = s.substring(o+1,c);
            for(String options:middle.split(",")){
                search(left+options+right);
            }

        }
        public List<String> braceExpansionII(String expression) {
        search(expression);
        return new ArrayList<>(ans);
    }
}