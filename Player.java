public class Player {

	public String name;
	public int loc = 0;
	public boolean goal = false;
    public int me;
    public int score;
    public int ranking;
    public String rule;
    public static int goalcount;

    Sugoroku sugoroku = new Sugoroku();

	public Player (String name){
		this.name = name;
	}
	public void play(String rule){
		if (!goal) {
			this.rule = rule;
			me = (int)Math.floor(Math.random()*sugoroku.Dice) + 1;
			//偶奇判定
			oddoreven();
			
			//ゴールのルール
			if (rule == "over") {
				over();
			}else if(rule == "just"){
				just();
			}

			if (goal){
				return;
			}
			
			score += sugoroku.score[loc];
			System.out.println(this.name+":"+me+"が出ました。マスは"+loc+"(score:"+sugoroku.score[loc]+")score:"+score);		
		}
		
	}


	private void over(){
		if (loc >= sugoroku.Goallength) {
			goal = true;
			goalshow();
		}
	}
	private void just(){
		if (loc > sugoroku.Goallength) {
			int overnum = loc - sugoroku.Goallength;
			loc = sugoroku.Goallength - overnum;
		}else if(loc == sugoroku.Goallength){
			goal = true;
			goalshow();
		}
	}

	private void oddoreven(){
		if (me%2 == 0) {
			loc += me;
		}else if(loc >= me){
			loc -= me;
		}else{

		}
	}
	private void goalshow(){
		ranking = sugoroku.allrank;
		score += 2/ranking;
		System.out.println(this.name+":"+me+"が出ました。goal");
		System.out.println("rank:"+ranking+"score:"+score);
		goal = true;
		sugoroku.allrank++;
		goalcount++;
	}

}