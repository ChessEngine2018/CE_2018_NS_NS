package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

public class Board {
	
	public Grid grid;
	
	public Board() {
		initBoard();
	}
	
	public void initBoard() {
		this.grid = new Grid(8, 8);
	}
	
	public void clear() {
		this.grid.clearGrid();
	}
	
	public void add(Piece p) {
		grid.add(p);
	}
	
	
}
