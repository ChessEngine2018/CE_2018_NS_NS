package ChessEngine.model.piece;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;

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
	
	// Does not need Location. A Location contains a Piece, not the other way around.
	protected Piece(Type type, Team team) {
		this.type = type;
		this.team = team;
	}
	
	protected List<Move> getMoves(Location location) {
		
	}

}
