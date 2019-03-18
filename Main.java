package spo; 

class sport
{
	private int score; 

	private int player; 
	
	public int getscore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public int getplayer()
	{
		return player;
	}
	
	public void setplayer (int player)
	{ 
		this.player = player;
	}  
	
	public sport()
	{
		this(0,11);
	}

	public sport(int score, int player) {
		super();
		this.score = score;
		this.player = player;
	}

}

class soccer extends sport
{
	private boolean goalkeeper;

	public boolean getGoalkeeper() {
		return goalkeeper;
	}
	
	public soccer(int score, int player, boolean goalkeeper)
	{
		super(score, player);
		this.goalkeeper = goalkeeper;
		System.out.println("player(int score, int player");
	}
	public void pass()
	{
		
	}
	public void shoot()
	{
		
	}
}

class basketball extends sport
{
	private boolean center;

	public boolean getcenter() {
		return center;
	}
	
	public basketball(int score, int player, boolean center)
	{
		super(score, player)
		this.center = center;
		System.out.println("basketball(int score, int player");
	}
	public void pass()
	{
		
	}
	public void shoot()
	{
		
	}
}

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sport s = new sport(0, 22);
		sport b = new sport(0, 10);
	}

}
