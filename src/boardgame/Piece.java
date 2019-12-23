package boardgame;

public class Piece {
   protected Position position;
   private Board board;
   
   public Piece(Board board) 
   {
	   this.board = board;
	   position = null; //não precisa colocar, pq por padrão ja vai ser nulo
   }
    
   protected Board getBoard() 
   {
	   return board;
   }
   
   //meu tabuleiro não vai ser alterado, por isso não vamos precisar do SET apenas do GET
}
