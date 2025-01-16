package boardgame;

public class Piece {

	// Variável que armazena a posição da peça no tabuleiro
	protected Position position;
	
	// Variável que armazena o tabuleiro onde a peça está localizada
	private Board board;
	
	// Construtor da classe Piece, que inicializa o tabuleiro onde a peça está localizada
	// e define a posição inicial como null (não definida)
	public Piece(Board board) {
		this.board = board;  // Atribui o tabuleiro ao atributo 'board'
		position = null;     // Inicializa a posição da peça como 'null'
	}

	// Método para obter o tabuleiro onde a peça está localizada
	protected Board getBoard() {
		return board;  // Retorna o tabuleiro associado à peça
	}
}

