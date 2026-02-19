class Solution {
    public String generateTag(String caption) {
       caption= caption.trim();
        String[] words = caption.split(" ");
        StringBuilder sb = new StringBuilder("#");

        for (int i = 0; i < words.length; i++) {
            
            if (words[i].isEmpty()) continue;

            String word = words[i].toLowerCase();

            if (i == 0) {
                sb.append(word);
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    sb.append(word.substring(1));
                }
            }
        }

        // Remove non-letters except '#'
        String result = sb.toString().replaceAll("[^a-zA-Z#]", "");

        // Truncate to 100 characters
        if (result.length() > 100) {
            result = result.substring(0, 100);
        }

        return result;
    }
}
