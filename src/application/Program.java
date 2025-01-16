package application;

import chess.ChessMatch;

public class Program {

	// Método principal (main) que inicia a execução do programa
	public static void main(String[] args) {

		// Cria uma instância de ChessMatch, que representa uma partida de xadrez
		ChessMatch chessMatch = new ChessMatch();
		
		// Chama o método printBoard da classe UI para exibir o tabuleiro da partida de xadrez
		// O método getPieces retorna a matriz de peças de xadrez que é passada para o método printBoard
		UI.printBoard(chessMatch.getPieces());
	}
}

