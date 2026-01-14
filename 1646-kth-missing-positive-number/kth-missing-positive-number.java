class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> Al = new ArrayList<>();
        int j = 0; 

        for (int i = 1; Al.size() < k; i++) {
            if (j < arr.length && arr[j] == i) {
                j++; 
            } else {
                Al.add(i); 
            }
        }
        return Al.get(k - 1);
    }
}
