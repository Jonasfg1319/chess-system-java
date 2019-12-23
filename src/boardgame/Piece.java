package boardgame;

public class Piece {
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
}
