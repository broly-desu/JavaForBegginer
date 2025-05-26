
public class RectIf extends MyFrame {
	public void run() {
		int x=30;
		int j=0;
		int i;
		for(i=0;i<=20;i++){
			setColor(j,j,j);
			fillRect(x,80,10,200);
			x+=20;
			j+=20;
		}
	}
}
