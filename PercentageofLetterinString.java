class PercentageofLetterinString{
    public int percentageLetter(String s, char ch) {
       int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        return (count * 100) / s.length();
    }
}