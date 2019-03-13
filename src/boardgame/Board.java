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
	
	
	
	

}
