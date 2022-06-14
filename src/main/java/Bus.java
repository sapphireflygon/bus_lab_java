import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void pickUp(BusStop busStop) {
        if (busStop.queueCount() > 0) {
            Person newPassenger = busStop.removePerson();
            this.addPassenger(newPassenger);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }
}
