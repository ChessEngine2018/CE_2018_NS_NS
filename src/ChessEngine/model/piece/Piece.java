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

	private int pointValue;
	private Location location;

	public static enum Team {
		BLACK, WHITE
	};
	
	public Location getLocation() {
		return this.location;
	}

	protected Piece(int pointValue, Location location) {
		if (pointValue < 1 || pointValue > 4) {
			throw new IllegalArgumentException("Point value cannot be higher than four or lower than 1");
		}
		if (location == null) {
			throw new IllegalArgumentException("Cannot have a null location");
		}
		this.pointValue = pointValue;
		this.location = location;
	}

	public void move(Location location) {
		// TODO Auto-generated method stub
	}

}
