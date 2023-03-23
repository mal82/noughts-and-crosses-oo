
public class gameLogic {

	
	private gameHelper helper;
	
	//Constructor creates the game helper
	public gameLogic() {
		helper = new gameHelper();
	}
	
	
	// method for game logic to conclusion of game
	public void runGame(){
		
		helper.drawBoard();
		while(helper.getWinner() == 0){
			
			helper.playerXTurn();
			helper.drawBoard();
			if(helper.checkIfWin() || helper.checkIfDraw()){
				break;
			}
			helper.playerOTurn();
			helper.drawBoard();
			if(helper.checkIfWin() || helper.checkIfDraw()){
				break;
			}
			
		}
		System.out.println();
		if(helper.checkIfDraw()){
			System.out.println("It's a draw!");
		} else {
			System.out.println(helper.getWinner() + " wins!");
		}
		
	}

}
