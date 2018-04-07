package ChessEngine.model.piece;

import java.util.LinkedList;
import java.util.List;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Grid;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;
import ChessEngine.model.piece.Piece.Team;

public class Queen extends Piece {

	private static final int POINT_VAL = 4;

	public Queen(Piece.Team team) {
		super(Piece.Type.QUEEN, team, POINT_VAL);
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

		return null;
	}
}
