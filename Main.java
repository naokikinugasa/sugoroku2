import java.io.*;

public class Main{
	public static void main(String[] args){
		Sugoroku sugoroku = new Sugoroku();
		sugoroku.scoreinit();

		UserInput userinput = new UserInput();
		sugoroku.Goallength = userinput.Input(sugoroku.Goallength,20,39);
		/*
		sugoroku.PlayerNum = userinput.Input(sugoroku.PlayerNum,1,99);

		Player[] player = new Player[sugoroku.PlayerNum];
		for (int i=0; i<sugoroku.PlayerNum; i++) {
			player[i] = new Player("name");
		}

		while(Player.goalcount < sugoroku.PlayerNum){
			for (int i=0; i<sugoroku.PlayerNum; i++) {
				player[i].play("over");
			}
		}
		*/
		
		
		Player player1 = new Player("naoki");
		Player player2 = new Player("gassan");
		
		while(!player1.goal || !player2.goal){
			player1.play("just");
			player2.play("just");
		}
		
		//優勝表示
		/*
		int winner = Math.max(player1.score, player2.score);
		System.out.println("winner:"+winner);
		*/

	}


}