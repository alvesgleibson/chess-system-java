package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] piecesUIListPrintBorad) {
		for (int i = 0; i < piecesUIListPrintBorad.length; i++) {
			System.out.print((8 - i)+" ");
			for (int j = 0; j < piecesUIListPrintBorad.length; j++) {
				printPiece(piecesUIListPrintBorad[i][j]);
			}
			System.out.println();
		}
	System.out.println("  a b c d e f g h");
	}
	
	public static void printPiece(ChessPiece pieceUIReceberPrintPiece) {
		if(pieceUIReceberPrintPiece == null) {
			System.out.print("-");
		}else System.out.print(pieceUIReceberPrintPiece);
		
		System.out.print(" ");
	}
	
	
	
	
}
