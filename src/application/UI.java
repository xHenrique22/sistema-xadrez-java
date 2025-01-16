package application;

import chess.ChessPiece;

// Classe responsável pela interface do usuário (UI), focada na exibição do tabuleiro de xadrez
public class UI {

	// Método estático que imprime o tabuleiro de xadrez no console
	public static void printBoard(ChessPiece[][] pieces) {
		// Itera sobre as linhas do tabuleiro (peças)
		for(int i = 0; i < pieces.length; i++) {
			// Imprime o número da linha (de 8 a 1, representando as linhas do tabuleiro de xadrez)
			System.out.print((8 - i) + " ");
			
			// Itera sobre as colunas do tabuleiro
			for (int j = 0; j < pieces.length; j++) {
				// Chama o método para imprimir cada peça na posição (i, j)
				printPiece(pieces[i][j]);
			}
			// Imprime uma nova linha após cada linha do tabuleiro
			System.out.println();
		}
		
		// Imprime as coordenadas das colunas (a-h) na parte inferior do tabuleiro
		System.out.println("  a b c d e f g h ");
	}
	
	// Método auxiliar que imprime uma peça de xadrez
	private static void printPiece(ChessPiece piece) {
		// Se a posição não tiver peça (null), imprime um traço
		if (piece == null) {
			System.out.print("-");
		}
		else {
			// Caso contrário, imprime a peça (representada pelo método toString() da classe ChessPiece)
			System.out.print(piece);
		}
		// Imprime um espaço após a peça
		System.out.print(" ");
	}
}
