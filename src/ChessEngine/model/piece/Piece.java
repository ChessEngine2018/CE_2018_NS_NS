package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public abstract class Piece {

	private int point_value;
	private Location location;
	public static enum Team {BLACK, WHITE}; 
	
	protected Piece(int pointValue, Location location) {
		
	}
	
	
}
