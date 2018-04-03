package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

public class Board {
	
	private Location[][] locations;
	private int rows = 8;
	private int cols = 8;
	
	public Board() {
		
	}
	
	
	/*
	 * Initializes board of dimension rows x cols with empty Location objects
	 */
	public void initBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				locations[i][j] = new Location(i, j, null);
			}
		}
	}
	
	public void add(Piece p) {
		
	}
	
	
}
