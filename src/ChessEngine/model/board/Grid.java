package ChessEngine.model.board;

/**
 * Class defines a grid of Location objects that represents spaces on board,
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
	
	/**
	 * Returns the Location at the specified position on the Grid
	 * @param row target row
	 * @param col target column
	 * @return Location object at position (row, col) on Grid 
	 */
	public Location getLocation(int row, int col) {
		if (row > rows || col > cols || row < 0 || col < 0) {
			throw new IllegalArgumentException("Cannot check location outside of grid");
		}
		return this.locations[row][col];
	}
	
	/**
	 * Sets piece to null on all Location objects on the Grid
	 */
	public void clearGrid() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				getLocation(row, col).setPiece(null);
			}
		}
	}
	
	/**
	 * Checks specified position on Grid and determines whether the position is occupied
	 * @param row target row
	 * @param col target column
	 * @return true if position is unoccupied;
	 * false if position is occupied
	 */
	public boolean isOccupied(int row, int col) {
		return getLocation(row, col).isOccupied();
	}
	
	/**
	 * Replaces piece at Location A with piece at Location B. 
	 * Does not contain logic that checks whether move is legal according to rules of chess
	 * @param a Location A
	 * @param b Location B
	 */
	public void move(Location a, Location b) {
		b.setPiece(a.getPiece());
		a.setPiece(null);
	}
}
