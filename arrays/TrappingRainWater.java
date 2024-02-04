public class TrappingRainWater {
    
    public static int trappedRainWater(int[] height) {
        int n = height.length;
        // calculate left maximum boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right maximum boundary - array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int j = n -2; j >= 0; j--) {
            rightMax[j] = Math.max(height[j], rightMax[j + 1]);
        }

        // calculate trapped rain water
        int trappedWater = 0;
        for (int k = 0; k < n; k++) {
            int waterLevel = Math.min(leftMax[k], rightMax[k]);
            trappedWater = trappedWater + (waterLevel - height[k]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total rain water trapped = " + trappedRainWater(height));
    }
}
