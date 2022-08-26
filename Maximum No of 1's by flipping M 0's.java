//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    
    int findZeroes(int arr[], int n, int m) {
        int wL=0,wR=0;
        int bestL=0,bestWindow=0;
        int zeroCount=0;
        while(wR<arr.length)
        {
            if(zeroCount<=m)
            {
                if(arr[wR]==0)
                    zeroCount++;
                wR++;
            }
            if(zeroCount>m)
            {
                if(arr[wL]==0)
                    zeroCount--;
                wL++;
            }
            if((wR-wL>bestWindow)&&(zeroCount<=m))
            {
                bestWindow=wR-wL;
                bestL=wL;
            }
        }
        return bestWindow;
        
    }
}