package ChessEngine.model.gameplay;
import ChessEngine.model.board.*;
import ChessEngine.model.piece.Piece;
/**
 * Class defines Move objects, which contain information about each move. This includes:
 * pieces involved and validity of move.
 * 
 * Contains logic that determines whether a move is valid according to the rules of chess.
 * 
 * @author Neil Shah
 * @author Nathan Seamon
 *
 */
public class Move {
	
	private Board board;
	private Piece.Team turn;
	private Location initial;
	private Location target;
	private boolean valid;
	
	public Move(Board board, Piece.Team turn, Location initial_location, Location target_location) {
		this.board = board;
		this.turn = turn;
		this.initial = initial_location;
		this.target = target_location;
	}
	
	private boolean isValid() {
		// Initial piece must exist
		if (!(initial.isOccupied())) {
			return false;
		}
		// TODO: Add logic. Need to add possible/legal moves for piece.
		return true;
	}
	
}
