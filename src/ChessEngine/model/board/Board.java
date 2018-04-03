package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

public class Board {
	
	public Grid grid;
	
	public Board() {
		initBoard();
	}
	
	/*
	 * Method initializes an empty Grid
	 */
	public void initBoard() {
		this.grid = new Grid(8, 8);
	}
	
	public void clear() {
		this.grid.clearGrid();
	}
	
	public void add(Piece p) {
		
	}
	
	
}
