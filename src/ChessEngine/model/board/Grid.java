package ChessEngine.model.board;

/*
 * Class defines a grid of Location objects that represent spaces on the board, and
 * provides operations to edit grid
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
	
	public void clearGrid() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.locations[i][j].setPiece(null);
			}
		}
	}
	
	public boolean isOccupied(int row, int col) {
		if (row > rows || col > cols || row < 0 || col < 0) {
			throw new IllegalArgumentException("Cannot check location outside of grid");
		}
		
		if (locations[row][col].getPiece() == null) {
			return false;
		} else {
			return true;
		}
	}
}
