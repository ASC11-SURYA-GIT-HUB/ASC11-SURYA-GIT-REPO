class WordCount {
    public int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        // Split by one or more whitespace chars
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
