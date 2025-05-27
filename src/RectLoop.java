
public class RectLoop extends MyFrame{
	public void run() {
		int x = 30;
		int y = 0;
		for(int i = 0; i<20;i++)
		{
			setColor(y,y,y);
			fillRect(x,80,10,100);
			x += 20;
			if(i<=10) {
				y += 20;
			}
			else {
				y -= 20;
			}
		}
	}
}
