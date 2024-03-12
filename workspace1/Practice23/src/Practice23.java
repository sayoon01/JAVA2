
public class Practice23 {

	public static void main(String[] args) {
		int[][] s = new int[3][4];

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
				s[i][j] = i*10 + j+1;
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
				System.out.print(s[i][j]+"\t");
			System.out.println();
		}
	}

}
