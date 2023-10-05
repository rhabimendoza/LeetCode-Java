class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        
        // Start of Solution
        String words[] = s.split(" ");
        String word = words[words.length - 1];

        return word.length();
        // End of Solution

    }
}
