package ChessEngine.board;

public class Board {
	/** Instance of chess board */
	private static Board instance;
	/** Chess board grid */
	private static Location[][] grid;
	/** Number of black pawns */
	private static int numBPawns;
	/** Number of black Rooks */
	private static int numBRooks;
	/** Number of black bishops */
	private static int numBBishops;
	/** Number of black knights */
	private static int numBKnights;
	

	/**
	 * Returns instance of chess board, if it is null a new instance is created
	 * 
	 * @return instance of chess board
	 */
	public Board getInstance() {
		if (instance == null) {
			instance = new Board();
		}
		return instance;
	}

	/**
	 * Creates a new chess board with empty locations
	 */
	private Board() {
		Location[][] grid = new Location[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				grid[i][j] = new Location(i, j);
			}
		}
		this.grid = grid;
	}
}
