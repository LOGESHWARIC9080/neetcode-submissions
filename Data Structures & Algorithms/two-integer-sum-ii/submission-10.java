class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res= new int[2];
        int count=1;
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],count);
            count++;
        } 
        for(int i=0;i<numbers.length;i++){
            int rem= (target-numbers[i]);
            if( map.containsKey(rem)){
                res[0]=map.get(numbers[i]);
                res[1]=map.get(rem);
                break;
            }
            
        }
        return res;
    }
}
