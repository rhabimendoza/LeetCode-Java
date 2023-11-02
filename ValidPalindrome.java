class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        // Start of Solution
        String s1 = "", s2 = "";

        for(int ctr = 0; ctr < s.length(); ctr++){
            char c = s.charAt(ctr);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                s1 += c + "";
                s2 = c + s2;
            }
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        return (s1.equals(s2)? true : false);
        // End of Solution

    }
}
