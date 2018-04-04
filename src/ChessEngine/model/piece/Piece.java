package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

/**
 * Abstract class for piece. Piece objects have a location, a value, and a team.
 * Abstract methods allow for individualized game functionality by piece
 * abilities
 * 
 * @author Nathan Seamon
 * @author Neil Shah
 *
 */
public abstract class Piece {

	public static enum Type {
		KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN
	};
	
	public static enum Team {
		BLACK, WHITE
	};

	protected Type type;
	protected Team team;
	
	protected Piece(Type type, Team team) {
		this.type = type;
		this.team = team;
	}
	
	public void move(Location location) {
		// TODO Auto-generated method stub
	}

}
