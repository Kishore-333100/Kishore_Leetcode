class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] seat:reservedSeats){
            int row = seat[0];
            int col = seat[1];
            if(!map.containsKey(row))
                map.put(row,new HashSet<>());
        map.get(row).add(col);
        }
        int ans = 2*n;
        for(int row:map.keySet()){
            Set<Integer> r = map.get(row);
            boolean left = !r.contains(2) && !r.contains(3) && !r.contains(4) && !r.contains(5);
             boolean middle = !r.contains(4) && !r.contains(5) && !r.contains(6) && !r.contains(7);
              boolean right = !r.contains(6) && !r.contains(7) && !r.contains(8) && !r.contains(9);
            if(left&&right)
            {

            }
            else if(left||middle||right) {
                ans--;
            }
            else{
                
            ans-=2;
            }
        }
        return ans;
    }
}