package DesarrolloEjemplos;

public class VehicleTest {

	public static void main(String[] args) {
		
		  Vehicle bike = new Vehicle();
	        Vehicle car = new Vehicle();

	        bike.setNumberOfWheels(2);
	        bike.setColor("rojo");

	        int bikeWheels = bike.getNumberOfWheels();
	        String bikeColor = bike.getColor();

	        car.setNumberOfWheels(4);
	        car.setColor("verde");

	        int carWheels = car.getNumberOfWheels();

	        String carColor = car.getColor();
	        System.out.println("Objeto Bicicleta - Llantas: " + bikeWheels + ", Color: " + bikeColor);
	        System.out.println("Objeto Carro - Llantas: " + carWheels + ", Color: " + carColor);
	}

}
