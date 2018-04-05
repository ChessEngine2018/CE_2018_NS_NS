package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public class Pawn extends Piece {

	private static final int POINT_VAL = 1;
	private boolean hasMoved;

	public Pawn(Piece.Team team, Location loc) {
		super(Piece.Type.PAWN, team, loc, POINT_VAL);
		hasMoved = false;
	}

	public void movedOnce() {
		hasMoved = true;
	}
}
