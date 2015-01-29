
public class DizilereDevam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ucboyutdizi[][][] = new int [3][4][5];//i,j,k//
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 4; j++)
			{
				
			
				for (int k = 0; k< 5; k++)
				
				  { ucboyutdizi[i][j][k]=(i+j+k)*2;   }
				
		}}
		
		
for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 4; j++)
			{
				
			
				for (int k = 0; k< 5; k++)
				
				  { System.out.print(ucboyutdizi[i][j][k]+" ");  }
				System.out.println();
				
			}
			System.err.println();
		
		
	}

	}}
