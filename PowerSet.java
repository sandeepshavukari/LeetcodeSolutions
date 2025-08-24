public class PowerSet {
    static void powerSet(int[] arr, int index, List<Integer> curr, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(curr));
            return;
        } 
        curr.add(arr[index]);
        powerSet(arr, index + 1, curr, result); 
        curr.remove(curr.size() - 1); 
        powerSet(arr, index + 1, curr, result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        powerSet(nums, 0, new ArrayList<>(), result);  
        return result;
    }
}
