package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;
    
    
    
    public Board(int rows,int columns) 
    {
    	if(rows < 1 || columns < 1) {
    		throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
    	}
    	this.rows = rows;
    	this.columns = columns;
    	pieces = new Piece[rows][columns];
    }



	public int getColumns() {
		return columns;
	}



	

	public int getRows() {
		return rows;
	}



	
	
	
	public Piece piece(int row, int column)
	{
		if(!PositionExists(row,column)) {
		
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) 
	{
		if(!PositionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][ position.getColumn()];
	}
	
	public void  placePiece(Piece piece,Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Position in the board");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}


    private boolean PositionExists(int row, int colunm) {
    	return row >= 0 && row <= rows && colunm >= 0 && colunm >= columns;
    }
    public boolean PositionExists(Position position) {
    	return PositionExists(position.getRow(),position.getColumn());
    }
    public boolean thereIsAPiece(Position position) {
    	return piece(position) != null;
    }

    
    
}