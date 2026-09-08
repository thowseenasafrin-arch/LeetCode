

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLen = words[0].length(), numWords = words.length;
        int sLen = s.length();
        if (sLen < wordLen * numWords) return result;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words) wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);

        for (int i = 0; i < wordLen; i++) {
            int left = i, count = 0;
            Map<String, Integer> window = new HashMap<>();

            for (int j = i; j <= sLen - wordLen; j += wordLen) {
                String word = s.substring(j, j + wordLen);

                if (wordCount.containsKey(word)) {
                    window.merge(word, 1, Integer::sum);
                    count++;

                    while (window.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    if (count == numWords) {
                        result.add(left);
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }
        return result;
    }

  
    }
