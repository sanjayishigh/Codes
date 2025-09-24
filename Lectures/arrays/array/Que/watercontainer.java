// You are given an array h[] where each element represents the height of a vertical line drawn on the x-axis at that index.
// The task is to find two lines such that together with the x-axis they form a container that can hold the maximum amount of water.

// The container’s water-holding capacity is determined by the shorter of the two lines and the distance between them.

// Return the maximum water area possible.

// Example:
// Input: h = {1,8,6,2,5,4,8,3,7}
// Output: 49

// Explanation: The maximum container is formed between lines at indices 1 and 8 (heights 8 and 7), with width 8 - 1 = 7.
// So, water area = min(8,7) * 7 = 49.

public class watercontainer {
    public static int maxwater(int h[]){
        int maxarea = Integer.MIN_VALUE;
        int n = h.length;
        

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area = Math.min(h[i],h[j])*(j-i);
                maxarea = Math.max(area,maxarea);
            }
        }
             
        return maxarea;
    }
    public static void main(String args[]){
        int h[] = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxwater(h));
    }
}
