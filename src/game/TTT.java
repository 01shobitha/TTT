package game;
//import javax.swing.*;

public class TTT {
	int user=1;
	int arr[][]=new int[3][3];
	


 public int Check()
 {
	 int whoWonR=rowDone();
	 int whoWonC=ColumnDone();
	 int whoWonD=DiagonalDone();
	 if(whoWonR==1||whoWonC==1||whoWonD==1)
	 {
		 System.out.println("player 1 wins");
		 return 1;
	 }

	 if(whoWonC==2||whoWonD==2||whoWonR==2)
	 {
		 System.out.println("player 2 wins");
		 return 2;
	 }
		 
	 else 
		 {
		 System.out.println("its a draw");
		 	return -1;
		 }
 }

 public void setVal(int i,int j)
 {
	 if(user==1)
	 {
		 arr[i][j]=1;
		 user=2;
		 return;
	 }
	 if(user==2)
	 {
		 arr[i][j]=2;
		 user=1;
		 return;
	 }
 }
 
 public int rowDone()
 {
	 for(int i=0;i<3;++i)
	 {
		 if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2] && arr[i][0]==1)
		 return 1;
		 if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2] && arr[i][0]==2)
		 return 2;
	 }
	 return -1;
 }
 
 public int ColumnDone()
 {
	 for(int i=0;i<3;++i)
	 {
		 if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i] && arr[0][i]==1)
		 return 1;
		 if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i] && arr[0][i]==2)
		 return 2;
		 
	 }
	 return -1;
 }
 
 public int DiagonalDone()
 {
		 if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2] && arr[0][0]==1)
			 return 1;
		 if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2] && arr[0][0]==2)
			 return 2;
		 
		 if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0] && arr[0][2]!=1)
			 return 1;
		 if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0] && arr[0][2]!=2)
			 return 2;
		return -1;	 
 }
 
}
