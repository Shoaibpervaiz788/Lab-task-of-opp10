
interface Display {
    void show();
}


interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    public String aircraftType() {
        return "Passenger Jet";
    }

    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Passenger Capacity: " + calculateCapacity());
    }
}

class CargoPlane implements Aircraft {
    private double length;
    private double width;
    private final int conversionFactor = 2;

    public CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String aircraftType() {
        return "Cargo Plane";
    }

    public int calculateCapacity() {
        return (int)((length * width) / conversionFactor);
    }

    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Cargo Capacity (equivalent passengers): " + calculateCapacity());
    }
}


class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }

    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Luxury Seats: " + calculateCapacity());
    }
}


public class AirlineManagement {
    public static void main(String[] args) {
        Aircraft passengerJet = new PassengerJet(30, 6);
        Aircraft cargoPlane = new CargoPlane(50.0, 10.0);
        Aircraft privateJet = new PrivateJet(8);

        System.out.println("= Passenger Jet Info =");
        passengerJet.show();
        System.out.println();

        System.out.println("= Cargo Plane Info =");
        cargoPlane.show();
        System.out.println();

        System.out.println("= Private Jet Info =");
        privateJet.show();
    }
}
