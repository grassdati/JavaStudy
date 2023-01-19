
public class Garage {



		int taxiStorage = 0;
		int busStorage = 0;
		
		Taxi[] taxiRoom = new Taxi[6];
		Bus[] busRoom = new Bus[2];
		
		void inputCar(Taxi taxi) {
			
			taxiRoom[taxiStorage] = taxi;
			taxiStorage++;
			System.out.println("택시산지직송");
			
			
		}
		
		void inputCar(Bus bus) {
			
			busRoom[busStorage] = bus;
			busStorage++;
			System.out.println("버스오라이오라이");

		}


		
		

	}

