class FloodFill {
// 733.problems/flood-fill/
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        HashSet<String> visited = new HashSet<>();
        int oldColor = image[sr][sc];
        if(oldColor != newColor) backTrack(image, visited, sr, sc, oldColor, newColor);
        return image;
    }
    
    public void backTrack(int[][] image, HashSet<String> visited, int r, int c, int oldColor, int newColor)
    {
        String currentIndex = String.format("%1d%2d", r, c);  
        if(r < 0 || c < 0 || r > image.length || c > image[0].length || !visited.add(currentIndex) || image[r][c] != oldColor)
            return;
        
        if(image[r][c] == oldColor)
            image[r][c] = newColor;
        
        if(r < image.length - 1 && image[r+1][c] == oldColor)
            backTrack(image, visited, r+1, c, oldColor, newColor);
        if(r >= 1 && image[r-1][c] == oldColor)
           backTrack(image, visited, r-1, c, oldColor, newColor);
        if(c < image[0].length - 1 && image[r][c+1] == oldColor)
            backTrack(image, visited, r, c+1, oldColor, newColor);
        if(c >= 1 && image[r][c-1] == oldColor)
            backTrack(image, visited, r, c-1, oldColor, newColor);
    }
}
