class PalindromeNumber {
    public boolean isPalindrome(int x) {
        
        // Start of Solution
        String a = x + "";
        String b = "";

        for(int ctr = 0; ctr < a.length(); ctr++){
            b = a.charAt(ctr) + b + "";
        }

        if(a.equals(b)){
            return true;
        }

        return false;
        // End of Solution
        
    }
}
