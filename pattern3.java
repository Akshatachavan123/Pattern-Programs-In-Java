
/*write a program to display pattern
*  *
 ** 
 ** 
*  *
display it !!
*/

package loopstatement;

public class pattern3 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0; j<4; j++) {
				if(i+j==3 || i==j) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
					} 
				}
			System.out.println();
		}
			
	}

}
/*
output:
*  *
 ** 
 ** 
*  *
**/

