class Solution {
    public boolean wordPattern(String pattern, String s) {
        //Firsty split strings into words of string
        String[] words = s.split(" ");

        //Base Case
        if(pattern.length() != words.length) {
            return false;
        }

        //Edge Case
        //Use Hashmap here
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
           char ch = pattern.charAt(i);
           String word = words[i];

           if(charToWord.containsKey(ch)) {
            if(!charToWord.get(ch).equals(word)) {
                return false;
            }
           } else {
                charToWord.put(ch, word);
            }

            if(wordToChar.containsKey(word)) {
                if(wordToChar.get(word) != ch) {
                    return false;
                }
                } else {
                    wordToChar.put(word, ch);
                }
        }
        return true;
    }
}