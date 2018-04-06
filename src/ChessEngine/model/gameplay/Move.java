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
	private Location start_position;
	private Location final_position;

	public Move(Piece.Team turn, Location start_position, Location final_position) {
		this.turn = turn;
		this.start_position = start_position;
		this.final_position = final_position;
	}
	
	public Piece.Team getTurn() {
		return this.turn;
	}
	
	public Location getStart() {
		return this.start_position;
	}
	
	public Location getFinal() {
		return this.final_position;
	}
}
