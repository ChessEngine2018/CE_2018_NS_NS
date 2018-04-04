package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

/**
 * Class defines Location objects, which contain information about a space
 * on the board
 * 
 * @author Nathan Seamon
 * @author Neil Shah
 *
 */
public class Location {

	public int row;
	public int col;
	private Piece piece;
	private Grid grid;
	private boolean occupied;
	
	public Location(int r, int c, Piece p) {
		if (r > grid.rows || c > grid.cols || c < 0 || r < 0) {
			throw new IllegalArgumentException("Cannot create a Location outside of grid");
		}
		this.row = r;
		this.col = c;
		this.piece = p;
	}

	public Location(int r, int c) {
		new Location(r, c, null);
	}
	
	public Piece getPiece() {
		return this.piece;
	}
	
	public void setPiece(Piece p) {
		this.piece = p;
	}
}
