package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//1D Array
		int i[]= new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		System.out.println(i[2]);
		//System.out.println(i[4]);
		
		System.out.println(i.length);
		
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("**************************************************");
		String x[][]= new String[3][5];
		System.out.println(x.length); //number of rows
		System.out.println(x[0].length); //number of columns
		
		//1st row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		//2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
	
		
		//3rd row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
	
		
		System.out.println(x[2][2]);
		
		for(int row=0; row<x.length;row++) {
			for(int col=0; col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
	}
	

}
