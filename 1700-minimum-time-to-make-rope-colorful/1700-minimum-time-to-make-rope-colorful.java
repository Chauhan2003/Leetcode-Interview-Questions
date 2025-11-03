class Solution {
    public int minCost(String colors, int[] neededTime) {
        if (colors.length() == 1) {
            return 0;
        }

        // int i=0;
        // int j=1;
        // int minCost = 0;

        // while (j<colors.length()) {
        //     if (colors.charAt(i) == colors.charAt(j)) {
        //         minCost += Math.min(neededTime[i], neededTime[j]);
        //     }

        //     i++;
        //     j++;
        // }

        // return minCost;

        int i=0;
        int minCost = 0;
        while (i < colors.length()) {

            int j=i+1;
            int maxSum = 0;
            int completeSum = 0;

            if (j<colors.length() && colors.charAt(i) == colors.charAt(j)) {
                maxSum = neededTime[i];
                completeSum = neededTime[i];
                while(j<colors.length() && colors.charAt(i) == colors.charAt(j)) {
                    completeSum += neededTime[j];
                    maxSum = Math.max(neededTime[j], maxSum);
                    j++;
                }
            }

            minCost += completeSum - maxSum;
            i=j;
        }

        return minCost;
    }
}