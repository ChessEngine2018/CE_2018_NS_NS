package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public class King extends Piece {
	private static final int POINT_VAL = 5;

	public King(Piece.Team team, Location loc) {
		super(Piece.Type.KING, team, loc, 5);
	}
}
