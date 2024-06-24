class Solution {
    public int numUniqueEmails(String[] emails) {
         Set<String> set = new HashSet<>();

        for (String s : emails) {
            int atIndex = s.indexOf('@');
            String local = s.substring(0, atIndex);
            String domain = s.substring(atIndex);

            StringBuilder sb = new StringBuilder();

            for (char c : local.toCharArray()) {
                if (c == '.') {
                    continue;
                }
                if (c == '+') {
                    break;
                }
                sb.append(c);
            }

            sb.append(domain);
            set.add(sb.toString());
        }
        return set.size();
    }
}