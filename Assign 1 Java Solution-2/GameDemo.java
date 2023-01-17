//Create a class GameDemo
import java.util.Scanner;

public class GameDemo {
	//start method
	public static void start()
	{
	Scanner sc = new Scanner(System.in);
	do{
	//Take input for command
	System.out.println("Enter a command (type help for details):");
	String cmdIn = sc.nextLine();
	//split the command into array of Strings
	String strCmd[] = cmdIn.split("\\s++");
	
	//check the command create
	if(strCmd[0].equals("create") && strCmd.length >= 3 && strCmd.length <= 5)
	{
	MoveCommands.allotPosition(strCmd);
	}
	//check the command move
	else if(strCmd[0].equals("move") && strCmd.length >= 4 && strCmd.length <= 5)
	{
	MoveCommands.move(strCmd);
	}
	//check the command print
	else if(strCmd[0].equals("print"))
	{
	System.out.println(MoveCommands.showBoard());
	}
	//check the command help
	else if(strCmd[0].equals("help"))
	{
	System.out.println(MoveCommands.helpMenu());
	}
	//check the command exit
	else if(strCmd[0].equals("exit"))
	{
	MoveCommands.exit();
	}
	else{
	System.out.println("Error: no piece at (" + strCmd[1]+","+strCmd[2]+")");
	}
 }while(true);	
}	

//main method
public static void main(String s[]){
	start();
	}
}//class closed