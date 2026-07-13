class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int len=temperatures.length;
        int[] arr=new int[len];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    arr[i]=j-i;
                    break;
                }
            }
            
        }
       return arr; 
    }
}
