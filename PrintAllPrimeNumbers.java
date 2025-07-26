import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	   // System.out.print(N);
	    
	    printAllPrimeNumbers(N);
		
	}
	
	public static void printAllPrimeNumbers(int N){
	    
	    boolean arr[] = new boolean [N+1];
	    arr[0] = false;
	    arr[1] = false;
	    
	    for(int num=2; num <= N; num++){
	        
	        if(countFactors(num) == 2){
	            arr[num] = true;
	        }
	        else{
	            arr[num] = false;
	        }
	    }
	    
	    for(int i=0; i<=N; i++){
	        System.out.print(arr[i]);
	    }
	}
	
	public static int countFactors(int num){
	    int count = 0;
	    for(int i=1; i*i <=num; i++){
	        if(num%i==0){
	            if(num/i== i){
	                count++;
	            }
	            else{
	                count +=2;
	            }
	        }
	    }
	    return count;
	}
}
