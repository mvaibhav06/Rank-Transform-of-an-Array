class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], rank++);
            }
        }
        int[] out = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            out[i] = map.get(arr[i]);
        }
        return out;
    }
}
