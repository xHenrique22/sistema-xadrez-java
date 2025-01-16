package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	// Atributo que representa a cor da peça (ex: branca ou preta)
	private Color color;

	// Construtor que inicializa a peça de xadrez com o tabuleiro e a cor fornecidos
	public ChessPiece(Board board, Color color) {
		super(board); // Chama o construtor da classe pai (Piece) para inicializar o tabuleiro
		this.color = color; // Define a cor da peça
	}

	// Método que retorna a cor da peça de xadrez
	public Color getColor() {
		return color; // Retorna o valor do atributo 'color'
	}
}
