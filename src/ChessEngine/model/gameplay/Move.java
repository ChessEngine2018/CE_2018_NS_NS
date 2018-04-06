package ChessEngine.model.gameplay;

import ChessEngine.model.board.*;
import ChessEngine.model.piece.Piece;

/**
 * Class defines Move objects, which contain information about each move.
 * 
 * @author Neil Shah
 * @author Nathan Seamon
 *
 */
public class Move {

	private Piece.Team turn;
	private Location initial;
	private Location target;

	public Move(Piece.Team turn, Location initial_location, Location target_location) {
		this.turn = turn;
		this.initial = initial_location;
		this.target = target_location;
	}
	
}
