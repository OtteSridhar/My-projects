/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Pattern2
{
	public static void main(String[] args) {
	    for(int i=1;i<=4;i++){
	        for(int j=1;j<=5;j++){
	            if(i==1&&j==3){
	                System.out.print(" ");
	            }
	            
	            else if(i==2&&j==1){
	                System.out.print("$");
	        }
	        else if(i==2&&j==2){
	            System.out.print("π");
	        }
	        else{
	            System.out.print("*");
	    }
	            
	        }
	        System.out.println();
	    }
	}
}

	    
	   
	

