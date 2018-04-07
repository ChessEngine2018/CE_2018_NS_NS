package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public class King extends Piece {
	private static final int POINT_VAL = 5;

	public King(Piece.Team team) {
		super(Piece.Type.KING, team, 5);
	}
}
