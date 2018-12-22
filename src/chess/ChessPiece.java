package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	/**
	 * Increase moveCont
	 */
	public void increasemoveCount() {
		moveCount++;
	}

	/**
	 * Decrease moveCount
	 */
	public void decreasemoveCount() {
		moveCount--;
	}

	/**
	 * Checks whether an opposing part exists in a particular position
	 * 
	 * @param possition
	 * @return
	 */
	protected boolean isThereOpponentPiece(Position possition) {
		ChessPiece p = (ChessPiece) getBoard().piece(possition);
		return p != null && p.getColor() != color;
	}

}
