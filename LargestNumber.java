class Solution {
    public String largestNumber(int[] nums) {
        List<String> str = new ArrayList<>(nums.length);
        for (int num : nums) {
            str.add(Integer.toString(num));
        }
        str.sort(Solution::compareAsstr);
        StringBuffer sb = new StringBuffer();
        for (String s : str) {
            sb.append(s);
        }
        String re = sb.toString();
        int fd = 0;
        while (re.charAt(fd) == '0' && fd < re.length() - 1) {
            fd++;
        }
        
        return fd > 0 ? re.substring(fd) : re;
    }
    public static int compareAsstr(String left, String right) {

        if (left.length() != right.length()) {
            String origLeft = left;
            left = left + right;
            right = right + origLeft;
        }
        int diff = -left.compareTo(right);
        return diff;
        
    }
}
