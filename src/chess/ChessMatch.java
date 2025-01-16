package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	// Atributo que representa o tabuleiro de xadrez
	private Board board;
	
	// Construtor que inicializa o tabuleiro com 8 linhas e 8 colunas (tabuleiro padrão de xadrez)
	public ChessMatch() {
		board = new Board(8, 8); // Cria um novo tabuleiro com 8x8
		initialSetup();
	}
	
	// Método que retorna uma matriz de ChessPiece representando todas as peças no tabuleiro
	public ChessPiece[][] getPieces() {
		// Cria uma nova matriz de ChessPiece com as mesmas dimensões do tabuleiro
		ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		// Itera por todas as posições do tabuleiro (linhas e colunas)
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				// Preenche a matriz 'mat' com as peças correspondentes do tabuleiro
				// A conversão (casting) é necessária porque o método Piece retorna uma peça genérica
				// enquanto estamos esperando uma peça específica de xadrez (ChessPiece)
				mat[i][j] = (ChessPiece) board.Piece(i, j); 
			}
		}
		
		// Retorna a matriz com as peças
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position (2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
