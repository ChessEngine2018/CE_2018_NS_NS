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

	private int row;
	private int col;
	private Piece piece;
	
	public Location(int r, int c, Piece p) {
		if (r > 	7 || c > 7 || c < 0 || r < 0) {
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
	
	public boolean isOccupied() {
		if (this.getPiece() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void clear() {
		this.setPiece(null);
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
}
