//Create a class MoveCommands
import java.util.Scanner;

public class MoveCommands{
	public static Board board = new Board();

	public MoveCommands(){}
	//alloct Positions on board
	public static void allotPosition(String[] strCmd)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a name for the new piece:");
	String name = sc.nextLine();
	System.out.println("Input a colour for the new piece:");
	String colour = sc.nextLine();
	
	int xPos = Integer.parseInt(strCmd[1]);
	int yPos = Integer.parseInt(strCmd[2]);

	Point point = new Point(xPos-1, yPos-1);
	Piece piece = new SlowPiece(name, colour, point);
	
	//Check x and y cordinates
	if(xPos>=1 && yPos>=1 && xPos<=8 && yPos<=8){
	if(strCmd.length==3){
		piece = new SlowPiece(name, colour, point);
	}
	else if(strCmd.length==4 && strCmd[3].equals("flexible")){
		piece = new SlowFlexible(name, colour, point);
	}
	else if(strCmd.length>3 &&strCmd[3].equals("fast")){
		piece = new FastPiece(name, colour, point);
	if(strCmd.length>4 &&strCmd[4].equals("flexible")){
		piece = new FastFlexible(name, colour, point);
	}
	}
	board.addPieceToBoard(piece);
	}
	else {
		System.out.println("Error: cannot create piece");
	}
}

	//Convert command and invoke the movePiece method
	public static void move(String[] strCmd){
		String direction = strCmd[3];
		int xPos = Integer.parseInt(strCmd[1])-1;	
		int yPos = Integer.parseInt(strCmd[2])-1;

		if(strCmd.length==5){
			board.movePiece(board.getPiece(xPos, yPos), direction, xPos, yPos, Integer.parseInt(strCmd[4]));
		}
		
		else if(strCmd.length==4){
			board.movePiece(board.getPiece(xPos, yPos), direction, xPos, yPos, 1);
		}
	}

    //Show the board
	public static String showBoard(){
		return board.showBoard();
	}

	//show help menu
	public static String helpMenu(){
		return "\n"
		+ "Possible commands are as follows:\n"
		+ "create location [fast][flexible]: Creates a new piece.\n"
		+ "move location direction [spaces]: Moves a piece.\n"
		+ "print: Displays the board.\n"
		+ "help: Displays help.\n"
		+ "exit: Exits the program.\n";
	}
    
	//Exit from the program
	public static void exit(){
	System.out.println("Done.");
	System.exit(0);
	}
}
