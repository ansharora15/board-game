//Create a class FastFlexible

public class FastFlexible extends FastPiece{
public FastFlexible(){
super();
}

public FastFlexible(String n1, String clr, Point pt){
//call super class constructor
super(n1, clr, pt);
}

//move method
public void move(String direction, int n){

if(direction.equals("up") && getPos().getY() - n >= 0){
setPos(new Point(getPos().getX(), getPos().getY()-n));
}
if(direction.equals("down") && getPos().getY() + n <= 7){
setPos(new Point(getPos().getX(), getPos().getY()+n));
}
if(direction.equals("left") && getPos().getX() - n >= 0){
setPos(new Point(getPos().getX()-n, getPos().getY()));
}
if(direction.equals("right") && getPos().getX() + n <= 7){
setPos(new Point(getPos().getX()+n, getPos().getY()));
}

}

public String toString(){
return super.toString()+"F";
}
}