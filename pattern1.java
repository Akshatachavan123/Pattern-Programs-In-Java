
/*write a program to display pattern
*****
*   *
*   *
*****
display it !!
*/

package loopstatement;

public class pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0; j<4; j++) {
				if(i==3 || j==3 ||i==0 ||j==0) {
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
****
*  *
*  *
****
**/

