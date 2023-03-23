import java.util.Scanner;

public class gameHelper {
	
	
	
	gameBoard board;	
	
	
	
	
	public void sayHello(){
		System.out.println("Hello!");
	}
	
	public gameHelper() {
		board = new gameBoard();
	}
	
	public char getWinner(){
		return board.getWinner();
	}
	
	public char getCellContents(int row, int col){
		return board.getCellContents(row, col);
	}
	
	public void drawBoard(){
		board.drawBoard();
	}
	
	
	
	public void playerXTurn(){
		
		int[] location = new int[2];
		
		Scanner input = new Scanner(System.in);
		int playerCol;
		int playerRow;
		
		do{
			do{
				System.out.println("Enter col for player X: ");
				playerCol = input.nextInt()-1;
				if(playerCol < 0 || playerCol > 2){
					System.out.println("Invalid Entry!");
				}
			} while (playerCol < 0 || playerCol > 2);
			
			location[0] = playerCol;
			
			do{
				System.out.println("Enter row for player X: ");
				playerRow = input.nextInt()-1;
				if(playerRow < 0 || playerRow > 2){
					System.out.println("Invalid Entry!");
				}
			} while (playerRow < 0 || playerRow > 2);
			
			location[1] = playerRow;
			
			if(board.getCellContents(location[1], location[0]) != 0){
				System.out.println("Invalid Entry!");
			}
		} while (board.getCellContents(location[1], location[0]) != 0);
		
		
		
		board.updateBoardX(location);
		
	}
	
	public void playerOTurn(){
		
		int[] location = new int[2];
		
		Scanner input = new Scanner(System.in);
		int playerCol;
		int playerRow;
		
		do{
			do{
				System.out.println("Enter col for player O: ");
				playerCol = input.nextInt()-1;
				if(playerCol < 0 || playerCol > 2){
					System.out.println("Invalid Entry!");
				}
			} while (playerCol < 0 || playerCol > 2);
			
			location[0] = playerCol;
			
			do{
				System.out.println("Enter row for player O: ");
				playerRow = input.nextInt()-1;
				if(playerRow < 0 || playerRow > 2){
					System.out.println("Invalid Entry!");
				}
			} while (playerRow < 0 || playerRow > 2);
			
			location[1] = playerRow;
			
			if(board.getCellContents(location[1], location[0]) != 0){
				System.out.println("Invalid Entry!");
			}	
		} while (board.getCellContents(location[1], location[0]) != 0);
		
		
		
		board.updateBoardO(location);
		
	}
	
	

	public boolean checkIfWin(){
		for(int i = 0; i<3; i++){
			if(board.getCellContents(i, 0) != 0 && board.getCellContents(i, 0) == board.getCellContents(i, 1) && board.getCellContents(i, 1) == board.getCellContents(i, 2)){
				board.setWinner(board.getCellContents(i, 0));
				return true;
			}
		}
		for(int i = 0; i<3; i++){
			if(board.getCellContents(0, i) != 0 && board.getCellContents(0, i) == board.getCellContents(1, i) && board.getCellContents(1, i) == board.getCellContents(2, i)){
				board.setWinner(board.getCellContents(0, i));
				return true;
			}
		}
		if(board.getCellContents(0, 0) != 0 && board.getCellContents(0, 0) == board.getCellContents(1, 1) && board.getCellContents(1, 1) == board.getCellContents(2, 2)){
			board.setWinner(board.getCellContents(0, 0));
			return true;
		}
		if(board.getCellContents(2, 0) != 0 && board.getCellContents(2, 0) == board.getCellContents(1, 1) && board.getCellContents(1, 1) == board.getCellContents(0, 2)){
			board.setWinner(board.getCellContents(2, 0));
			return true;
		}
		return false;
	}
	
	
	public boolean checkIfDraw(){
		
		boolean output = true;
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				if(board.getCellContents(i, j) == 0){
					output = false;
				}
			}
		}
		return output;
	}
	
}
