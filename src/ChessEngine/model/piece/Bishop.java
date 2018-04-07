package ChessEngine.model.piece;

import java.util.LinkedList;
import java.util.List;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Grid;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;
import ChessEngine.model.piece.Piece.Team;

public class Bishop extends Piece {

	private static final int POINT_VAL = 3;

	public Bishop(Piece.Team team) {
		super(Piece.Type.BISHOP, team, POINT_VAL);
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

		Board board = Board.getBoard();
		Grid grid = board.getGrid();

		/*
		 * Checks up and to the right
		 */
		int temp = 0;
		Boolean isRow = false;
		if (col > row) {
			temp = col;
		} else {
			temp = row;
			isRow = true;
		}
		
		Boolean inWay = false;
		while (!inWay) {
			int j = 0;
			if (isRow) {
				for (int i = temp; i < 8; i++) {
					j++;
					if (grid.getLocation(i, (col + j)) != null) {
						if (grid.getLocation(i, (col + j)).isOccupied()) {
							moves.add(new Move(team, loc, grid.getLocation(i, (col + j))));
							inWay = true;
						} else {
							moves.add(new Move(team, loc, grid.getLocation((row + j), i)));
						}
					}
				}
			} else {
				for (int i = temp; i < 8; i++) {
					j++;
					if (grid.getLocation((row + j), i) != null) {
						if (grid.getLocation((row + j), i).isOccupied()) {
							moves.add(new Move(team, loc, grid.getLocation((row + j), i)));
							inWay = true;
						} else {
							moves.add(new Move(team, loc, grid.getLocation((row + j), i)));
						}
					}
				}
			}
		}
		/*
		 * Checks down and to the left
		 */
		return moves;
	}
}
