import java.util.*;

// Given N, return an Array containing count of factors from 1 to N.
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	   int res[] =  ArrayContaingFactors(N);
	}
	
	public static int[] ArrayContaingFactors(int N){
	    
	    int factors[] = new int[N+1];
	    Arrays.fill(factors, 1);
	    factors[0] = 1;
	    factors[1] = 1;
	    
	    for(int i=2; i<=N; i++){
	        factors[i] = factors[i]+1;
	        for(int j = 2*i; j<=N; j +=i){
	            factors[j] = factors[j]+1;
	        }
	    }
	    
	    for (int i =0;i<=N ;i++ ){
	        System.out.print(factors[i]+" ");
	    } 
	    return factors;
	}
	
	
}
