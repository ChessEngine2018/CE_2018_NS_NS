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
	
	public Board() {
		reset();
	}
	
	/**
	 * If existing grid does not exist, initializes new empty Grid. Else clears the current grid.
	 */
	public void reset() {
		if (grid == null) {
			grid = new Grid(8, 8);
		} else {
			grid.clearGrid();
		}
	}
	
	public void add(int row, int col, Piece p) {
		grid.add(row, col, p);
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
