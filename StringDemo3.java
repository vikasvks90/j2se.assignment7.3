/**
* <h1>StringDemo3</h1>
* This program demonstrates how we can find if a substring is present in
* a given string or not using user defined method
* @author  Vikas
* @version 1.0
* @since   2017-05-27 
*/
package assignment7.session3;

public class StringDemo3 {

	public static void main(String[] args) {
		String mainString = "Good Morning Everyone";//Given String
		String subStringToBeFound1 = "Morning";//substring to be found in given string
		String subStringToBeFound2 = "Bad";//substring to be found in given string
		boolean c;//will hold true if string is found
		System.out.println("The given string is: "+mainString);
		c = containString(mainString,subStringToBeFound1);
		if(c){
			System.out.println("'Morning' is present in the given string");
		}else{
			System.out.println("'Morning' is not present in the given string");
		}
		
		c = containString(mainString,subStringToBeFound2);
		if(c){
			System.out.println("'Bad' is present in the given string");
		}else{
			System.out.println("'Bad' is not present in the given string");
		}

	}
	
	//this is the user defined function to check if substring 
	//is present in the given string or not
	public static boolean containString(String a,String b){
		int m = a.length();//will hold the length of the given string
		int n = b.length();//will hold the length of the string to be found
		int max = m-n;//will hold the length till which we have to iterate the outer loop
		
		for(int i=0;i<max;i++){
			for(int j=0;j<n;j++){
				if(a.charAt(i+j) == b.charAt(j)){
					if (j == n - 1) {
	                    return true;
	                }
				}else{
					break;
				}
			}
		}
		return false;
	}

}
