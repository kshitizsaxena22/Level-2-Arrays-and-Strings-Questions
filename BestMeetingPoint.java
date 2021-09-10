import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~
    public static int minTotalDistance(int[][] grid) {
        //1->Find all the x cordinated by travellign in row
        ArrayList<Integer> xcord = new ArrayList<>();
        for(int i =0 ;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    xcord.add(i);
                }
            }
        }
        
        //2->Find all the y coordinates by travelling in column
        ArrayList<Integer> ycord = new ArrayList<>();
        for(int j =0 ;j<grid[0].length;j++)
        {
            for(int i = 0;i<grid.length;i++)
            {
                if(grid[i][j] == 1)
                {
                    ycord.add(j);
                }
            }
        }
        
        //3->Find the mid in these lists as these are the medians
        
        int xmid = xcord.get(xcord.size()/2);
        int ymid = ycord.get(ycord.size()/2);
        
        //4->Find the distance from the median of each coordinate
        int dist = 0;
        for(int xval:xcord)
        {
            dist += Math.abs(xmid - xval); 
        }
        for(int yval:ycord)
        {
            dist += Math.abs(ymid - yval); 
        }
        //5->return the distance
        
        return dist;
    }

    // ~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();


        int[][] grid = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = scn.nextInt();
            }
        }

        int dist = minTotalDistance(grid);
        System.out.println(dist);
    }
}