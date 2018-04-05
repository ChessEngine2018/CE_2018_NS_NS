package ChessEngine.model.piece;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Location;

public class Rook extends Piece {
	
	private static final int POINT_VAL = 3;
	
	public Rook(Piece.Team team, Location loc) {
		super(Piece.Type.ROOK, team, loc, POINT_VAL);
	}
	
}
