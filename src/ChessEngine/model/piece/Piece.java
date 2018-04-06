package ChessEngine.model.piece;

import java.util.List;
import java.util.LinkedList;

import ChessEngine.model.board.Board;
import ChessEngine.model.gameplay.Move;
import ChessEngine.model.piece.Piece.Team;
import ChessEngine.model.board.Location;

/**
 * Abstract class for piece. Piece objects have a location, a value, and a team.
 * Abstract methods allow for individualized game functionality by piece
 * abilities
 * 
 * @author Nathan Seamon
 * @author Neil Shah
 *
 */
public abstract class Piece {

	public static enum Type {
		KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN
	};
	
	public static enum Team {
		BLACK, WHITE
	};

	protected Type type;
	protected Team team;
	private int point_value;
	protected boolean has_moved;

	/**
	 * Abstract constructor for chess pieces. Use subclass constructors to create specific pieces.
	 * @param type Type of piece (King, Queen, Bishop, Knight, Rook, or Pawn)
	 * @param team Color of piece (Black or White)
	 * @param point_value Point value of piece (integer from 1 to 5)
	 */
	protected Piece(Type type, Team team, int point_value) {
		if(type == null) {
			throw new IllegalArgumentException("Type cannot be null.");
		}
		if(team == null) {
			throw new IllegalArgumentException("Team cannot be null.");
		}
		if(point_value < 1 || point_value > 4) {
			throw new IllegalArgumentException("Point value must be an integer from 1 to 5.");
		}
		this.type = type;
		this.team = team;
		this.point_value = point_value;
		this.has_moved = false;
	}
	
	public Piece.Type getType(){
		return this.type;
	}
	
	public Team getTeam() {
		return team;
	}
	
	public int getValue() {
		return this.point_value;
	}

	/**
	 * Abstract implementation. Searches board and returns possible moves for a piece. 
	 * Specific implementation logic included in subclass specific override of method. Each piece has
	 * unique logic that determines what moves are possible.
	 * @param location Start position of piece
	 * @return Linked List containing possible Move objects
	 */
	protected List<Move> getMoves(Location location) {
		List<Move> moves = new LinkedList<Move>();
		/*
		 * Implementing logic...
		 */
		return moves;
	}
}
