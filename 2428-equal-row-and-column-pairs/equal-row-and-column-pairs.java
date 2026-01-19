class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        Map<Integer, int[]> map=new HashMap<>();
        for(int i=0; i<grid.length; i++){
            map.put(i, grid[i]);
        }
        int rows=grid.length;
        int cols=grid[0].length;
        int trans[][]=new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                trans[j][i]=grid[i][j];
            }
        }
        for(int i=0;i<trans.length; i++){
            for(int row[] : map.values()){
                if(Arrays.equals(row,trans[i])){
                    count++;
                }
            }
        }
        return count;
    }
}