class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer>m=new HashMap();
        long res=0;
        for(var ele:rectangles){
            Double ratio =(double)ele[0]/ele[1];
            if(m.containsKey(ratio)){
                res+=m.get(ratio);
                m.put(ratio,m.get(ratio)+1);
            }else{
                m.put(ratio,1);
            }
        }
        return res;
    }
}