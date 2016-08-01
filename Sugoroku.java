public class Sugoroku{
	public static int Goallength = 30;
	public static int Dice = 8;
	public static int[] score = new int[30];
	public static int allrank = 1;
	public static int PlayerNum = 4;
	public Sugoroku(){

	}
	public static void scoreinit(){
		score[0] = 0;
		for (int i=1; i<30; i++) {
			score[i] = (int)Math.floor(Math.random()*10) + 1;
		}
	}
	public static String getName(int obj){
		if (obj == Goallength) {
			return "マス数";
		}else if(obj == Dice){
			return "サイコロ数";
		}else if(obj == PlayerNum){
			return "プレイヤー数";
		}else{
			return null;
		}
	}
}