package ChessEngine.model.board;

import ChessEngine.model.piece.Piece;

/**
 * Class contains location objects, which has information about a specific
 * square on the board
 * 
 * @author Nathan Seamon
 *
 */
public class Location {

	private int row;
	private int col;
	private Piece piece;
	private Boolean occupied;
	private Board grid;

	public Location(int r, int c, Piece p) {
		if (r > 7 || c > 7 || c < 0 || r < 0) {
			throw new IllegalArgumentException();
		}
		this.row = r;
		this.col = c;
		this.piece = p;
		if (piece == null) {
			occupied = false;
		} else {
			occupied = true;
		}
	}

	public Location(int r, int c) {
		new Location(r, c, null);
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public Piece getPiece() {
		return this.piece;
	}

	public Boolean isOccupied() {
		return occupied;
	}

	/**
	 * Method moves piece to specified location EMPTY location, and returns whether
	 * or not operation could be carried out
	 * 
	 * @param location
	 *            location to move piece to
	 * @return whether or not action was carried out
	 */
	public boolean moveToEmptyGrid(Location location) {
		if (location.isOccupied()) {
			return false;
		} else {
			this.piece.move(location);
			grid.add(piece);
			this.piece = null;
			occupied = false;
			return true;
		}
	}

	public boolean takePiece() {
		return false;
	}

	public void add() {

	}
}
