import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Person person;
    private Bus bus;
    private BusStop busStop;

    @Before
    public void before() {
        person = new Person();
        bus = new Bus("Narnia", 3);
        busStop = new BusStop("Underland");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void willNotAddPassengerIfNoRoomOnBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassengersFromBusStop(){
        busStop.addPerson(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.queueCount());
    }
}
