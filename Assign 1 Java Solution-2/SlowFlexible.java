//Craete a class SlowFlexible
public class SlowFlexible extends SlowPiece{
 public SlowFlexible(){
 super();
 }

 public SlowFlexible(String n1, String clr, Point pt){
 //call super class constructor
 super(n1, clr, pt);
 }

 //move method 
 public void move(String direction, int n){

	if(direction.equals("up") && getPos().getY() > 0){
		setPos(new Point(getPos().getX(), getPos().getY()-1));
	}
	if(direction.equals("down") && getPos().getY() < 7){
	setPos(new Point(getPos().getX(), getPos().getY()+1));;
	}
	if(direction.equals("left") && getPos().getX() > 0){
	setPos(new Point(getPos().getX()-1, getPos().getY()));
	}
	if(direction.equals("right") && getPos().getX() < 7){
	setPos(new Point(getPos().getX()+1, getPos().getY()));
	}
 }

	public String toString(){
		return super.toString()+"F";
	}
}
