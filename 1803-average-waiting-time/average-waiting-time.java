class Solution {
    public double averageWaitingTime(int[][] customers) {
        double result=0;
        double n=customers.length;
        double waitingTime=0;
        int currentTime=customers[0][0];
        for(int i=0; i<customers.length; i++)
        {
            currentTime=Math.max(customers[i][0],currentTime);
            currentTime=currentTime+customers[i][1];
            waitingTime=waitingTime+ (currentTime-customers[i][0]);
        }
        result=waitingTime/n;
        return result;
    }
}