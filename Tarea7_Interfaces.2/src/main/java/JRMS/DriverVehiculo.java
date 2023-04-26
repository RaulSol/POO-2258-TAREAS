package JRMS;

public class DriverVehiculo {
    public static void main(String[] args) {
       System.out.println("----- CAMIÓN -----");
        Camion truck = new Camion("Diesel", 3.3, "Ford");
        System.out.println(truck);
        System.out.println(truck.encender());
        truck.transportar();
        truck.avanzar();
        truck.frenar();
        System.out.println(truck.apagar());

       System.out.println("----- MOTOCICLETA -----");
        Motocicleta moto = new Motocicleta(250,"Yamaha");
        System.out.println(moto);
        System.out.println(moto.encender());
        moto.avanzar();
        moto.caballito();
        moto.frenar();
        System.out.println(moto.apagar());
    }
}
