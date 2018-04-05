package ChessEngine.model.board;

import ChessEngine.model.piece.*;

/**
 * Class defines game board and provides standard board operations.
 * 
 * @author Neil Shah
 * @author Nathan Seamon
 */
public class Board {

	public Grid grid;

	/**
	 * Initializes empty board.
	 */
	public Board() {
		reset();
	}

	/**
	 * If existing grid does not exist, initializes new empty Grid. Else clears the
	 * current grid.
	 */
	public void reset() {
		if (grid == null) {
			grid = new Grid(8, 8);
		} else {
			grid.clearGrid();
		}
	}

	/**
	 * Add specified piece at specified position. Does not check for logic.
	 * 
	 * @param row
	 *            target row
	 * @param col
	 *            target column
	 * @param p
	 *            piece
	 */
	public void add(int row, int col, Piece p) {
		grid.add(row, col, p);
	}

	/**
	 * Resets board and initializes board to standard layout.
	 */
	public void standardBoard() {
		reset();
		add(0, 0, new Rook(Piece.Team.BLACK, grid.getLocation(0, 0)));
		add(0, 1, new Knight(Piece.Team.BLACK, grid.getLocation(0, 1)));
		add(0, 2, new Bishop(Piece.Team.BLACK, grid.getLocation(0, 2)));
		add(0, 3, new Queen(Piece.Team.BLACK, grid.getLocation(0, 3)));
		add(0, 4, new King(Piece.Team.BLACK, grid.getLocation(0, 4)));
		add(0, 5, new Bishop(Piece.Team.BLACK, grid.getLocation(0, 5)));
		add(0, 6, new Knight(Piece.Team.BLACK, grid.getLocation(0, 6)));
		add(0, 7, new Rook(Piece.Team.BLACK, grid.getLocation(0, 7)));

		add(7, 0, new Rook(Piece.Team.WHITE, grid.getLocation(0, 0)));
		add(7, 1, new Knight(Piece.Team.WHITE, grid.getLocation(0, 1)));
		add(7, 2, new Bishop(Piece.Team.WHITE, grid.getLocation(0, 2)));
		add(7, 3, new Queen(Piece.Team.WHITE, grid.getLocation(0, 3)));
		add(7, 4, new King(Piece.Team.WHITE, grid.getLocation(0, 4)));
		add(7, 5, new Bishop(Piece.Team.WHITE, grid.getLocation(0, 5)));
		add(7, 6, new Knight(Piece.Team.WHITE, grid.getLocation(0, 6)));
		add(7, 7, new Rook(Piece.Team.WHITE, grid.getLocation(0, 7)));

		for (int col = 0; col < grid.cols; col++) {
			add(1, col, new Pawn(Piece.Team.BLACK, grid.getLocation(1, col)));
		}

		for (int col = 0; col < grid.cols; col++) {
			add(6, col, new Pawn(Piece.Team.WHITE, grid.getLocation(0, col)));
		}
	}

	public Grid getGrid() {
		return this.grid;
	}
}
