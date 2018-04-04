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
	
	public Grid(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.locations[i][j] = new Location(i, j);
			}
		}
	}
	
	public Location getLocation(int row, int col) {
		if (row > rows || col > cols || row < 0 || col < 0) {
			throw new IllegalArgumentException("Cannot check location outside of grid");
		}
		return this.locations[row][col];
	}
	
	public void clearGrid() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				getLocation(row, col).setPiece(null);
			}
		}
	}
	
	public boolean isOccupied(int row, int col) {
		if (getLocation(row, col).getPiece() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	/*
	 * Moves piece to specified position. Does NOT contain logic that checks
	 * whether move is legal according to rules of chess
	 */
	public boolean move() { //TODO: Redo this method
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
}
