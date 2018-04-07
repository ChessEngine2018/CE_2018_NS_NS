package ChessEngine.model.piece;

import java.util.LinkedList;
import java.util.List;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Grid;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;
import ChessEngine.model.piece.Piece.Team;

public class Knight extends Piece {

	private static final int POINT_VAL = 3;

	public Knight(Piece.Team team) {
		super(Piece.Type.KNIGHT, team, POINT_VAL);
	}

	/**
	 * Method returns a list of all the valid moves for the piece
	 * 
	 * @param loc
	 *            location of piece
	 */
	public List<Move> getMoves(Location loc) {

		int row = loc.getRow();
		int col = loc.getCol();
		Team team = this.getTeam();
		List<Move> moves = new LinkedList<Move>();
		
		if(!loc.isOccupied()) {
			return moves;
		}

		Board board = Board.getBoard();
		Grid grid = board.getGrid();

		/*
		 * Checks up and to the right
		 */
		if (((row + 2) < (8)) && ((col + 1) < 8)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row + 2), (col + 1))));
		}

		if (((row + 1) < (8)) && ((col + 2) < 8)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row + 1), (col + 2))));
		}

		
		/*
		 *  Checks up and to the left
		 */
		if (((row + 2) < (8)) && ((col - 1) >= 0)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row + 2), (col - 1))));
		}

		if (((row + 1) < 8) && ((col - 2) >= 0)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row + 1), (col - 2))));
		}

		/*
		 * Checks down and to the left
		 */
		if (((row - 2) >= 0) && ((col - 1) >= 0)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row - 2), (col - 1))));
		}

		if (((row - 1) >= 0) && ((col - 2) >= 0)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row - 1), (col - 2))));
		}

		/*
		 *  Checks down and to the right
		 */
		if (((row - 2) >= 0) && ((col + 1) < 8)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row - 2), (col + 1))));
		}

		if (((row - 1) >= 0) && ((col + 2) < 8)) {
			moves.add(new Move(this.getTeam(), loc, grid.getLocation((row - 1), (col + 2))));
		}

		return moves;
	}

}
