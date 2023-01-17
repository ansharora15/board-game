//Create a class Board
public class Board {
	Piece[][] board;

	public Board(){
	board = new Piece[8][8];
	}
    //return Pieces
	public Piece[][] getBoard(){
		return board;
	}

	//get method
	public Piece getPiece(int xPos, int yPos){
		return board[xPos][yPos];
	}

	//set method
	public void setBoard(Piece[][] piece){
		board = piece;
	}

	//add piece to the board
	public void addPieceToBoard(Piece piece){
		if(board[piece.getPos().getX()][piece.getPos().getY()]==null){
			board[piece.getPos().getX()][piece.getPos().getY()] = piece;
		}
		else{
		System.out.println("Error: cannot be added to the board");
		}
	}

	//Display the board on console
	public String showBoard(){
	String dashes = "";
	for(int j=0;j<8;j++){
	dashes += "\n";
	for(int i=0;i<8;i++){
		if(board[i][j] != null){
			dashes += board[i][j].toString() + "\t";
		}
		else dashes += "-\t\t";
		}
	}
		return dashes;
}

	//move the piece	
	public void movePiece(Piece piece, String direction, int xPos, int yPos, int space){
		if(board[xPos][yPos]!=null){
			piece.move(direction, space);
		if(board[piece.getPos().getX()][piece.getPos().getY()]!=null || (piece.getPos().getX() == xPos && piece.getPos().getY()==yPos)){
		System.out.println("Error: cannot move the piece");
		}
		else{
			System.out.println("Piece at ("+ (xPos+1) +","+ (yPos+1) +") moved " + direction + " by " + space +" spaces") ;
			board[xPos][yPos]=null;
			addPieceToBoard(piece);
			}
		}
		else {
			System.out.println("Error: no piece at " + "(" + (xPos+1) + ", " + (yPos + 1) + ")");
			}
	}
}
