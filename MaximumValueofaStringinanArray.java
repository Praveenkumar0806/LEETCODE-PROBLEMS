class MaximumValueofaStringinanArray{
    public int maximumValue(String[] strs) {
       int max = 0;
        
        for (String s : strs) {
            boolean isNumeric = true;
            
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    isNumeric = false;
                    break;
                }
            }
            
            int currentVal = isNumeric ? Integer.parseInt(s) : s.length();
            
            if (currentVal > max) {
                max = currentVal;
            }
        }
		return max;
    }
}