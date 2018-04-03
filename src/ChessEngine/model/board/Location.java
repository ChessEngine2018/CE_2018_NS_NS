package ChessEngine.model.board;
import ChessEngine.model.piece.Piece;

/**
 * Class contains location objects, which has information about a specific
 * square on the board
 * 
 * @author Nathan Seamon
 *
 */
public class Location {
	
	private int row;
	private int col;
	private Piece piece;
	
	public Location(int r, int c, Piece p) {
		this.row = r;
		this.col = c;
		this.piece = p;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getCol() {
		return this.col;
	}
	
	public Piece getPiece() {
		return this.piece;
	}
}
