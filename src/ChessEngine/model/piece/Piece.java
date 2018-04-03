package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public abstract class Piece {
	/**Point value*/
	private int pointValue;
	/**Location of piece*/
	private Location location;
	/** Piece team */
	public static enum Team {BLACK, WHITE};
	
	public Piece(int pointValue, Location location) {
		
	}
}
