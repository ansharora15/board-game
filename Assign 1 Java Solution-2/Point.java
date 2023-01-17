//Create a Point class for coordinates
public class Point {
private int x;
private int y;

public Point(){
}

public Point(int x, int y){
this.x = x;
this.y = y;
}

//get methods
public int getX(){
return x;
}

public int getY(){
return y;
}

//set methods
public void setX(int x){
this.x = x;
}

public void setY(int y){
this.y = y;
}

//toString method
public String toString(){
return "(" + getX() + ", " +getY() + ")";
}
}
