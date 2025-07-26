import java.util.*;

// Sieve of Eratosthenes
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    boolean isPrime[] = new boolean [N+1];
	    
	    // Mark all As True
	    Arrays.fill(isPrime, true);
	    isPrime[0] = false;
	    isPrime[1] = false;
	    
	    // if a Number is marked as true(prime) then all it's multiple should be marked as Not prime.
	    for(int i=2; i*i<=N; i++){
	        
	        if(isPrime[i] == true){
	            for(int j = i*i; j <=N; j +=i){
	                 isPrime[j] = false;
	            }
	        }
	    }
	    
	    // print the prime numbers
	    for(int i=2; i<=N; i++){
	        if(isPrime[i])
	            System.out.println(i);
	    }
		
	}
	
	// TC => N * log(log N)
	//  N = 2 ^ 32
	// log(logbase 2 2^32)  = 5	
	
}
