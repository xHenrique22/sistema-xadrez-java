package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

// Classe que representa a peça Torre no jogo de xadrez
public class Rook extends ChessPiece {

    // Construtor da classe Rook
    // Recebe o tabuleiro e a cor da peça como parâmetros
    public Rook(Board board, Color color) {
        // Chama o construtor da classe base ChessPiece
        super(board, color);
    }

    // Sobrescreve o método toString para representar a Torre
    @Override
    public String toString() {
        // Retorna "R" como a representação textual da Torre
        return "R";
    }
}

