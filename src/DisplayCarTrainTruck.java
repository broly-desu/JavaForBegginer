import java.util.Vector;
public class DisplayCarTrainTruck extends MyFrame {
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,-5,0));
		vehicles.add(new Train(10,150,7,0));
		vehicles.add(new Train(10,200,-7,0));
		vehicles.add(new Truck(10,250,9,0));
		vehicles.add(new Truck(10,300,9,0));		
		
		while (true)
		{
				clear();
				for(int j=0; j<vehicles.size();j++) {
					vehicles.get(j).draw(this);
					vehicles.get(j).move();
					if (vehicles.get(j).x >= this.getWidth()){
						vehicles.get(j).x = 0;
					}
					else if(vehicles.get(j).x < 0) {
						vehicles.get(j).x = this.getWidth();
					}
				}
				sleep(0.1);
		}
	}
}
