package boardgame;

public abstract class Piece {
   protected Position position;
   private Board board;
   
   
   public Piece(Board board) 
   {
	   this.board = board;
	   position = null; //n�o precisa colocar, pq por padr�o ja vai ser nulo
   }
    
   protected Board getBoard() 
   {
	   return board;
   }
   
  
   
   //meu tabuleiro n�o vai ser alterado, por isso n�o vamos precisar do SET apenas do GET

   public abstract boolean[][] possibleMoves();
   
   public boolean possibleMove(Position position) {
	   return possibleMoves()[position.getColumn()][position.getRow()];   
   }
   
   public boolean isThereAnyPossibleMove() {
	   boolean[][] mat = possibleMoves();
	   for(int i=0; i < mat.length; i++) {
		   for(int j = 0; j< mat.length; j++) {
		          if(mat[i][j] == true) {
		        	  return true;
		          }
		      }
		   }
		   return false;
	   }
   }




