import java.util.Vector;

public class FiveCar extends MyFrame {
	public void run() {
		Vector<Car> cars = new Vector<Car>();
		for(int i=1; i<6;i++) {
			cars.add(new Car(20,i*50,i,0));
		}
		while(true) {
		for(int i=0; i<30; i++) {
			clear();
			for(int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
				if(cars.get(j).x > 1900) {
					cars.get(j).x = 0;
				}
				cars.get(j).vx ++;
			}
			
			sleep(0.1);
		}
		}
	}
}
