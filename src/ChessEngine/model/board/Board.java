package ChessEngine.model.board;
import ChessEngine.model.piece.Piece;

/**
 * Class defines game board and provides standard board operations.
 * 
 * @author Neil Shah
 * @author Nathan Seamon
 */
public class Board {
	
	public Grid grid;
	
	public Board() {
		reset();
	}
	
	/**
	 * If existing grid does not exist, initializes new empty Grid. Else clears the current grid.
	 */
	public void reset() {
		if (this.grid == null) {
			this.grid = new Grid(8, 8);
		} else {
			this.grid.clearGrid();
		}
	}
}
