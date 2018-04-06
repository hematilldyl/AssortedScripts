/* Pick One

In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. 
We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). 
Height 0 is considered to be a building as well. At the end, the "skyline" when viewed from all four directions of the grid, 
i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. 
A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. 
What is the maximum total sum that the height of the buildings can be increased? */

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int[] maxTop = new int[grid.length];
        int[] maxSide = new int[grid[0].length];
        int max1 = 0;
        int max2 = 0;
        int sumPrior = 0;
        int sumAfter = 0;
        
        //calculate maxes
        for(int i = 0;i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                if(grid[i][j]>max1){
                    max1 =grid[i][j];
                }
                if(grid[j][i]>max2){
                    max2 = grid[j][i];
                }
                sumPrior +=grid[i][j];
                }
            //store the maxes
            maxTop[i] = max1;
            maxSide[i] = max2;
            //reset for next iteration
            max1 = 0;
            max2 = 0;
        }
        //replace the grid
        for(int i = 0;i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                if(maxSide[j]<=maxTop[i]){
                    grid[i][j] = maxSide[j];
                }else{
                    grid[i][j] = maxTop[i];
                }
                sumAfter += grid[i][j];
            }System.out.println(Arrays.toString(grid[i]));
        }
        
        sumAfter = sumAfter-sumPrior;
        return sumAfter;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
          return new int[0][0];
        }
    
        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
          JsonArray cols = jsonArray.get(i).asArray();
          arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[][] grid = stringToInt2dArray(line);
            
            int ret = new Solution().maxIncreaseKeepingSkyline(grid);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
