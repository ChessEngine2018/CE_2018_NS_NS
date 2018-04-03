package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

/**
 * Class defines a grid of Location objects that represent spaces on the board,
 * and provides operations to edit grid
 * 
 * @author Nathan Seamaon
 * @author Neil Shah
 */
public class Grid {

	private Location[][] locations;
	public int rows;
	public int cols;

	/**
	 * Constructs a new grid with specified rows and cols. Rows must equal cols
	 * 
	 * @param rows
	 *            number of rows in grid
	 * @param cols
	 *            number of cols in gird
	 */
	public Grid(int rows, int cols) {
		if (rows < 1 || cols < 1) {
			throw new IllegalArgumentException("Cannot have rows/cols less than one.");
		}
		if (rows != cols) {
			throw new IllegalArgumentException("The number of rows must match the number of cols.");
		}
		this.rows = rows;
		this.cols = cols;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.locations[i][j] = new Location(i, j);
			}
		}
	}

	/**
	 * Clears all pieces from board
	 */
	public void clearGrid() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.locations[i][j].setPiece(null);
			}
		}
	}

	/**
	 * Occupies a given grid location, based on a piece parameter. The piece is
	 * added at its instance of location
	 * 
	 * @param p
	 *            piece to add
	 */
	public void add(Piece p) {
		if (p == null) {
			throw new IllegalArgumentException("Cannot add null piece");
		}
		Location loc = p.getLocation();
		locations[loc.getRow()][loc.getCol()] = loc;
	}

}
