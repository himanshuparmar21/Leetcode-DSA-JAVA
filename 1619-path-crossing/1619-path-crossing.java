class Solution {
    public boolean isPathCrossing(String path) {
       Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add(x + "," + y);
        for (char move : path.toCharArray()) {
            switch (move) {
                case 'N':
                    y += 1;
                    break;
                case 'S':
                    y -= 1;
                    break;
                case 'E':
                    x += 1;
                    break;
                case 'W':
                    x -= 1;
                    break;
            }
            if (!visited.add(x + "," + y)) {
                return true; 
            }
        }
        return false;  
    }
}