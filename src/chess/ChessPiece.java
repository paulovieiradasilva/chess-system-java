package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
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
