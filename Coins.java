public class Main {
    public static void main(String args[]) {
        //Coins avilable array
        int[] arr={10, 20, 50, 100, 200, 500, 1000, 2000};
        int money=2000;//TOTAL VALUE to make

        System.out.println("Total ways to make Rs."+money+" are "+fun(arr,money));
    }
    //Here I have used the DP approach , In which i am trying to storing the answer of
    //ways to make money i ar dp[i]
    //which is calculated by 2 ways i.e selecting a coin and and find the already calculated ways of making money - coin[i]
    //So we get the final answer in dp last position index.
    public static int fun( int coins[] , int money ){ 
        int size=coins.length;
        int dp[]=new int[money+1]; 
        dp[0] = 1; 
        for(int i=0 ; i<size ; i++){ 
            for(int j=coins[i] ; j<=money ; j++){ 
                    dp[j]=dp[j] + dp[ j - coins[i] ]; 
            }
        }
        return dp[money]; 
    } 
}