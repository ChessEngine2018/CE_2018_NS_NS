package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

/**
 * Class defines a grid of Location objects that represent spaces on the board, and
 * provides operations to edit grid
 */
public class Grid {

	private Location[][] locations;
	public int rows;
	public int cols;
	
	public Grid(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.locations[i][j] = new Location(i, j);
			}
		}
	}
	
	public void clearGrid() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.locations[i][j].setPiece(null);
			}
		}
	}

}
