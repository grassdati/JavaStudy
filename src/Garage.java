
public class Garage {



		int taxiStorage = 0;
		int busStorage = 0;
		
		Taxi[] taxiRoom = new Taxi[6];
		Bus[] busRoom = new Bus[2];
		
		void inputCar(Taxi taxi) {
			
			taxiRoom[taxiStorage] = taxi;
			taxiStorage++;
			System.out.println("�ýû�������");
			
			
		}
		
		void inputCar(Bus bus) {
			
			busRoom[busStorage] = bus;
			busStorage++;
			System.out.println("���������̿�����");

		}


		
		

	}

