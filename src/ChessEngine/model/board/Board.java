package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

public class Board {
	
	public Grid grid;
	private Board board;
	private static final int ROWS = 8;
	private static final int COLS = 8;
	
	public Board() {
		
		initBoard();
	}
	
	/*
	 * Method initializes an empty Grid
	 */
	public void initBoard() {
		this.grid = new Grid(ROWS, COLS);
	}
	
	public void add(Piece p) {
		grid.add(p);
	}
	
	
}
