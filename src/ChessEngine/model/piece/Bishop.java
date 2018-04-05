package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public class Bishop extends Piece {

	private static final int POINT_VAL = 3;

	public Bishop(Piece.Team team, Location loc) {
		super(Piece.Type.BISHOP, team, loc, POINT_VAL);
	}

}
