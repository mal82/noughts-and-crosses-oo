
public class gameBoard {

	private char[][] board;
	private char winner;
	
	public gameBoard() {
		this.board = new char[3][3];
		
		
	}
	
	public void setWinner(char winner){
		this.winner = winner;
	}
	
	public char getWinner(){
		return winner;
	}
	
	public char getCellContents(int row, int col){
		return this.board[row][col];
	}
	
	public void drawBoard(){
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(board[row][col]);
				if(col<2){
					System.out.print("|");
				}
			}
			System.out.println();
			if(row<2){
				System.out.println("-----");
			}
		}
	}
	
	public void updateBoardX(int [] location){
		board[location[1]][location[0]] = 'x';
	}
	
	public void updateBoardO(int [] location){
		board[location[1]][location[0]] = 'o';
	}
	
	

}
