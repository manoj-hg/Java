class Solution {
    String chooseSwap(String s) {
        int[] first = new int[26];
        Arrays.fill(first, -1);

        for (int i = 0; i < s.length(); i++) {
            if (first[s.charAt(i) - 'a'] == -1) {
                first[s.charAt(i) - 'a'] = i;
            }
        }

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i] - 'a';

            for (int ch = 0; ch < cur; ch++) {
                if (first[ch] > first[cur]) {
                    char a = arr[i];
                    char b = (char) ('a' + ch);

                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == a) {
                            arr[j] = b;
                        } else if (arr[j] == b) {
                            arr[j] = a;
                        }
                    }

                    return new String(arr);
                }
            }
        }

        return s;
    }
}