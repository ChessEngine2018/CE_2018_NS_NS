package ChessEngine.model.piece;

import ChessEngine.model.board.Location;

public class Queen extends Piece {
	
	private static final int POINT_VAL = 4;
	
	public Queen(Piece.Team team, Location loc) {
		super(Piece.Type.QUEEN, team, loc, POINT_VAL);
	}
}
