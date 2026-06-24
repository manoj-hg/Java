class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        long[] pref = new long[n];

        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int m = i / 2;
            long median = arr[m];

            long leftCost = median * (m + 1L) - pref[m];
            long rightSum = pref[i] - pref[m];
            long rightCost = rightSum - median * (i - m);

            ans.add((int)(leftCost + rightCost));
        }

        return ans;
    }
}