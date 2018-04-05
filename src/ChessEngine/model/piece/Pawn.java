package ChessEngine.model.piece;

import java.util.ArrayList;

import ChessEngine.model.board.Board;
import ChessEngine.model.board.Location;
import ChessEngine.model.gameplay.Move;

public class Pawn extends Piece {

	private static final int POINT_VAL = 1;
	private boolean hasMoved;

	public Pawn(Piece.Team team, Location loc) {
		super(Piece.Type.PAWN, team, loc, POINT_VAL);
		hasMoved = false;
	}

	public void movedOnce() {
		hasMoved = true;
	}
	
	public boolean getHasMoved() { 
		return hasMoved;
	}
	
	public ArrayList<Move> getValidMoves() {
		Board board = Board.getBoard();
		if(this.team == Team.BLACK) {
			if(!hasMoved) {
				if()
			}
	}
}
