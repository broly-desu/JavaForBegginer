
public class Animation extends MyFrame{
	public void run() {
		/*
		int y=100;
		int x=30;
		while (x<=170) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}
		while (x>=30) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			
			x-=5;
			sleep(0.1);
		}
		*/
		/*
		 * 5-1
		int y=170;
		int x=30;
		while (y>=60) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y-=5;
			sleep(0.1);
		}
		while (x<=200) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}
		*/
		/*
		5-2
		int y=50;
		int x=50;
		while (x<=500 && y<=500) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=10;
			y+=10;
			sleep(0.1);
		}
		while (x>=50) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			
			x-=10;
			sleep(0.1);
		}
		while (x<=500 && y>=50) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=10;
			y-=10;
			sleep(0.1);
		}
		while (x>=50) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=10;
			sleep(0.1);
		}
		*/
		
		/*
		 * 5-3
		int y=100;
		int x=30;
		for(int i=1;i<=3; i++) {
			while (x<=170) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=5;
				sleep(0.1);
			}
			while (x>=30) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				
				x-=5;
				sleep(0.1);
			}
		}
		*5-Ex
		int y=50;
		int x=50;
		while(true){
			while (x<=250) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+=5;
				sleep(0.1);
			}
			while (y<=250) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				
				y+=5;
				sleep(0.1);
			}
			while (x>=50) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-=5;
				sleep(0.1);
			}
			while (y>=50) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				
				y-=5;
				sleep(0.1);
			}
			
		}
		*/
		int x=50;
		int y=50;
		boolean hantei = true;
		while(true) {
			while (x<=150 && x>=50) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
				if(hantei) {
					x+=5;
				}
				else {
					x-=5;
				}
				sleep(0.1);
			}
			int yhantei = y+150;
			while (y<= yhantei) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,10,100);
			
				y+=5;
				sleep(0.1);
			}
			hantei = !hantei;
			if(hantei) {
				x+=5;
			}
			else {
				x-=5;
			}
		}
	}
}