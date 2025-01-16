package boardgame;

// Classe que representa o tabuleiro do jogo
public class Board {

	// Variáveis que armazenam as dimensões do tabuleiro
	private int rows;    // Número de linhas do tabuleiro
	private int columns; // Número de colunas do tabuleiro

	// Matriz que armazena as peças no tabuleiro
	private Piece[][] pieces;
	
	// Construtor que inicializa o tabuleiro com o número de linhas e colunas especificados
	public Board(int rows, int columns) {
		this.rows = rows;  // Atribui o valor de linhas
		this.columns = columns; // Atribui o valor de colunas
		pieces = new Piece [rows][columns]; // Cria a matriz de peças com as dimensões fornecidas
	}

	// Método para obter o número de linhas do tabuleiro
	public int getRows() {
		return rows; // Retorna o número de linhas
	}

	// Método para definir o número de linhas do tabuleiro
	public void setRows(int rows) {
		this.rows = rows; // Define o número de linhas
	}

	// Método para obter o número de colunas do tabuleiro
	public int getColumns() {
		return columns; // Retorna o número de colunas
	}

	// Método para definir o número de colunas do tabuleiro
	public void setColumns(int columns) {
		this.columns = columns; // Define o número de colunas
	}
	
	// Método para obter a peça em uma posição específica (por linha e coluna)
	public Piece Piece(int row, int column) {
		return pieces [row][column]; // Retorna a peça na posição especificada
	}
	
	// Método para obter a peça em uma posição específica (por objeto Position)
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()]; // Retorna a peça usando as coordenadas da posição
	}
	
	// Método para colocar uma peça no tabuleiro em uma posição específica
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()]  = piece; // Coloca a peça na posição especificada
		piece.position = position; // Atualiza a posição da peça para refletir a posição atual no tabuleiro
	}
}
