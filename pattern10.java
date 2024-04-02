
/*write a program to display the given pattern
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/

package loopstatement;
 

public class pattern10 {

	public static void main(String[] args) {
		int space=4;
		int line=9;
		int star=1;
		for(int i=0; i<line; i++) {
			for(int k=0;k<space;k++)
			{
			System.out.print(" ");	
			
			}
			for(int j=0; j<star; j++)
			{
				System.out.print("* ");
			}
			if(i>3) {
				System.out.println();
				star--;
				space++;
			}
			else {
				System.out.println();
				star++;
				space--;
			}
		}

	}

}
