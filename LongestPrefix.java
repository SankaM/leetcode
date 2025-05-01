public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String x = "";
        boolean m = true;
        for (int j = 0; j < first.length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() > j && strs[i].charAt(j) == first.charAt(j)) {
                    //x.add(first.charAt(j));
                } else {
                    m = false;
                    break;
                }
            }
            if (m) {
                x = x + String.valueOf(first.charAt(j));
            } else {
                break;
            }
        }
        return x;
    }
}

