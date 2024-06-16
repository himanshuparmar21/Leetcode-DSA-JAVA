class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int row = 0, col = 0;
        visited.add(row + "," + col);
        for(char ch : path.toCharArray()){
            if(ch == 'N'){
                row++;
            }else if(ch == 'E'){
                col++;
            }else if(ch == 'S'){
                row--;
            }else{
                col--;
            }
            if (!visited.add(row + "," + col)) {
                return true; 
            }
        }  
        return false;
    }
}