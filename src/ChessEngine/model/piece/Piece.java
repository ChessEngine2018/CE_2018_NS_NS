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
	private Location location;
	private int pointValue;

	// Does not need Location. A Location contains a Piece, not the other way
	// around.
	protected Piece(Type type, Team team, Location loc, int pointValue) {
		if(type == null) {
			throw new IllegalArgumentException("Type cannot be null.");
		}
		if(team == null) {
			throw new IllegalArgumentException("Team cannot be null.");
		}
		if(pointValue < 1 || pointValue > 4) {
			throw new IllegalArgumentException("Point value must be between 1 and 5.");
		}
		this.type = type;
		this.team = team;
		this.location = loc;
	}
	
	public Piece.Type getType(){
		return this.type;
	}
	
	public Team getTeam() {
		return team;
	}

}
