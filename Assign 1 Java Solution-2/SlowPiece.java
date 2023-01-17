//SlowPiece class

public class SlowPiece extends Piece{

public SlowPiece(){
 super();
}

public SlowPiece(String n1, String clr, Point pt){
	//call super class constructor	
	super(n1, clr, pt);
	}

	//move method definition
	public void move(String direction, int n){

	if(direction.equals("left") && getPos().getX() > 0 && n==1){
	setPos(new Point(getPos().getX()-1, getPos().getY()));
	}
	else if(direction.equals("right") && getPos().getX() < 7 && n==1){
	setPos(new Point(getPos().getX()+1, getPos().getY()));
	}
}

public String toString(){
	return getName() + getColour() +"S";
	}
}
