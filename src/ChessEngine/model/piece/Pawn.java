package ChessEngine.model.piece;

import java.util.LinkedList;
import java.util.List;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Grid;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;

public class Pawn extends Piece {

	private static final int POINT_VAL = 1;

	public Pawn(Team team) {
		super(Type.PAWN, team, POINT_VAL);
	}

	@Override
	public List<Move> getMoves(Location loc) {
		Board board = Board.getBoard();
		Grid grid = board.getGrid();
		int row = loc.getRow();
		int col = loc.getCol();
		List<Move> moves = new LinkedList<Move>();

		// If there is no piece on initial location, return empty list of moves.
		if (!loc.isOccupied()) {
			return moves;
		}

		/*
		 * Implement piece specific logic in respective subclass...
		 */

		/**
		 * This section is for black peices
		 */
		if (this.getTeam() == Team.BLACK) {

			// If the pawn hasn't moved yet
			if (!getHasMoved()) {
				if (!grid.getLocation((row + 1), col).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 1), col)));
				}
				if (!grid.getLocation((row + 2), col).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 2), col)));
				}
				if ((col <= 6) || grid.getLocation((row + 1), (col + 1)).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 1), (col + 1))));
				}
				if ((col >= 1) || grid.getLocation((row + 1), (col - 1)).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 1), (col - 1))));
				}
				// If the pawn has moved
			} else {
				if (!grid.getLocation((row + 1), col).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 1), col)));
				}
				if ((col <= 6) || grid.getLocation((row + 1), (col + 1)).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 1), (col + 1))));
				}
				if ((col >= 1) || grid.getLocation((row + 1), (col - 1)).isOccupied()) {
					moves.add(new Move(Team.BLACK, loc, grid.getLocation((row + 1), (col - 1))));
				}
			}
		} else {
			// If the pawn hasn't moved yet
			if (!getHasMoved()) {
				if (!grid.getLocation((row - 1), col).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 1), col)));
				}
				if (!grid.getLocation((row - 2), col).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 2), col)));
				}
				if ((col <= 6) || grid.getLocation((row - 1), (col + 1)).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 1), (col + 1))));
				}
				if ((col >= 1) || grid.getLocation((row - 1), (col - 1)).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 1), (col - 1))));
				}
				// If the pawn has moved
			} else {
				if (!grid.getLocation((row - 1), col).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 1), col)));
				}
				if ((col <= 6) || grid.getLocation((row - 1), (col + 1)).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 1), (col + 1))));
				}
				if ((col >= 1) || grid.getLocation((row - 1), (col - 1)).isOccupied()) {
					moves.add(new Move(Team.WHITE, loc, grid.getLocation((row - 1), (col - 1))));
				}
			}
		}
		return moves;
	}
}
