package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

// Classe que representa a peça Rei no jogo de xadrez
public class King extends ChessPiece {

    // Construtor da classe King
    // Recebe o tabuleiro e a cor da peça como parâmetros
    public King(Board board, Color color) {
        // Chama o construtor da classe base ChessPiece
        super(board, color);
    }

    // Sobrescreve o método toString para representar o Rei
    @Override
    public String toString() {
        // Retorna "K" como a representação textual do Rei
        return "K";
    }
}
