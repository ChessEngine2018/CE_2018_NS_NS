package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public class Knight extends Piece {
	
	private static final int POINT_VAL = 3;
	
	public Knight(Piece.Team team, Location loc) {
		super(Piece.Type.KNIGHT, team, loc, POINT_VAL);
	}

}
