class Solution {
    public String reorderSpaces(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        List<String> words = new ArrayList<>();
        int count = 0;
        int spaceCount = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != ' ') {
                count++;
            } else {
                if (count > 0) {
                    words.add(text.substring(i - count, i));
                    count = 0;
                }
                spaceCount++;
            }
        }

        if (count > 0) {
            words.add(text.substring(n - count, n));
        }

        StringBuilder sb = new StringBuilder();

        if (words.size() == 1) {
            sb.append(words.get(0));
            appendSpaces(sb, spaceCount);
            return sb.toString();
        }

        int evenSpaceCount = spaceCount / (words.size() - 1);
        int spacesLeft = spaceCount;

        for (int i = 0; i < words.size() - 1; i++) {
            sb.append(words.get(i));
            appendSpaces(sb, evenSpaceCount);
            spacesLeft -= evenSpaceCount;
        }

        sb.append(words.get(words.size() - 1));
        appendSpaces(sb, spacesLeft);

        return sb.toString();
    }

    private void appendSpaces(StringBuilder sb, int count) {
        for (int j = 0; j < count; j++) {
            sb.append(' ');
        }
    }
}
