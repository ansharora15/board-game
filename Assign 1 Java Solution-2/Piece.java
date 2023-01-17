//Create an abstract class
public abstract class Piece {
public String name;
public String colour;
public Point position;

public Piece(){

}

public Piece(String name, String colour, Point position){
this.name = name;
this.colour = colour;
this.position = position;
}

//get methods
public String getName(){
return this.name;
}

public String getColour(){
return this.colour;
}

public Point getPos(){
return this.position;
}

//set methods
public void setName(String name){
this.name = name;
}

public void setColour(String colour){
this.colour = colour;
}

public void setPos(Point position){
this.position = position;
}

//abstract method takes direction and int n, and to be defined in subclasses
public abstract void move(String direction, int n);

//toString method
public abstract String toString();
}

