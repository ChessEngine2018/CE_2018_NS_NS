package ChessEngine.model.piece;

import java.util.LinkedList;
import java.util.List;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Grid;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;

public class Rook extends Piece {

	private static final int POINT_VAL = 3;

	public Rook(Piece.Team team, Location loc) {
		super(Piece.Type.ROOK, team, POINT_VAL);
	}

	/**
	 * Returns a list of possible moves for rooks
	 * 
	 * @param loc
	 *            location of piece to get moves for
	 */
	public List<Move> getMoves(Location loc) {
		int row = loc.getRow();
		int col = loc.getCol();
		Team team = this.getTeam();
		List<Move> moves = new LinkedList<Move>();

		Board board = Board.getBoard();
		Grid grid = board.getGrid();

		// Checks one side east to west
		Boolean pieceInWay = false;
		while (!pieceInWay) {
			for (int i = (col - 1); i >= 0; i--) {
				if (grid.getLocation(row, i).isOccupied()) {
					moves.add(new Move(team, loc, grid.getLocation(row, i)));
					pieceInWay = true;
				} else {
					moves.add(new Move(team, loc, grid.getLocation(row, i)));
				}
			}
		}

		// Checks the other side east to west
		pieceInWay = false;
		while (!pieceInWay) {
			for (int i = col; i < 8; i++) {
				if (grid.getLocation(row, i).isOccupied()) {
					moves.add(new Move(team, loc, grid.getLocation(row, i)));
					pieceInWay = true;
				} else {
					moves.add(new Move(team, loc, grid.getLocation(row, i)));
				}
			}
		}

		// Checks one direction from north to south
		pieceInWay = false;
		while (!pieceInWay) {
			for (int i = row; i < 8; i++) {
				if (grid.getLocation(i, col).isOccupied()) {
					moves.add(new Move(team, loc, grid.getLocation(i, col)));
					pieceInWay = true;
				} else {
					moves.add(new Move(team, loc, grid.getLocation(i, col)));
				}
			}
		}

		// Checks other way north to south
		pieceInWay = false;
		while (!pieceInWay) {
			for (int i = (row - 1); i >= 0; i--) {
				if (grid.getLocation(i, col).isOccupied()) {
					moves.add(new Move(team, loc, grid.getLocation(i, col)));
					pieceInWay = true;
				} else {
					moves.add(new Move(team, loc, grid.getLocation(i, col)));
				}
			}
		}

		return moves;
	}
}
