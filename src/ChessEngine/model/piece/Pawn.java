package ChessEngine.model.piece;

import java.util.LinkedList;
import java.util.List;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;

public class Pawn extends Piece {

	private static final int POINT_VAL = 1;

	public Pawn(Team team, Location loc) {
		super(Type.PAWN, team, POINT_VAL);
	}
	
	@Override
	public List<Move> getMoves(Location location) {
		Board board = Board.getBoard();
		List<Move> moves = new LinkedList<Move>();
		
		// If there is no piece on initial location, return empty list of moves.
		if (!location.isOccupied()) {
			return moves;
		}
		
		/*
		 * Implement piece specific logic in respective subclass...
		 */
		return moves;
	}
}
