package boardgame;

public class Position {
	
	// Atributos que representam a linha e a coluna da posição no tabuleiro
	private int row;    // Linha da posição
	private int column; // Coluna da posição
	
	// Construtor que inicializa a posição com valores específicos de linha e coluna
	public Position(int row, int column) {
		this.row = row;     // Atribui o valor da linha à variável 'row'
		this.column = column; // Atribui o valor da coluna à variável 'column'
	}

	// Método que retorna o valor da linha da posição
	public int getRow() {
		return row; // Retorna o valor da linha
	}

	// Método que define o valor da linha da posição
	public void setRow(int row) {
		this.row = row; // Define o valor da linha
	}

	// Método que retorna o valor da coluna da posição
	public int getColumn() {
		return column; // Retorna o valor da coluna
	}

	// Método que define o valor da coluna da posição
	public void setColumn(int column) {
		this.column = column; // Define o valor da coluna
	}
	
	// Método que retorna a representação em formato de string da posição (linha, coluna)
	@Override
	public String toString() {
		return row + ", " + column; // Retorna a posição como uma string no formato "linha, coluna"
	}
}

