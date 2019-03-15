package boardgame;

public class Board {
	private Integer rows;
	private int columns;
	private Piece[][] pices;
	
	public Board(Integer rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pices = new Piece [rows][columns]; 
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int columns) {
		return pices[row][columns];
	}
	
	public Piece piece(Position position) {
		return pices[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pices[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	

}
