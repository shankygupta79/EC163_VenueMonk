public class Main {
    public static void main(String args[]) {
        int sum=1000;
        System.out.println("Product is "+ptriplet(sum));

    }
    public static long ptriplet(int sum){ 
          
        //As we alread know the sum we dont need third loop , we will find the variable as sum - i - j
        //And the other efficient approach is to loop till sum/3 for first one
        //And the other loop till sum/2 . If we find the triplet its good , Otherwise there exists no triplet.
        for (int i=1; i <= sum/3; i++){ 
            for (int j =i+1; j <= sum/2; j++) { 
                int x = sum-i-j;  //As we already know the sum
                if (i*i + j*j == x*x)  { 
                    System.out.println("Triplet is {"+i+","+j+","+x+"}"); 
                    return i*j*x; 
                } 
            } 
        }  
      
        System.out.print("Triplet Not Found"); 
        return -1;
    } 
}