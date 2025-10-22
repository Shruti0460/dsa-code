class Wordsubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String b : words2)
        {
            for(char c: b.toCharArray())
            {
                maxFreq[c - 'a'] = Math.max(maxFreq[c - 'a'] , countChar(b ,c));
            }
        }
                List<String> result = new ArrayList<>();
                for(String a : words1)
                {
                    if(isUniversal(a,maxFreq))
                    {
                        result.add(a);
                    }
                }
                return result;
            }
            private int countChar(String word , char ch)
            {
                int count = 0;
                for(char c : word.toCharArray())
                {
                    if(c == ch)
                    {
                        count++;
                    } 
                }
                return count;
                

            }
            private boolean isUniversal(String word, int[] maxFreq)
            {
                int[] freq = new int[26];
                for(char c : word.toCharArray())
                {
                    freq[c - 'a']++;
                }
                for(int i = 0; i<26; i++)
                {
                    if(freq[i] < maxFreq[i])
                    {
                        return false;
                    }
                }
                return true;
            }
        
    
}
