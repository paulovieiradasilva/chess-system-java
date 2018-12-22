package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	/**
	 * Returns the possible moves
	 * 
	 * @return
	 */
	public abstract boolean[][] possibleMoves();

	/**
	 * Checks whether it is possible for a part to move to a certain position
	 * 
	 * @param position
	 * @return
	 */
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	/**
	 * Check if there is at least one possible movement for the part
	 * 
	 * @return
	 */
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
