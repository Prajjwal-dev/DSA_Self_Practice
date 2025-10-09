import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        //Base Case
        if(words.length <= 0) {
            return result;
        }
        int index = 0;
        //Edge Case
        while(index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            // Greedy: fit as many words as possible
            while(last < words.length) {
                if(totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder sb = new StringBuilder();
            int gaps = last - index - 1;

            // Left justified
            if(last == words.length || gaps == 0) {
                for(int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if(i < last - 1) sb.append(" ");
                }
                sb.append(" ".repeat(maxWidth - sb.length()));
            } 
            else { // Fully justified
                int spaces = (maxWidth - totalChars) / gaps;
                int extra = (maxWidth - totalChars) % gaps;

                for(int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if(i < last - 1) {
                        sb.append(" ".repeat(spaces + 1));
                        if(extra-- > 0) sb.append(" ");
                    }
                }
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }
}
