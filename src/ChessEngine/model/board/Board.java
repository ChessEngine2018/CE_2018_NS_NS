package ChessEngine.model.board;

import ChessEngine.model.piece.*;

/**
 * Class defines game board and provides standard board operations.
 * 
 * @author Neil Shah
 * @author Nathan Seamon
 */
public class Board {

	private Grid grid;
	private static Board board;
	
	/**
	 * To access board, use getBoard() to retrieve current instance of board.
	 * See also {@link #getBoard()}
	 */
	private Board() {
		grid = new Grid(8, 8);
	}
	
	/**
	 * Board is implemented using Singleton pattern. One instance of board is maintained. If no instance exists, creates a new instance.
	 * @return Current instance of board
	 */
	public static Board getBoard() {
		if(board == null) {
			board = new Board();
		}
		return board;
	}
	
	public Grid getGrid() {
		return this.grid;
	}
	
	/**
	 * Clears current instance of board. If board does not exist, will create a new instance of board.
	 */
	public void reset() {
		getBoard().getGrid().clearGrid();
	}

	/**
	 * Add specified piece at specified position. Does not check for logic.
	 * @param row target row
	 * @param col target column
	 * @param p piece
	 */
	public void add(int row, int col, Piece p) {
		grid.add(row, col, p);
	}
	
	/**
	 * Searches the board and returns the Location and the specified position.
	 * @param row target row
	 * @param col target col
	 * @return Location object at specified position
	 */
	public Location search(int row, int col) {
		return getGrid().getLocation(row, col);
	}

	/**
	 * Resets board and initializes board to standard layout.
	 */
	public void standardBoard() {
		reset();
		add(0, 0, new Rook(Piece.Team.BLACK));
		add(0, 1, new Knight(Piece.Team.BLACK));
		add(0, 2, new Bishop(Piece.Team.BLACK));
		add(0, 3, new Queen(Piece.Team.BLACK));
		add(0, 4, new King(Piece.Team.BLACK));
		add(0, 5, new Bishop(Piece.Team.BLACK));
		add(0, 6, new Knight(Piece.Team.BLACK));
		add(0, 7, new Rook(Piece.Team.BLACK));

		add(7, 0, new Rook(Piece.Team.WHITE));
		add(7, 1, new Knight(Piece.Team.WHITE));
		add(7, 2, new Bishop(Piece.Team.WHITE));
		add(7, 3, new Queen(Piece.Team.WHITE));
		add(7, 4, new King(Piece.Team.WHITE));
		add(7, 5, new Bishop(Piece.Team.WHITE));
		add(7, 6, new Knight(Piece.Team.WHITE));
		add(7, 7, new Rook(Piece.Team.WHITE));

		for (int col = 0; col < grid.cols; col++) {
			add(1, col, new Pawn(Piece.Team.BLACK));
		}

		for (int col = 0; col < grid.cols; col++) {
			add(6, col, new Pawn(Piece.Team.WHITE));
		}
	}
	
}
