public class Player {
	public static int Goallength = 30;
	public static int Dice = 6;
	public static int player = 2;
	public String name;
	public int loc = 0;
	public boolean goalConditions = false;
	public boolean goal = false;
    public int me;
    public int overnum;

    public String rule;

	public Player (String name){
		this.name = name;
	}
	public void play(String rule){
		this.rule = rule;
		me = (int)Math.floor(Math.random()*Dice) + 1;
		loc += me;

		//ゴールのルール
		if (rule == "over") {
			over();
		}else if(rule == "just"){
			just();
		}

		if(goalConditions && !goal){
			System.out.println(this.name+"は"+me+"が出ました。goal");
			goal = true;
		}else if(!goal){
			System.out.println(this.name+"は"+me+"が出ました。マスは"+loc+"です。");
		}
		
	}


	private void over(){
		if (loc >= Goallength) {
			goalConditions = true;
		}
	}
	private void just(){
		if (loc > Goallength) {
			overnum = loc - Goallength;
			loc = Goallength - overnum;
		}else if(loc == Goallength){
			goalConditions = true;
		}
	}

	public static String getName(int obj){
		if (obj == Goallength) {
			return "マス数";
		}else if(obj == Dice){
			return "サイコロ数";
		}else{
			return null;
		}
	}

}