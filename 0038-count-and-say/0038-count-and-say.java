class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int i = 1; i < n; i++) {

            StringBuilder ans = new StringBuilder();

            for (int j = 0; j < s.length();) {

                int k = j;

                while (k < s.length() && s.charAt(k) == s.charAt(j)) {
                    k++;
                }

                ans.append(k - j);
                ans.append(s.charAt(j));

                j = k;
            }

            s = ans.toString();
        }

        return s;
    }
}