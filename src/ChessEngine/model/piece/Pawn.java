package ChessEngine.model.piece;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;

public class Pawn extends Piece {

	private static final int POINT_VAL = 1;

	public Pawn(Piece.Team team, Location loc) {
		super(Piece.Type.PAWN, team, loc, POINT_VAL);
		hasMoved = false;
	}
}
