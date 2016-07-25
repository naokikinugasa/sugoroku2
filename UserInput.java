import java.io.*;

public class UserInput{
	public UserInput(){

	}
	public static int Input(int obj,int left,int right){
		try{
			String objname = Player.getName(obj);
			System.out.println(objname+"を入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			obj = Integer.parseInt(str);
			System.out.println(obj+"が入力されました");
			//入力値の条件
			while (obj < left || right < obj) {
				System.out.println(left+"以上"+right+"以下で入力してください。");
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				obj = Integer.parseInt(str);			
			}
		}
		catch(IOException e){
			System.out.println("error");
		}
		return obj;
	}
}