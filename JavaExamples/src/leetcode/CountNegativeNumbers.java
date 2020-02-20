package leetcode;

public class CountNegativeNumbers {

    public static void main(String[] args) {
        CountNegativeNumbers count = new CountNegativeNumbers();

        int[][] arr = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(count.countNegatives(arr));
    }
    public int countNegatives(int[][] grid) {
        int count = 0;
        int len = grid.length;
        for (int i = 0 ; i < len; i++)
        {
            for(int j= 0; j< grid[i].length; j++)
            {
                if(grid[i][j] < 0)
                {
                    count = count + (grid[i].length - j);
                    break;
                }
            }
        }

        return count;

    }
}
