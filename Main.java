import java.io.*;

public class Main{
	public static void main(String[] args){

		UserInput userinput = new UserInput();
		Player.Goallength = userinput.Input(Player.Goallength,20,39);
		Player.Dice = userinput.Input(Player.Dice,0,100);
		
		Player player1 = new Player("naoki");
		Player player2 = new Player("ibuki");
		
		while(!player1.goal || !player2.goal){
			player1.play("over");
			player2.play("just");
		}
		

	}



}