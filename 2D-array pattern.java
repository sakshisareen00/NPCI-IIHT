import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    int flag=1;
	    int sum=0;
	    int n=4;
	    for(int i=0; i<n;i++){
	        
	        for(int j=0;j<=i;j++){
	            
	            for(int k=n-i; k>0; k--)
	                System.out.print(" ");
	            
	            System.out.print(flag+" ");
	            sum = sum + flag;
	        }
	        if(i==0)
	            flag=2;
	        else
	            flag=sum;
	        System.out.println("");
		}
	}
}
